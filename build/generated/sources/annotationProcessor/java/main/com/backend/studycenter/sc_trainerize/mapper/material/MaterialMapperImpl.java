package com.backend.studycenter.sc_trainerize.mapper.material;

import com.backend.studycenter.sc_trainerize.dto.material.MaterialDTO;
import com.backend.studycenter.sc_trainerize.model.material.Image;
import com.backend.studycenter.sc_trainerize.model.material.Material;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class MaterialMapperImpl implements MaterialMapper {

    @Override
    public MaterialDTO toDTO(Material material) {
        if ( material == null ) {
            return null;
        }

        MaterialDTO materialDTO = new MaterialDTO();

        materialDTO.setId( material.getId() );
        materialDTO.setTitle( material.getTitle() );
        materialDTO.setDescription( material.getDescription() );
        List<Image> list = material.getImages();
        if ( list != null ) {
            materialDTO.setImages( new ArrayList<Image>( list ) );
        }

        return materialDTO;
    }

    @Override
    public Material toModel(MaterialDTO materialDTO) {
        if ( materialDTO == null ) {
            return null;
        }

        Material material = new Material();

        material.setId( materialDTO.getId() );
        material.setTitle( materialDTO.getTitle() );
        material.setDescription( materialDTO.getDescription() );
        List<Image> list = materialDTO.getImages();
        if ( list != null ) {
            material.setImages( new ArrayList<Image>( list ) );
        }

        return material;
    }
}
