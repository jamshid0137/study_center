package com.backend.studycenter.scpay.mapper;

import com.backend.studycenter.scpay.dto.ProgramDTO;
import com.backend.studycenter.scpay.model.Program;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ProgramMapperImpl implements ProgramMapper {

    @Override
    public ProgramDTO toDTO(Program program) {
        if ( program == null ) {
            return null;
        }

        ProgramDTO programDTO = new ProgramDTO();

        return programDTO;
    }

    @Override
    public Program toModel(ProgramDTO programDTO) {
        if ( programDTO == null ) {
            return null;
        }

        Program program = new Program();

        return program;
    }
}
