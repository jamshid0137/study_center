package com.backend.studycenter.common.mapper.StudyCenter;
/*
public interface FilialMapper {

 }



//package com.backend.studycenter.common.mapper.course;

import com.backend.studycenter.common.dto.course.CourseDTO;
import com.backend.studycenter.common.dto.course.LessonDTO;
import com.backend.studycenter.common.dto.course.TechnologyDTO;
import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.person.TeacherDTO;
import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.model.course.Course;
import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.course.Technology;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.person.Teacher;
import com.backend.studycenter.common.model.studycenter.Filial;

import java.util.ArrayList;
import java.util.List;

public class FilialMapper {
    public static FilialDTO toDTO(Filial filial) {
        FilialDTO dto = new FilialDTO();
        dto.setId(filial.getId());
        dto.setName(filial.getName());
        dto.setDescription(filial.getDescription());



        List<GroupDTO> groupDTOs = new ArrayList<>();
        for (Group group : filial.getGroups()) {
            GroupDTO groupDTO = new GroupDTO();

            groupDTO.setId(group.getId());
            groupDTO.setName(group.getName());
            groupDTO.setDescription(group.getDescription());

            /*List<TeacherDTO>teacherDTOs=new ArrayList<>();
            TeacherDTO teacherDTO=new TeacherDTO();
            Teacher teacher=new Teacher();
            teacherDTO.setId(teacher.getId());
            teacherDTO.setName(teacher.getName());
            teacherDTO.setDescription(teacher.getDescription());
            teacherDTOs.add(teacherDTO);
            groupDTO.setTeacherDTO(group.);*/
 /*           groupDTOs.add(groupDTO);
        }

        dto.setGroupDTOs(groupDTOs);
        /*TeacherDTO teacherDTO=new TeacherDTO();
        for(Teacher teacher: group.getCourse().getTeachers()){
        teacherDTO.setId(teacher.getId());
        teacherDTO.setName(teacher.getName());
        teacherDTO.setDescription(teacher.getDescription());
        teacherDTO.setAddress(teacher.getAddress());
        teacherDTO.setDateOfBirth(teacher.getDateOfBirth());
        teacherDTO.setDateOfRegister(teacher.getDateOfRegister());
        teacherDTO.setPhone(teacher.getPhone());
        teacherDTO.setEmail(teacher.getEmail());
        teacherDTO.setTelegramUserName(teacher.getTelegramUserName());
        teacherDTO.setSpecialization(teacher.getSpecialization());}*/

        /*List<TechnologyDTO> technologyDTOs = new ArrayList<>();
        for (Technology technology : course.getTechnologies()) {
            TechnologyDTO technologyDTO = new TechnologyDTO();
            technologyDTO.setId(technology.getId());
            technologyDTO.setName(technology.getName());
            technologyDTO.setDescription(technology.getDescription());
            technologyDTOs.add(technologyDTO);
        }
        */
       /*Group group=new Group();
        List<TeacherDTO>teacherDTOs=new ArrayList<>();
        for (Teacher teacher : group.getCourse().getTeachers()) {
            TeacherDTO teacherDTO = new TeacherDTO();
            teacherDTO.setId(teacher.getId());
            teacherDTO.setName(teacher.getName());
            teacherDTO.setDescription(teacher.getDescription());
            teacherDTOs.add(teacherDTO);
            //groupDTOs.add(teacherDTOs);
        }
        groupDTOs.add(teacherDTOs);
        //dto.setTeacherDTO(teacherDTOs);*/
        /*Group group=new Group();
        List<TeacherDTO> teacherDTOs = new ArrayList<>();
        for (Teacher teacher : group.getTeachers()) {
            TeacherDTO teacherDTO = new TeacherDTO();
            teacherDTO.setId(teacher.getId());
            teacherDTO.setName(teacher.getName());
            teacherDTO.setDescription(teacher.getDescription());
            teacherDTOs.add(teacherDTO);
        }*/
/*
        return dto;
    }

    public static Filial toModel(FilialDTO dto) {
        Filial filial = new Filial();
        filial.setId(dto.getId());
        filial.setName(dto.getName());
        filial.setDescription(dto.getDescription());


        List<Group> groups = new ArrayList<>();
        for (GroupDTO groupDTO : dto.getGroupDTOs()) {
            Group group = new Group();
            group.setId(groupDTO.getId());
            group.setName(groupDTO.getName());
            group.setDescription(groupDTO.getDescription());
            groups.add(group);
        }
        filial.setGroups(groups);

       /* List<Technology> technologies = new ArrayList<>();
        for (TechnologyDTO technologyDTO : dto.getTechnologyDTOs()) {
            Technology technology = new Technology();
            technology.setId(technologyDTO.getId());
            technology.setName(technologyDTO.getName());
            technology.setDescription(technologyDTO.getDescription());
            technologies.add(technology);
        }
        course.setTechnologies(technologies);*/
/*
        return filial;
    }

    public static Filial toModel(FilialDTO dto, Filial filial) {
        filial.setName(dto.getName());
        filial.setDescription(dto.getDescription());


        List<Group> groups = new ArrayList<>();
        for (GroupDTO groupDTO : dto.getGroupDTOs()) {
            Group group = new Group();
            group.setId(groupDTO.getId());
            group.setName(groupDTO.getName());
            group.setDescription(groupDTO.getDescription());
            groups.add(group);
        }
        filial.setGroups(groups);

        /*List<Technology> technologies = new ArrayList<>();
        for (TechnologyDTO technologyDTO : dto.getTechnologyDTOs()) {
            Technology technology = new Technology();
            technology.setId(technologyDTO.getId());
            technology.setName(technologyDTO.getName());
            technology.setDescription(technologyDTO.getDescription());
            technologies.add(technology);
        }
        course.setTechnologies(technologies);*/

  /*      return filial;
    }
}

*/