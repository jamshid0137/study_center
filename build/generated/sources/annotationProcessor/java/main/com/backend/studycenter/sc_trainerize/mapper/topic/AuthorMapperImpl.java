package com.backend.studycenter.sc_trainerize.mapper.topic;

import com.backend.studycenter.sc_trainerize.dto.topic.AuthorDTO;
import com.backend.studycenter.sc_trainerize.model.topic.Author;
import com.backend.studycenter.sc_trainerize.model.topic.Topic;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public AuthorDTO toDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        AuthorDTO authorDTO = new AuthorDTO();

        authorDTO.setId( author.getId() );
        authorDTO.setName( author.getName() );
        authorDTO.setDescription( author.getDescription() );
        authorDTO.setAddress( author.getAddress() );
        authorDTO.setDateOfBirth( author.getDateOfBirth() );
        authorDTO.setDateOfRegister( author.getDateOfRegister() );
        authorDTO.setPhone( author.getPhone() );
        authorDTO.setEmail( author.getEmail() );
        authorDTO.setTelegramUserName( author.getTelegramUserName() );
        List<Topic> list = author.getTopics();
        if ( list != null ) {
            authorDTO.setTopics( new ArrayList<Topic>( list ) );
        }

        return authorDTO;
    }

    @Override
    public Author toModel(AuthorDTO authorDTO) {
        if ( authorDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( authorDTO.getId() );
        author.setName( authorDTO.getName() );
        author.setDescription( authorDTO.getDescription() );
        author.setAddress( authorDTO.getAddress() );
        author.setDateOfBirth( authorDTO.getDateOfBirth() );
        author.setDateOfRegister( authorDTO.getDateOfRegister() );
        author.setPhone( authorDTO.getPhone() );
        author.setEmail( authorDTO.getEmail() );
        author.setTelegramUserName( authorDTO.getTelegramUserName() );
        List<Topic> list = authorDTO.getTopics();
        if ( list != null ) {
            author.setTopics( new ArrayList<Topic>( list ) );
        }

        return author;
    }
}
