package com.backend.studycenter.scpay.mapper;

import com.backend.studycenter.scpay.dto.DebtDTO;
import com.backend.studycenter.scpay.model.Debt;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class DebtMapperImpl implements DebtMapper {

    @Override
    public DebtDTO toDTO(Debt debt) {
        if ( debt == null ) {
            return null;
        }

        DebtDTO debtDTO = new DebtDTO();

        return debtDTO;
    }

    @Override
    public Debt toModel(DebtDTO debtDTO) {
        if ( debtDTO == null ) {
            return null;
        }

        Debt debt = new Debt();

        return debt;
    }
}
