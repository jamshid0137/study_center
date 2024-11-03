package com.backend.studycenter.common.mapper.person;

import com.backend.studycenter.common.dto.person.TeacherDTO;
import com.backend.studycenter.common.model.person.Teacher;
import java.util.ArrayList;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherDTO toDTO(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setId( teacher.getId() );
        teacherDTO.setName( teacher.getName() );
        teacherDTO.setDescription( teacher.getDescription() );
        teacherDTO.setAddress( teacher.getAddress() );
        teacherDTO.setDateOfBirth( teacher.getDateOfBirth() );
        teacherDTO.setDateOfRegister( teacher.getDateOfRegister() );
        teacherDTO.setPhone( teacher.getPhone() );
        teacherDTO.setEmail( teacher.getEmail() );
        teacherDTO.setTelegramUserName( teacher.getTelegramUserName() );
        teacherDTO.setSpecialization( teacher.getSpecialization() );

        return teacherDTO;
    }

    @Override
    public ArrayList<TeacherDTO> toDTO(ArrayList<Teacher> teachers) {
        if ( teachers == null ) {
            return null;
        }

        ArrayList<TeacherDTO> arrayList = new ArrayList<TeacherDTO>();
        for ( Teacher teacher : teachers ) {
            arrayList.add( toDTO( teacher ) );
        }

        return arrayList;
    }

    @Override
    public Teacher toModel(TeacherDTO teacherDTO) {
        if ( teacherDTO == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        teacher.setId( teacherDTO.getId() );
        teacher.setName( teacherDTO.getName() );
        teacher.setDescription( teacherDTO.getDescription() );
        teacher.setAddress( teacherDTO.getAddress() );
        teacher.setDateOfBirth( teacherDTO.getDateOfBirth() );
        teacher.setDateOfRegister( teacherDTO.getDateOfRegister() );
        teacher.setPhone( teacherDTO.getPhone() );
        teacher.setEmail( teacherDTO.getEmail() );
        teacher.setTelegramUserName( teacherDTO.getTelegramUserName() );
        teacher.setSpecialization( teacherDTO.getSpecialization() );

        return teacher;
    }
}
