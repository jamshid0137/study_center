package com.backend.studycenter.scteach.mapper;

import com.backend.studycenter.common.model.person.Person;
import com.backend.studycenter.scteach.dto.ProposalDTO;
import com.backend.studycenter.scteach.model.Proposal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ProposalMapperImpl implements ProposalMapper {

    @Override
    public Proposal toModel(ProposalDTO proposalDTO) {
        if ( proposalDTO == null ) {
            return null;
        }

        Proposal proposal = new Proposal();

        proposal.setId( proposalDTO.getId() );
        proposal.setFromPersonID( proposalDTO.getFromPersonID() );
        List<Person> list = proposalDTO.getToPersonsID();
        if ( list != null ) {
            proposal.setToPersonsID( new ArrayList<Person>( list ) );
        }
        proposal.setRequestType( proposalDTO.getRequestType() );
        proposal.setDescription( proposalDTO.getDescription() );

        return proposal;
    }

    @Override
    public ProposalDTO toDTO(Proposal attendance) {
        if ( attendance == null ) {
            return null;
        }

        ProposalDTO proposalDTO = new ProposalDTO();

        proposalDTO.setId( attendance.getId() );
        proposalDTO.setFromPersonID( attendance.getFromPersonID() );
        List<Person> list = attendance.getToPersonsID();
        if ( list != null ) {
            proposalDTO.setToPersonsID( new ArrayList<Person>( list ) );
        }
        proposalDTO.setRequestType( attendance.getRequestType() );
        proposalDTO.setDescription( attendance.getDescription() );

        return proposalDTO;
    }

    @Override
    public Proposal toModel(Proposal proposal, ProposalDTO proposalDTO) {
        if ( proposalDTO == null ) {
            return proposal;
        }

        proposal.setId( proposalDTO.getId() );
        proposal.setFromPersonID( proposalDTO.getFromPersonID() );
        if ( proposal.getToPersonsID() != null ) {
            List<Person> list = proposalDTO.getToPersonsID();
            if ( list != null ) {
                proposal.getToPersonsID().clear();
                proposal.getToPersonsID().addAll( list );
            }
            else {
                proposal.setToPersonsID( null );
            }
        }
        else {
            List<Person> list = proposalDTO.getToPersonsID();
            if ( list != null ) {
                proposal.setToPersonsID( new ArrayList<Person>( list ) );
            }
        }
        proposal.setRequestType( proposalDTO.getRequestType() );
        proposal.setDescription( proposalDTO.getDescription() );

        return proposal;
    }
}
