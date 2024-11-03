package com.backend.studycenter.scpay.mapper;

import com.backend.studycenter.scpay.dto.PaymentDTO;
import com.backend.studycenter.scpay.model.Payment;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public PaymentDTO toDTO(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        PaymentDTO paymentDTO = new PaymentDTO();

        return paymentDTO;
    }

    @Override
    public Payment toModel(PaymentDTO paymentDTO) {
        if ( paymentDTO == null ) {
            return null;
        }

        Payment payment = new Payment();

        return payment;
    }
}
