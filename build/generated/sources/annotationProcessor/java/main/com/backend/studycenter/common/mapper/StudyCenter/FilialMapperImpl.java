package com.backend.studycenter.common.mapper.StudyCenter;

import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.studycenter.Filial;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-27T09:15:46+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class FilialMapperImpl implements FilialMapper {

    @Override
    public FilialDTO toDTO(Filial filial) {
        if ( filial == null ) {
            return null;
        }

        FilialDTO filialDTO = new FilialDTO();

        filialDTO.setGroupDTOs( groupListToGroupDTOList( filial.getGroups() ) );
        filialDTO.setId( filial.getId() );
        filialDTO.setName( filial.getName() );
        filialDTO.setDescription( filial.getDescription() );

        return filialDTO;
    }

    @Override
    public Filial toModel(FilialDTO filialDTO) {
        if ( filialDTO == null ) {
            return null;
        }

        Filial filial = new Filial();

        filial.setGroups( groupDTOListToGroupList( filialDTO.getGroupDTOs() ) );
        filial.setId( filialDTO.getId() );
        filial.setName( filialDTO.getName() );
        filial.setDescription( filialDTO.getDescription() );

        return filial;
    }

    protected GroupDTO groupToGroupDTO(Group group) {
        if ( group == null ) {
            return null;
        }

        GroupDTO groupDTO = new GroupDTO();

        groupDTO.setId( group.getId() );
        groupDTO.setName( group.getName() );
        groupDTO.setDescription( group.getDescription() );
        groupDTO.setStartDate( group.getStartDate() );

        return groupDTO;
    }

    protected List<GroupDTO> groupListToGroupDTOList(List<Group> list) {
        if ( list == null ) {
            return null;
        }

        List<GroupDTO> list1 = new ArrayList<GroupDTO>( list.size() );
        for ( Group group : list ) {
            list1.add( groupToGroupDTO( group ) );
        }

        return list1;
    }

    protected Group groupDTOToGroup(GroupDTO groupDTO) {
        if ( groupDTO == null ) {
            return null;
        }

        Group group = new Group();

        group.setId( groupDTO.getId() );
        group.setName( groupDTO.getName() );
        group.setDescription( groupDTO.getDescription() );
        group.setStartDate( groupDTO.getStartDate() );

        return group;
    }

    protected List<Group> groupDTOListToGroupList(List<GroupDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Group> list1 = new ArrayList<Group>( list.size() );
        for ( GroupDTO groupDTO : list ) {
            list1.add( groupDTOToGroup( groupDTO ) );
        }

        return list1;
    }
}
