package com.backend.studycenter.sc_trainerize.mapper.material;

import com.backend.studycenter.sc_trainerize.dto.material.ImageDTO;
import com.backend.studycenter.sc_trainerize.model.material.Image;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ImageMapperImpl implements ImageMapper {

    @Override
    public ImageDTO toDTO(Image image) {
        if ( image == null ) {
            return null;
        }

        ImageDTO imageDTO = new ImageDTO();

        imageDTO.setId( image.getId() );
        imageDTO.setFileOriginalName( image.getFileOriginalName() );
        imageDTO.setSize( image.getSize() );
        imageDTO.setContentType( image.getContentType() );

        return imageDTO;
    }

    @Override
    public Image toModel(ImageDTO imageDTO) {
        if ( imageDTO == null ) {
            return null;
        }

        Image image = new Image();

        image.setId( imageDTO.getId() );
        image.setFileOriginalName( imageDTO.getFileOriginalName() );
        image.setSize( imageDTO.getSize() );
        image.setContentType( imageDTO.getContentType() );

        return image;
    }
}
