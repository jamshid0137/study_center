package com.backend.studycenter.scteach.mapper;

import com.backend.studycenter.scteach.dto.AttendanceDTO;
import com.backend.studycenter.scteach.model.Attendance;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class AttendanceMapperImpl implements AttendanceMapper {

    @Override
    public Attendance toModel(AttendanceDTO attendanceDTO) {
        if ( attendanceDTO == null ) {
            return null;
        }

        Attendance attendance = new Attendance();

        attendance.setId( attendanceDTO.getId() );
        attendance.setGroupID( attendanceDTO.getGroupID() );
        attendance.setCalendarLessonID( attendanceDTO.getCalendarLessonID() );

        return attendance;
    }

    @Override
    public AttendanceDTO toDTO(Attendance attendance) {
        if ( attendance == null ) {
            return null;
        }

        AttendanceDTO attendanceDTO = new AttendanceDTO();

        attendanceDTO.setId( attendance.getId() );
        attendanceDTO.setGroupID( attendance.getGroupID() );
        attendanceDTO.setCalendarLessonID( attendance.getCalendarLessonID() );

        return attendanceDTO;
    }

    @Override
    public Attendance toModel(Attendance attendance, AttendanceDTO attendanceDTO) {
        if ( attendanceDTO == null ) {
            return attendance;
        }

        attendance.setId( attendanceDTO.getId() );
        attendance.setGroupID( attendanceDTO.getGroupID() );
        attendance.setCalendarLessonID( attendanceDTO.getCalendarLessonID() );

        return attendance;
    }
}
