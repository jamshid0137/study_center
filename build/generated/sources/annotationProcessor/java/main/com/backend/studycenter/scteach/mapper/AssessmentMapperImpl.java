package com.backend.studycenter.scteach.mapper;

import com.backend.studycenter.scteach.dto.AssessmentDTO;
import com.backend.studycenter.scteach.model.Assessment;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class AssessmentMapperImpl implements AssessmentMapper {

    @Override
    public Assessment toModel(AssessmentDTO assessmentDTO) {
        if ( assessmentDTO == null ) {
            return null;
        }

        Assessment assessment = new Assessment();

        assessment.setId( assessmentDTO.getId() );
        assessment.setTeacherID( assessmentDTO.getTeacherID() );
        assessment.setDescription( assessmentDTO.getDescription() );
        assessment.setGroupID( assessmentDTO.getGroupID() );

        return assessment;
    }

    @Override
    public AssessmentDTO toDTO(Assessment assessment) {
        if ( assessment == null ) {
            return null;
        }

        AssessmentDTO assessmentDTO = new AssessmentDTO();

        assessmentDTO.setId( assessment.getId() );
        assessmentDTO.setTeacherID( assessment.getTeacherID() );
        assessmentDTO.setDescription( assessment.getDescription() );
        assessmentDTO.setGroupID( assessment.getGroupID() );

        return assessmentDTO;
    }

    @Override
    public Assessment toModel(Assessment assessment, AssessmentDTO assessmentDTO) {
        if ( assessmentDTO == null ) {
            return assessment;
        }

        assessment.setId( assessmentDTO.getId() );
        assessment.setTeacherID( assessmentDTO.getTeacherID() );
        assessment.setDescription( assessmentDTO.getDescription() );
        assessment.setGroupID( assessmentDTO.getGroupID() );

        return assessment;
    }
}
