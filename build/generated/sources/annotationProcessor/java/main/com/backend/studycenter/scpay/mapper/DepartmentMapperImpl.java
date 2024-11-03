package com.backend.studycenter.scpay.mapper;

import com.backend.studycenter.scpay.dto.request.DepartmentRequestDTO;
import com.backend.studycenter.scpay.model.Department;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentRequestDTO toDTO(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentRequestDTO departmentRequestDTO = new DepartmentRequestDTO();

        departmentRequestDTO.setName( department.getName() );
        departmentRequestDTO.setDescription( department.getDescription() );

        return departmentRequestDTO;
    }

    @Override
    public Department toModel(DepartmentRequestDTO departmentRequestDTO) {
        if ( departmentRequestDTO == null ) {
            return null;
        }

        Department department = new Department();

        department.setName( departmentRequestDTO.getName() );
        department.setDescription( departmentRequestDTO.getDescription() );

        return department;
    }
}
