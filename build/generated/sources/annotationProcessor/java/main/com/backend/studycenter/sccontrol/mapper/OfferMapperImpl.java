package com.backend.studycenter.sccontrol.mapper;

import com.backend.studycenter.sccontrol.dto.OfferDTO;
import com.backend.studycenter.sccontrol.model.Offer;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class OfferMapperImpl implements OfferMapper {

    @Override
    public OfferDTO toDTO(Offer offer) {
        if ( offer == null ) {
            return null;
        }

        OfferDTO offerDTO = new OfferDTO();

        offerDTO.setId( offer.getId() );
        offerDTO.setInterviewResult( offer.getInterviewResult() );
        offerDTO.setStatus( offer.getStatus() );
        offerDTO.setDate( offer.getDate() );
        offerDTO.setReason( offer.getReason() );
        offerDTO.setFeedback( offer.getFeedback() );

        return offerDTO;
    }

    @Override
    public Offer toModel(OfferDTO offerDTO) {
        if ( offerDTO == null ) {
            return null;
        }

        Offer offer = new Offer();

        offer.setId( offerDTO.getId() );
        offer.setInterviewResult( offerDTO.getInterviewResult() );
        offer.setStatus( offerDTO.getStatus() );
        offer.setDate( offerDTO.getDate() );
        offer.setReason( offerDTO.getReason() );
        offer.setFeedback( offerDTO.getFeedback() );

        return offer;
    }
}
