package com.backend.studycenter.common.mapper.education;

import com.backend.studycenter.common.dto.course.LessonDTO;
import com.backend.studycenter.common.dto.education.CalendarLessonDTO;
import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.education.CalendarLesson;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class CalendarLessonMapperImpl implements CalendarLessonMapper {

    @Override
    public CalendarLessonDTO toDTO(CalendarLesson calendarLesson) {
        if ( calendarLesson == null ) {
            return null;
        }

        CalendarLessonDTO calendarLessonDTO = new CalendarLessonDTO();

        calendarLessonDTO.setLessonDTO( lessonToLessonDTO( calendarLesson.getLesson() ) );
        calendarLessonDTO.setId( calendarLesson.getId() );
        calendarLessonDTO.setPlannedLessonDateTime( calendarLesson.getPlannedLessonDateTime() );
        calendarLessonDTO.setActualLessonDateTime( calendarLesson.getActualLessonDateTime() );
        calendarLessonDTO.setPlannedTeacher( calendarLesson.getPlannedTeacher() );
        calendarLessonDTO.setActualTeacher( calendarLesson.getActualTeacher() );
        calendarLessonDTO.setComment( calendarLesson.getComment() );

        return calendarLessonDTO;
    }

    @Override
    public CalendarLesson toModel(CalendarLessonDTO calendarLessonDTO) {
        if ( calendarLessonDTO == null ) {
            return null;
        }

        CalendarLesson calendarLesson = new CalendarLesson();

        calendarLesson.setLesson( lessonDTOToLesson( calendarLessonDTO.getLessonDTO() ) );
        calendarLesson.setId( calendarLessonDTO.getId() );
        calendarLesson.setPlannedLessonDateTime( calendarLessonDTO.getPlannedLessonDateTime() );
        calendarLesson.setActualLessonDateTime( calendarLessonDTO.getActualLessonDateTime() );
        calendarLesson.setPlannedTeacher( calendarLessonDTO.getPlannedTeacher() );
        calendarLesson.setActualTeacher( calendarLessonDTO.getActualTeacher() );
        calendarLesson.setComment( calendarLessonDTO.getComment() );

        return calendarLesson;
    }

    protected LessonDTO lessonToLessonDTO(Lesson lesson) {
        if ( lesson == null ) {
            return null;
        }

        LessonDTO lessonDTO = new LessonDTO();

        lessonDTO.setId( lesson.getId() );
        lessonDTO.setName( lesson.getName() );
        lessonDTO.setDescription( lesson.getDescription() );

        return lessonDTO;
    }

    protected Lesson lessonDTOToLesson(LessonDTO lessonDTO) {
        if ( lessonDTO == null ) {
            return null;
        }

        Lesson lesson = new Lesson();

        lesson.setId( lessonDTO.getId() );
        lesson.setName( lessonDTO.getName() );
        lesson.setDescription( lessonDTO.getDescription() );

        return lesson;
    }
}
