package com.backend.studycenter.scpay.mapper;

import com.backend.studycenter.scpay.dto.ContractDTO;
import com.backend.studycenter.scpay.model.Contract;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ContractMapperImpl implements ContractMapper {

    @Override
    public ContractDTO toDTO(Contract contract) {
        if ( contract == null ) {
            return null;
        }

        ContractDTO contractDTO = new ContractDTO();

        return contractDTO;
    }

    @Override
    public Contract toModel(ContractDTO contractDTO) {
        if ( contractDTO == null ) {
            return null;
        }

        Contract contract = new Contract();

        return contract;
    }
}
