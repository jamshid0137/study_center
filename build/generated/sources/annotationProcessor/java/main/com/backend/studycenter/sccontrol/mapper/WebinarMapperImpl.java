package com.backend.studycenter.sccontrol.mapper;

import com.backend.studycenter.common.dto.person.PersonDTO;
import com.backend.studycenter.common.model.person.Person;
import com.backend.studycenter.sccontrol.dto.WebinarDTO;
import com.backend.studycenter.sccontrol.model.Webinar;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class WebinarMapperImpl implements WebinarMapper {

    @Override
    public WebinarDTO toDTO(Webinar webinar) {
        if ( webinar == null ) {
            return null;
        }

        WebinarDTO webinarDTO = new WebinarDTO();

        webinarDTO.setId( webinar.getId() );
        webinarDTO.setTitle( webinar.getTitle() );
        webinarDTO.setSpeaker( personToPersonDTO( webinar.getSpeaker() ) );
        webinarDTO.setParticipants( personListToPersonDTOList( webinar.getParticipants() ) );
        webinarDTO.setDate( webinar.getDate() );
        webinarDTO.setDescription( webinar.getDescription() );
        webinarDTO.setLocation( webinar.getLocation() );

        return webinarDTO;
    }

    @Override
    public Webinar toModel(WebinarDTO webinarDTO) {
        if ( webinarDTO == null ) {
            return null;
        }

        Webinar webinar = new Webinar();

        webinar.setId( webinarDTO.getId() );
        webinar.setTitle( webinarDTO.getTitle() );
        webinar.setSpeaker( personDTOToPerson( webinarDTO.getSpeaker() ) );
        webinar.setParticipants( personDTOListToPersonList( webinarDTO.getParticipants() ) );
        webinar.setDate( webinarDTO.getDate() );
        webinar.setDescription( webinarDTO.getDescription() );
        webinar.setLocation( webinarDTO.getLocation() );

        return webinar;
    }

    protected PersonDTO personToPersonDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( person.getId() );
        personDTO.setName( person.getName() );
        personDTO.setDescription( person.getDescription() );
        personDTO.setAddress( person.getAddress() );
        personDTO.setDateOfBirth( person.getDateOfBirth() );
        personDTO.setDateOfRegister( person.getDateOfRegister() );
        personDTO.setPhone( person.getPhone() );
        personDTO.setEmail( person.getEmail() );
        personDTO.setTelegramUserName( person.getTelegramUserName() );

        return personDTO;
    }

    protected List<PersonDTO> personListToPersonDTOList(List<Person> list) {
        if ( list == null ) {
            return null;
        }

        List<PersonDTO> list1 = new ArrayList<PersonDTO>( list.size() );
        for ( Person person : list ) {
            list1.add( personToPersonDTO( person ) );
        }

        return list1;
    }

    protected Person personDTOToPerson(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( personDTO.getId() );
        person.setName( personDTO.getName() );
        person.setDescription( personDTO.getDescription() );
        person.setAddress( personDTO.getAddress() );
        person.setDateOfBirth( personDTO.getDateOfBirth() );
        person.setDateOfRegister( personDTO.getDateOfRegister() );
        person.setPhone( personDTO.getPhone() );
        person.setEmail( personDTO.getEmail() );
        person.setTelegramUserName( personDTO.getTelegramUserName() );

        return person;
    }

    protected List<Person> personDTOListToPersonList(List<PersonDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Person> list1 = new ArrayList<Person>( list.size() );
        for ( PersonDTO personDTO : list ) {
            list1.add( personDTOToPerson( personDTO ) );
        }

        return list1;
    }
}
