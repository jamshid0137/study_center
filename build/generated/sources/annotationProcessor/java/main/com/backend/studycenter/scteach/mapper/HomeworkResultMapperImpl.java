package com.backend.studycenter.scteach.mapper;

import com.backend.studycenter.scteach.dto.HomeworkResultDTO;
import com.backend.studycenter.scteach.model.HomeworkResult;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class HomeworkResultMapperImpl implements HomeworkResultMapper {

    @Override
    public HomeworkResult toModel(HomeworkResultDTO homeworkResultDTO) {
        if ( homeworkResultDTO == null ) {
            return null;
        }

        HomeworkResult homeworkResult = new HomeworkResult();

        homeworkResult.setId( homeworkResultDTO.getId() );
        homeworkResult.setStudentId( homeworkResultDTO.getStudentId() );
        homeworkResult.setHomeworkId( homeworkResultDTO.getHomeworkId() );
        homeworkResult.setTeacherID( homeworkResultDTO.getTeacherID() );
        homeworkResult.setScore( homeworkResultDTO.getScore() );
        homeworkResult.setDescription( homeworkResultDTO.getDescription() );

        return homeworkResult;
    }

    @Override
    public HomeworkResultDTO toDTO(HomeworkResult attendance) {
        if ( attendance == null ) {
            return null;
        }

        HomeworkResultDTO homeworkResultDTO = new HomeworkResultDTO();

        homeworkResultDTO.setId( attendance.getId() );
        homeworkResultDTO.setStudentId( attendance.getStudentId() );
        homeworkResultDTO.setHomeworkId( attendance.getHomeworkId() );
        homeworkResultDTO.setTeacherID( attendance.getTeacherID() );
        homeworkResultDTO.setScore( attendance.getScore() );
        homeworkResultDTO.setDescription( attendance.getDescription() );

        return homeworkResultDTO;
    }

    @Override
    public HomeworkResult toModel(HomeworkResult homeworkResult, HomeworkResultDTO homeworkResultDTO) {
        if ( homeworkResultDTO == null ) {
            return homeworkResult;
        }

        homeworkResult.setId( homeworkResultDTO.getId() );
        homeworkResult.setStudentId( homeworkResultDTO.getStudentId() );
        homeworkResult.setHomeworkId( homeworkResultDTO.getHomeworkId() );
        homeworkResult.setTeacherID( homeworkResultDTO.getTeacherID() );
        homeworkResult.setScore( homeworkResultDTO.getScore() );
        homeworkResult.setDescription( homeworkResultDTO.getDescription() );

        return homeworkResult;
    }
}
