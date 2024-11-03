package com.backend.studycenter.common.mapper.person;

import com.backend.studycenter.common.dto.person.InterviewDTO;
import com.backend.studycenter.common.model.person.Interview;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class InterviewMapperImpl implements InterviewMapper {

    @Override
    public InterviewDTO toDTO(Interview interview) {
        if ( interview == null ) {
            return null;
        }

        InterviewDTO interviewDTO = new InterviewDTO();

        interviewDTO.setId( interview.getId() );
        interviewDTO.setCandidate( interview.getCandidate() );
        interviewDTO.setInterviewer( interview.getInterviewer() );
        interviewDTO.setPlannedDateTime( interview.getPlannedDateTime() );
        interviewDTO.setActualDateTime( interview.getActualDateTime() );
        interviewDTO.setDiscountPercent( interview.getDiscountPercent() );

        return interviewDTO;
    }

    @Override
    public Interview toModel(InterviewDTO interviewDTO) {
        if ( interviewDTO == null ) {
            return null;
        }

        Interview interview = new Interview();

        interview.setId( interviewDTO.getId() );
        interview.setCandidate( interviewDTO.getCandidate() );
        interview.setInterviewer( interviewDTO.getInterviewer() );
        interview.setPlannedDateTime( interviewDTO.getPlannedDateTime() );
        interview.setActualDateTime( interviewDTO.getActualDateTime() );
        interview.setDiscountPercent( interviewDTO.getDiscountPercent() );

        return interview;
    }
}
