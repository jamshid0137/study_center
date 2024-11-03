package com.backend.studycenter.scteach.mapper;

import com.backend.studycenter.scteach.dto.RespondDTO;
import com.backend.studycenter.scteach.model.Respond;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class RespondMapperImpl implements RespondMapper {

    @Override
    public Respond toModel(RespondDTO respondDTO) {
        if ( respondDTO == null ) {
            return null;
        }

        Respond respond = new Respond();

        respond.setId( respondDTO.getId() );
        respond.setPersonId( respondDTO.getPersonId() );
        respond.setProposalId( respondDTO.getProposalId() );
        respond.setRespondStatus( respondDTO.getRespondStatus() );
        respond.setTime( respondDTO.getTime() );
        respond.setDescription( respondDTO.getDescription() );

        return respond;
    }

    @Override
    public RespondDTO toDTO(Respond respond) {
        if ( respond == null ) {
            return null;
        }

        RespondDTO respondDTO = new RespondDTO();

        respondDTO.setId( respond.getId() );
        respondDTO.setPersonId( respond.getPersonId() );
        respondDTO.setProposalId( respond.getProposalId() );
        respondDTO.setRespondStatus( respond.getRespondStatus() );
        respondDTO.setTime( respond.getTime() );
        respondDTO.setDescription( respond.getDescription() );

        return respondDTO;
    }

    @Override
    public Respond toModel(Respond respond, RespondDTO respondDTO) {
        if ( respondDTO == null ) {
            return respond;
        }

        respond.setId( respondDTO.getId() );
        respond.setPersonId( respondDTO.getPersonId() );
        respond.setProposalId( respondDTO.getProposalId() );
        respond.setRespondStatus( respondDTO.getRespondStatus() );
        respond.setTime( respondDTO.getTime() );
        respond.setDescription( respondDTO.getDescription() );

        return respond;
    }
}
