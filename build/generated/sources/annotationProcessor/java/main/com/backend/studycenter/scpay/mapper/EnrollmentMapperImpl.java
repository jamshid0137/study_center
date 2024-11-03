package com.backend.studycenter.scpay.mapper;

import com.backend.studycenter.scpay.dto.EnrollmentDTO;
import com.backend.studycenter.scpay.model.Enrollment;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class EnrollmentMapperImpl implements EnrollmentMapper {

    @Override
    public EnrollmentDTO toDTO(Enrollment enrollment) {
        if ( enrollment == null ) {
            return null;
        }

        EnrollmentDTO enrollmentDTO = new EnrollmentDTO();

        return enrollmentDTO;
    }

    @Override
    public Enrollment toModel(EnrollmentDTO enrollmentDTO) {
        if ( enrollmentDTO == null ) {
            return null;
        }

        Enrollment enrollment = new Enrollment();

        return enrollment;
    }
}
