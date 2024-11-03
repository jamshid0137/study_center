package com.backend.studycenter.common.controller.studycenter;

import com.backend.studycenter.common.controller.person.InterviewController;
import com.backend.studycenter.common.dto.course.LessonDTO;
import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.person.StudentDTO;
import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.mapper.StudyCenter.FilialMapper;
import com.backend.studycenter.common.mapper.course.LessonMapper;
import com.backend.studycenter.common.mapper.education.GroupMapper;
import com.backend.studycenter.common.mapper.person.StudentMapper;
import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.studycenter.Filial;
import com.backend.studycenter.common.model.util.util;
import com.backend.studycenter.common.service.course.LessonService;
import com.backend.studycenter.common.service.education.GroupService;
import com.backend.studycenter.common.service.studycenter.FilialService;
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
public class FilialController {
    private final Logger logger = LoggerFactory.getLogger(InterviewController.class);
    @Autowired
    private FilialService filialService;
    @Autowired
    private GroupService groupService;

    @Operation(summary = "Get all filials")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the filials",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = FilialDTO.class)))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Filial not found",
                    content = @Content)})
    @GetMapping(value = "/api/v1/filials")
    public ResponseEntity<ArrayList<FilialDTO>> getFilials() {
        ArrayList<Filial> filials = filialService.getFilials();
        ArrayList<FilialDTO> filialDTOs = new ArrayList<>();
        for (Filial filial : filials) {
            filialDTOs.add(FilialMapper.INSTANCE.toDTO(filial));
        }
        if (filialDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(filialDTOs);
        }
    }




    @Operation(summary = "Get a filial by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the filial",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = FilialDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Filial not found",
                    content = @Content)})

    @GetMapping(value = "/api/v1/filials/{id}")
    public ResponseEntity<FilialDTO> getFilialById(@PathVariable(name = "id") Long filialId) throws EntityNotFoundException {
        FilialDTO filialDTO = FilialMapper.INSTANCE.toDTO(filialService.getFilialById(filialId));
        if (filialDTO == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(filialDTO);
        }
    }


    @Operation(summary = "Adding a filial")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Added the filial",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = FilialDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Filial not found",
                    content = @Content)})

    @PostMapping(value = "/api/v1/filials", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FilialDTO> addFilial(@RequestBody FilialDTO filialDTO) {
        try {
            return ResponseEntity.ok(FilialMapper.INSTANCE.toDTO(filialService.addFilial(filialDTO)));
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    @Operation(summary = "Editing a filial by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Edited the filial",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = FilialDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Filial not found",
                    content = @Content)})

    @PutMapping(value = "/api/v1/filials/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FilialDTO> updateFilial(@RequestBody FilialDTO filialDTO, @PathVariable(name = "id") Long filialId) throws EntityNotFoundException {
        try {
            return ResponseEntity.ok(FilialMapper.INSTANCE.toDTO(filialService.updateFilial(filialDTO, filialId)));
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }

    @Operation(summary = "Deleting a filial by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Deleted a filial",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = FilialDTO.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Filial not found",
                    content = @Content)})

    @DeleteMapping(value = "/api/v1/filials/{id}")
    public ResponseEntity<Void> deleteFilial(@PathVariable(name = "id") Long filialId) throws EntityNotFoundException {
        try {
            filialService.deleteFilial(filialId);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            logger.error("Issue is happened in method " + util.getMethodName(), e);
            return ResponseEntity.internalServerError().build();
        }
    }



    //GroupService groupService=new GroupService();
    @PostMapping(value = "/api/v1/filials/{filialId}/add-group/{groupId}")
    public ResponseEntity<FilialDTO> addGroupToFilial(HttpServletRequest request, @PathVariable(name = "filialId") Long filialId, @PathVariable(name = "groupId") Long groupId) throws EntityNotFoundException {
        FilialDTO filialDTO = FilialMapper.INSTANCE.toDTO(filialService.getFilialById(filialId));
        GroupDTO groupDTO = GroupMapper.INSTANCE.toDTO(groupService.getGroupById(groupId));
        if (filialDTO == null || groupDTO == null) {
            return ResponseEntity.notFound().build();
        }
        List<GroupDTO> groupDTOs = filialDTO.getGroupDTOs();
        if (!groupDTOs.contains(groupDTO) || groupDTOs.isEmpty()) {
            groupDTOs.add(groupDTO);
            filialDTO.setGroupDTOs(groupDTOs);
            filialService.updateFilial(filialDTO, filialId);
            return ResponseEntity.ok(filialDTO);
        } else {
            logger.error("Issue is happened in method " + util.getMethodName() + ". With URI: " + util.getFullUri(request));
            return ResponseEntity.internalServerError().build();
        }
    }
}

