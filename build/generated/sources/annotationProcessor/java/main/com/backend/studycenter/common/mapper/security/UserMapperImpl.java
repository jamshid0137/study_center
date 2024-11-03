package com.backend.studycenter.common.mapper.security;

import com.backend.studycenter.common.dto.security.RoleDTO;
import com.backend.studycenter.common.dto.security.UserDTO;
import com.backend.studycenter.common.model.security.Role;
import com.backend.studycenter.common.model.security.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setRoleDTOs( roleListToRoleDTOList( user.getRoles() ) );
        userDTO.setId( user.getId() );
        userDTO.setUsername( user.getUsername() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setActive( user.getActive() );
        userDTO.setDataCreated( user.getDataCreated() );
        userDTO.setDataExpired( user.getDataExpired() );
        userDTO.setPerson( user.getPerson() );

        return userDTO;
    }

    @Override
    public User toModel(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setRoles( roleDTOListToRoleList( userDTO.getRoleDTOs() ) );
        user.setId( userDTO.getId() );
        user.setUsername( userDTO.getUsername() );
        user.setPassword( userDTO.getPassword() );
        user.setActive( userDTO.getActive() );
        user.setDataCreated( userDTO.getDataCreated() );
        user.setDataExpired( userDTO.getDataExpired() );
        user.setPerson( userDTO.getPerson() );

        return user;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );

        return roleDTO;
    }

    protected List<RoleDTO> roleListToRoleDTOList(List<Role> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleDTO> list1 = new ArrayList<RoleDTO>( list.size() );
        for ( Role role : list ) {
            list1.add( roleToRoleDTO( role ) );
        }

        return list1;
    }

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setName( roleDTO.getName() );

        return role;
    }

    protected List<Role> roleDTOListToRoleList(List<RoleDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Role> list1 = new ArrayList<Role>( list.size() );
        for ( RoleDTO roleDTO : list ) {
            list1.add( roleDTOToRole( roleDTO ) );
        }

        return list1;
    }
}
