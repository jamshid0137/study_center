package com.backend.studycenter.common.mapper.person;

import com.backend.studycenter.common.dto.person.StudentDTO;
import com.backend.studycenter.common.model.person.Student;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDTO toDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );
        studentDTO.setDescription( student.getDescription() );
        studentDTO.setAddress( student.getAddress() );
        studentDTO.setDateOfBirth( student.getDateOfBirth() );
        studentDTO.setDateOfRegister( student.getDateOfRegister() );
        studentDTO.setPhone( student.getPhone() );
        studentDTO.setEmail( student.getEmail() );
        studentDTO.setTelegramUserName( student.getTelegramUserName() );
        studentDTO.setLevel( student.getLevel() );
        studentDTO.setEducation( student.getEducation() );
        studentDTO.setEnglish( student.getEnglish() );
        studentDTO.setAdditionalInformation( student.getAdditionalInformation() );
        studentDTO.setStatus( student.getStatus() );

        return studentDTO;
    }

    @Override
    public Student toModel(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setName( studentDTO.getName() );
        student.setDescription( studentDTO.getDescription() );
        student.setAddress( studentDTO.getAddress() );
        student.setDateOfBirth( studentDTO.getDateOfBirth() );
        student.setDateOfRegister( studentDTO.getDateOfRegister() );
        student.setPhone( studentDTO.getPhone() );
        student.setEmail( studentDTO.getEmail() );
        student.setTelegramUserName( studentDTO.getTelegramUserName() );
        student.setLevel( studentDTO.getLevel() );
        student.setEducation( studentDTO.getEducation() );
        student.setEnglish( studentDTO.getEnglish() );
        student.setAdditionalInformation( studentDTO.getAdditionalInformation() );
        student.setStatus( studentDTO.getStatus() );

        return student;
    }
}
