package com.backend.studycenter.common.mapper.education;

import com.backend.studycenter.common.dto.education.WeekDayAndTimeDTO;
import com.backend.studycenter.common.model.education.WeekDayAndTime;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class WeekDayAndTimeMapperImpl implements WeekDayAndTimeMapper {

    @Override
    public WeekDayAndTimeDTO toDTO(WeekDayAndTime weekDayAndTime) {
        if ( weekDayAndTime == null ) {
            return null;
        }

        WeekDayAndTimeDTO weekDayAndTimeDTO = new WeekDayAndTimeDTO();

        weekDayAndTimeDTO.setId( weekDayAndTime.getId() );
        weekDayAndTimeDTO.setName( weekDayAndTime.getName() );
        weekDayAndTimeDTO.setDayOfWeek( weekDayAndTime.getDayOfWeek() );
        weekDayAndTimeDTO.setTime( weekDayAndTime.getTime() );

        return weekDayAndTimeDTO;
    }

    @Override
    public WeekDayAndTime toModel(WeekDayAndTimeDTO weekDayAndTimeDTO) {
        if ( weekDayAndTimeDTO == null ) {
            return null;
        }

        WeekDayAndTime weekDayAndTime = new WeekDayAndTime();

        weekDayAndTime.setId( weekDayAndTimeDTO.getId() );
        weekDayAndTime.setName( weekDayAndTimeDTO.getName() );
        weekDayAndTime.setDayOfWeek( weekDayAndTimeDTO.getDayOfWeek() );
        weekDayAndTime.setTime( weekDayAndTimeDTO.getTime() );

        return weekDayAndTime;
    }
}
