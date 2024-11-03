package com.backend.studycenter.common.mapper.StudyCenter;

import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.dto.studycenter.MainCenterDTO;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.studycenter.Filial;
import com.backend.studycenter.common.model.studycenter.MainCenter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-27T09:15:45+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class MainCenterMapperImpl implements MainCenterMapper {

    @Override
    public MainCenterDTO toDTO(MainCenter mainCenter) {
        if ( mainCenter == null ) {
            return null;
        }

        MainCenterDTO mainCenterDTO = new MainCenterDTO();

        mainCenterDTO.setFilialDTOs( filialListToFilialDTOList( mainCenter.getFilials() ) );
        mainCenterDTO.setGroupDTOs( groupListToGroupDTOList( mainCenter.getGroups() ) );
        mainCenterDTO.setId( mainCenter.getId() );
        mainCenterDTO.setName( mainCenter.getName() );
        mainCenterDTO.setDescription( mainCenter.getDescription() );

        return mainCenterDTO;
    }

    @Override
    public MainCenter toModel(MainCenterDTO mainCenterDTO) {
        if ( mainCenterDTO == null ) {
            return null;
        }

        MainCenter mainCenter = new MainCenter();

        mainCenter.setFilials( filialDTOListToFilialList( mainCenterDTO.getFilialDTOs() ) );
        mainCenter.setGroups( groupDTOListToGroupList( mainCenterDTO.getGroupDTOs() ) );
        mainCenter.setId( mainCenterDTO.getId() );
        mainCenter.setName( mainCenterDTO.getName() );
        mainCenter.setDescription( mainCenterDTO.getDescription() );

        return mainCenter;
    }

    protected FilialDTO filialToFilialDTO(Filial filial) {
        if ( filial == null ) {
            return null;
        }

        FilialDTO filialDTO = new FilialDTO();

        filialDTO.setId( filial.getId() );
        filialDTO.setName( filial.getName() );
        filialDTO.setDescription( filial.getDescription() );

        return filialDTO;
    }

    protected List<FilialDTO> filialListToFilialDTOList(List<Filial> list) {
        if ( list == null ) {
            return null;
        }

        List<FilialDTO> list1 = new ArrayList<FilialDTO>( list.size() );
        for ( Filial filial : list ) {
            list1.add( filialToFilialDTO( filial ) );
        }

        return list1;
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

    protected Filial filialDTOToFilial(FilialDTO filialDTO) {
        if ( filialDTO == null ) {
            return null;
        }

        Filial filial = new Filial();

        filial.setId( filialDTO.getId() );
        filial.setName( filialDTO.getName() );
        filial.setDescription( filialDTO.getDescription() );

        return filial;
    }

    protected List<Filial> filialDTOListToFilialList(List<FilialDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Filial> list1 = new ArrayList<Filial>( list.size() );
        for ( FilialDTO filialDTO : list ) {
            list1.add( filialDTOToFilial( filialDTO ) );
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
