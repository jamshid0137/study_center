package com.backend.studycenter.common.mapper.person;

import com.backend.studycenter.common.dto.person.PersonDTO;
import com.backend.studycenter.common.model.person.Person;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDTO toDTO(Person person) {
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

    @Override
    public Person toModel(PersonDTO personDTO) {
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
}
