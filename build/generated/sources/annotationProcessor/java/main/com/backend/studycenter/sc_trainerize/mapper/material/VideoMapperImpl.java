package com.backend.studycenter.sc_trainerize.mapper.material;

import com.backend.studycenter.sc_trainerize.dto.material.VideoDTO;
import com.backend.studycenter.sc_trainerize.model.material.Video;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class VideoMapperImpl implements VideoMapper {

    @Override
    public VideoDTO toDTO(Video video) {
        if ( video == null ) {
            return null;
        }

        VideoDTO videoDTO = new VideoDTO();

        videoDTO.setId( video.getId() );
        videoDTO.setName( video.getName() );
        videoDTO.setExternalLink( video.getExternalLink() );

        return videoDTO;
    }

    @Override
    public Video toModel(VideoDTO videoDTO) {
        if ( videoDTO == null ) {
            return null;
        }

        Video video = new Video();

        video.setId( videoDTO.getId() );
        video.setName( videoDTO.getName() );
        video.setExternalLink( videoDTO.getExternalLink() );

        return video;
    }
}
