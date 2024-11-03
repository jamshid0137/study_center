package com.backend.studycenter.sccontrol.mapper;

import com.backend.studycenter.common.dto.course.CourseDTO;
import com.backend.studycenter.common.dto.person.StudentDTO;
import com.backend.studycenter.common.model.course.Course;
import com.backend.studycenter.common.model.person.Student;
import com.backend.studycenter.sccontrol.dto.AcademicProgressDTO;
import com.backend.studycenter.sccontrol.model.AcademicProgress;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class AcademicProgressMapperImpl implements AcademicProgressMapper {

    @Override
    public AcademicProgressDTO toDTO(AcademicProgress academicProgress) {
        if ( academicProgress == null ) {
            return null;
        }

        AcademicProgressDTO academicProgressDTO = new AcademicProgressDTO();

        academicProgressDTO.setId( academicProgress.getId() );
        academicProgressDTO.setCourse( courseToCourseDTO( academicProgress.getCourse() ) );
        academicProgressDTO.setStudent( studentToStudentDTO( academicProgress.getStudent() ) );

        return academicProgressDTO;
    }

    @Override
    public AcademicProgress toModel(AcademicProgressDTO academicProgressDTO) {
        if ( academicProgressDTO == null ) {
            return null;
        }

        AcademicProgress academicProgress = new AcademicProgress();

        academicProgress.setCourse( courseDTOToCourse( academicProgressDTO.getCourse() ) );
        academicProgress.setId( academicProgressDTO.getId() );
        academicProgress.setStudent( studentDTOToStudent( academicProgressDTO.getStudent() ) );

        return academicProgress;
    }

    protected CourseDTO courseToCourseDTO(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( course.getId() );
        courseDTO.setName( course.getName() );
        courseDTO.setDescription( course.getDescription() );
        courseDTO.setDuration( course.getDuration() );
        courseDTO.setPrice( course.getPrice() );

        return courseDTO;
    }

    protected StudentDTO studentToStudentDTO(Student student) {
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

    protected Course courseDTOToCourse(CourseDTO courseDTO) {
        if ( courseDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setId( courseDTO.getId() );
        course.setName( courseDTO.getName() );
        course.setDescription( courseDTO.getDescription() );
        course.setDuration( courseDTO.getDuration() );
        course.setPrice( courseDTO.getPrice() );

        return course;
    }

    protected Student studentDTOToStudent(StudentDTO studentDTO) {
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
