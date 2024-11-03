package com.backend.studycenter.scteach.mapper;

import com.backend.studycenter.scteach.dto.HomeworkDTO;
import com.backend.studycenter.scteach.model.Homework;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class HomeworkMapperImpl implements HomeworkMapper {

    @Override
    public Homework toModel(HomeworkDTO homeworkDTO) {
        if ( homeworkDTO == null ) {
            return null;
        }

        Homework homework = new Homework();

        homework.setId( homeworkDTO.getId() );
        homework.setStudentId( homeworkDTO.getStudentId() );
        homework.setAssessmentID( homeworkDTO.getAssessmentID() );
        homework.setFile( homeworkDTO.getFile() );

        return homework;
    }

    @Override
    public HomeworkDTO toDTO(Homework attendance) {
        if ( attendance == null ) {
            return null;
        }

        HomeworkDTO homeworkDTO = new HomeworkDTO();

        homeworkDTO.setId( attendance.getId() );
        homeworkDTO.setStudentId( attendance.getStudentId() );
        homeworkDTO.setAssessmentID( attendance.getAssessmentID() );
        homeworkDTO.setFile( attendance.getFile() );

        return homeworkDTO;
    }

    @Override
    public Homework toModel(Homework homework, HomeworkDTO homeworkDTO) {
        if ( homeworkDTO == null ) {
            return homework;
        }

        homework.setId( homeworkDTO.getId() );
        homework.setStudentId( homeworkDTO.getStudentId() );
        homework.setAssessmentID( homeworkDTO.getAssessmentID() );
        homework.setFile( homeworkDTO.getFile() );

        return homework;
    }
}
