package com.backend.studycenter.sc_trainerize.mapper.topic;

import com.backend.studycenter.sc_trainerize.dto.topic.AuthorDTO;
import com.backend.studycenter.sc_trainerize.dto.topic.ContentDTO;
import com.backend.studycenter.sc_trainerize.dto.topic.TopicDTO;
import com.backend.studycenter.sc_trainerize.model.topic.Author;
import com.backend.studycenter.sc_trainerize.model.topic.Content;
import com.backend.studycenter.sc_trainerize.model.topic.Topic;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class TopicMapperImpl implements TopicMapper {

    @Override
    public TopicDTO toDTO(Topic topic) {
        if ( topic == null ) {
            return null;
        }

        TopicDTO topicDTO = new TopicDTO();

        topicDTO.setAuthorDTO( authorToAuthorDTO( topic.getAuthor() ) );
        topicDTO.setContentDTOS( contentListToContentDTOList( topic.getContents() ) );
        topicDTO.setId( topic.getId() );
        topicDTO.setTitle( topic.getTitle() );
        topicDTO.setContent( topic.getContent() );

        return topicDTO;
    }

    @Override
    public Topic toModel(TopicDTO topicDTO) {
        if ( topicDTO == null ) {
            return null;
        }

        Topic topic = new Topic();

        topic.setAuthor( authorDTOToAuthor( topicDTO.getAuthorDTO() ) );
        topic.setContents( contentDTOListToContentList( topicDTO.getContentDTOS() ) );
        topic.setId( topicDTO.getId() );
        topic.setTitle( topicDTO.getTitle() );
        topic.setContent( topicDTO.getContent() );

        return topic;
    }

    protected AuthorDTO authorToAuthorDTO(Author author) {
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

    protected ContentDTO contentToContentDTO(Content content) {
        if ( content == null ) {
            return null;
        }

        ContentDTO contentDTO = new ContentDTO();

        contentDTO.setId( content.getId() );
        contentDTO.setTitle( content.getTitle() );
        contentDTO.setDescription( content.getDescription() );
        contentDTO.setCreationDate( content.getCreationDate() );
        contentDTO.setLastModifiedDate( content.getLastModifiedDate() );
        contentDTO.setMaterial( content.getMaterial() );

        return contentDTO;
    }

    protected List<ContentDTO> contentListToContentDTOList(List<Content> list) {
        if ( list == null ) {
            return null;
        }

        List<ContentDTO> list1 = new ArrayList<ContentDTO>( list.size() );
        for ( Content content : list ) {
            list1.add( contentToContentDTO( content ) );
        }

        return list1;
    }

    protected Author authorDTOToAuthor(AuthorDTO authorDTO) {
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

    protected Content contentDTOToContent(ContentDTO contentDTO) {
        if ( contentDTO == null ) {
            return null;
        }

        Content content = new Content();

        content.setId( contentDTO.getId() );
        content.setTitle( contentDTO.getTitle() );
        content.setDescription( contentDTO.getDescription() );
        content.setCreationDate( contentDTO.getCreationDate() );
        content.setLastModifiedDate( contentDTO.getLastModifiedDate() );
        content.setMaterial( contentDTO.getMaterial() );

        return content;
    }

    protected List<Content> contentDTOListToContentList(List<ContentDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Content> list1 = new ArrayList<Content>( list.size() );
        for ( ContentDTO contentDTO : list ) {
            list1.add( contentDTOToContent( contentDTO ) );
        }

        return list1;
    }
}
