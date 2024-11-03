package com.backend.studycenter.common.controller.studycenter;

//public class MainCenterController {








import com.backend.studycenter.common.controller.person.InterviewController;
import com.backend.studycenter.common.dto.course.LessonDTO;
import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.person.StudentDTO;
import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.dto.studycenter.MainCenterDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.mapper.StudyCenter.FilialMapper;
import com.backend.studycenter.common.mapper.StudyCenter.MainCenterMapper;
import com.backend.studycenter.common.mapper.course.LessonMapper;
import com.backend.studycenter.common.mapper.education.GroupMapper;
import com.backend.studycenter.common.mapper.person.StudentMapper;
import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.studycenter.Filial;
import com.backend.studycenter.common.model.studycenter.MainCenter;
import com.backend.studycenter.common.model.util.util;
import com.backend.studycenter.common.service.course.LessonService;
import com.backend.studycenter.common.service.education.GroupService;
import com.backend.studycenter.common.service.studycenter.FilialService;
import com.backend.studycenter.common.service.studycenter.MainCenterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.PutMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;








@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class MainCenterController {
    private final Logger logger = LoggerFactory.getLogger(InterviewController.class);
    @Autowired
    private MainCenterService mainCenterService;
    @Autowired
    private GroupService groupService;

    @Autowired
    private FilialService filialService;

    @Operation(summary = "Get mainCenter")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the mainCenter",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = MainCenterDTO.class)))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "MainCenter not found",
                    content = @Content)})
    @GetMapping(value = "/api/v1/mainCenter")
    public ResponseEntity<ArrayList<MainCenterDTO>> getMainCenter() {
        ArrayList<MainCenter> mainCenters = mainCenterService.getMainCenter();
        ArrayList<MainCenterDTO> mainCenterDTOs = new ArrayList<>();
        for (MainCenter mainCenter : mainCenters) {
            mainCenterDTOs.add(MainCenterMapper.INSTANCE.toDTO(mainCenter));
        }
        if (mainCenterDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(mainCenterDTOs);
        }
    }




    @Operation(summary = "Get a mainCenter by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the mainCenter",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MainCenterDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "MainCenter not found",
                    content = @Content)})

    @GetMapping(value = "/api/v1/mainCenter/{id}")
    public ResponseEntity<MainCenterDTO> getMainCenterById(@PathVariable(name = "id") Long mainCenterId) throws EntityNotFoundException {
        MainCenterDTO mainCenterDTO = MainCenterMapper.INSTANCE.toDTO(mainCenterService.getMainCenterById(mainCenterId));
        if (mainCenterDTO == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(mainCenterDTO);
        }
    }






    @Operation(summary = "Adding a mainCenter")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Added the mainCenter",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MainCenterDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "MainCenter not found",
                    content = @Content)})

    @PostMapping(value = "/api/v1/mainCenter", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MainCenterDTO> addMainCenter(@RequestBody MainCenterDTO mainCenterDTO) {
        try {
            return ResponseEntity.ok(MainCenterMapper.INSTANCE.toDTO(mainCenterService.addMainCenter(mainCenterDTO)));
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    @Operation(summary = "Editing a mainCenter by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Edited the mainCenter",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MainCenterDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "MainCenter not found",
                    content = @Content)})

    @PutMapping(value = "/api/v1/mainCenter/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MainCenterDTO> updateMainCenter(@RequestBody MainCenterDTO mainCenterDTO, @PathVariable(name = "id") Long mainCenterId) throws EntityNotFoundException {
        try {
            return ResponseEntity.ok(MainCenterMapper.INSTANCE.toDTO(mainCenterService.updateMainCenter(mainCenterDTO, mainCenterId)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    @Operation(summary = "Deleting a mainCenter by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deleted a mainCenter",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = MainCenterDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "MainCenter not found",
                    content = @Content)})

    @DeleteMapping(value = "/api/v1/mainCenter/{id}")
    public ResponseEntity<Void> deleteMainCenter(@PathVariable(name = "id") Long mainCenterId) throws EntityNotFoundException {
        try {
            mainCenterService.deleteMainCenter(mainCenterId);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }




    //student----group
    //group------mainCenter

    @PostMapping(value = "/api/v1/mainCenter/{mainCenterId}/add-group/{groupId}")
    public ResponseEntity<MainCenterDTO> addGroupToMainCenter(HttpServletRequest request, @PathVariable(name = "mainCenterId") Long mainCenterId, @PathVariable(name = "groupId") Long groupId) throws EntityNotFoundException {
        MainCenterDTO mainCenterDTO = MainCenterMapper.INSTANCE.toDTO(mainCenterService.getMainCenterById(mainCenterId));
        GroupDTO groupDTO = GroupMapper.INSTANCE.toDTO(groupService.getGroupById(groupId));
        if (mainCenterDTO == null || groupDTO == null) {
            return ResponseEntity.notFound().build();
        }
        List<GroupDTO> groupDTOs = mainCenterDTO.getGroupDTOs();
        if (!groupDTOs.contains(groupDTO) || groupDTOs.isEmpty()) {
            groupDTOs.add(groupDTO);
            mainCenterDTO.setGroupDTOs(groupDTOs);
            mainCenterService.updateMainCenter(mainCenterDTO, mainCenterId);
            return ResponseEntity.ok(mainCenterDTO);
        } else {
            logger.error("Issue is happened in method " + util.getMethodName() + ". With URI: " + util.getFullUri(request));
            return ResponseEntity.internalServerError().build();
        }
    }

    @PostMapping(value = "/api/v1/mainCenter/{mainCenterId}/add-filial/{filialId}")
    public ResponseEntity<MainCenterDTO> addFilialToMainCenter(HttpServletRequest request, @PathVariable(name = "mainCenterId") Long mainCenterId, @PathVariable(name = "filialId") Long filialId) throws EntityNotFoundException {
        MainCenterDTO mainCenterDTO = MainCenterMapper.INSTANCE.toDTO(mainCenterService.getMainCenterById(mainCenterId));
        FilialDTO filialDTO = FilialMapper.INSTANCE.toDTO(filialService.getFilialById(filialId));
        if (mainCenterDTO == null || filialDTO == null) {
            return ResponseEntity.notFound().build();
        }
        List<FilialDTO> filialDTOs = mainCenterDTO.getFilialDTOs();
        if (!filialDTOs.contains(filialDTO) || filialDTOs.isEmpty()) {
            filialDTOs.add(filialDTO);
            mainCenterDTO.setFilialDTOs(filialDTOs);
            mainCenterService.updateMainCenter(mainCenterDTO, mainCenterId);
            return ResponseEntity.ok(mainCenterDTO);
        } else {
            logger.error("Issue is happened in method " + util.getMethodName() + ". With URI: " + util.getFullUri(request));
            return ResponseEntity.internalServerError().build();
        }
    }



    //ikkidona funksiya qo'shish kerak
    //addGroupToMainCenter
    //addFilialToMainCenter
}





