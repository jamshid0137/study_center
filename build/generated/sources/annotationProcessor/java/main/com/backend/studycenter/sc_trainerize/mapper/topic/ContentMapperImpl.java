package com.backend.studycenter.sc_trainerize.mapper.topic;

import com.backend.studycenter.sc_trainerize.dto.topic.ContentDTO;
import com.backend.studycenter.sc_trainerize.model.topic.Content;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ContentMapperImpl implements ContentMapper {

    @Override
    public ContentDTO toDTO(Content content) {
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

    @Override
    public Content toModel(ContentDTO contentDTO) {
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
}
