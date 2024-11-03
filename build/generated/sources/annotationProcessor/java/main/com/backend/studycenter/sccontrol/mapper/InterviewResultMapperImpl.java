package com.backend.studycenter.sccontrol.mapper;

import com.backend.studycenter.sccontrol.dto.InterviewResultDTO;
import com.backend.studycenter.sccontrol.model.InterviewResult;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class InterviewResultMapperImpl implements InterviewResultMapper {

    @Override
    public InterviewResultDTO toDTO(InterviewResult interviewResult) {
        if ( interviewResult == null ) {
            return null;
        }

        InterviewResultDTO interviewResultDTO = new InterviewResultDTO();

        interviewResultDTO.setId( interviewResult.getId() );
        interviewResultDTO.setInterview( interviewResult.getInterview() );
        interviewResultDTO.setDetails( interviewResult.getDetails() );
        interviewResultDTO.setDate( interviewResult.getDate() );
        interviewResultDTO.setFeedback( interviewResult.getFeedback() );

        return interviewResultDTO;
    }

    @Override
    public InterviewResult toModel(InterviewResultDTO interviewResultDTO) {
        if ( interviewResultDTO == null ) {
            return null;
        }

        InterviewResult interviewResult = new InterviewResult();

        interviewResult.setId( interviewResultDTO.getId() );
        interviewResult.setInterview( interviewResultDTO.getInterview() );
        interviewResult.setDetails( interviewResultDTO.getDetails() );
        interviewResult.setDate( interviewResultDTO.getDate() );
        interviewResult.setFeedback( interviewResultDTO.getFeedback() );

        return interviewResult;
    }
}
