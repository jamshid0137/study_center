package com.backend.studycenter.common.mapper.StudyCenter;

//public interface MainCenterMapper {

//package com.backend.studycenter.common.mapper.StudyCenter;

//public interface FilialMapper {

//package com.backend.studycenter.common.mapper.education;







import com.backend.studycenter.common.dto.studycenter.MainCenterDTO;
import com.backend.studycenter.common.model.studycenter.MainCenter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MainCenterMapper {
    com.backend.studycenter.common.mapper.StudyCenter.MainCenterMapper INSTANCE = Mappers.getMapper(com.backend.studycenter.common.mapper.StudyCenter.MainCenterMapper.class);

    @Mapping(source = "filials", target = "filialDTOs")
    //@Mapping(source = "filials.groups", target = "filialDTOs.groupDTOs")

    @Mapping(source = "groups", target = "groupDTOs")
    /*@Mapping(source = "groups.teacher", target = "groupDTOs.teacherDTO")
    @Mapping(source = "groups.weekDayAndTimes", target = "groupDTOs.weekDayAndTimeDTOs")
    @Mapping(source = "groups.course", target = "groupDTOs.courseDTO")
    @Mapping(source = "groups.course.lessons", target = "groupDTOs.courseDTO.lessonDTOs")
    @Mapping(source = "groups.course.technologies", target = "groupDTOs.courseDTO.technologyDTOs")
    @Mapping(source = "groups.students", target = "groupDTOs.studentDTOs")
    @Mapping(source = "groups.calendarLessons", target = "groupDTOs.calendarLessonDTOs")*/

        //@Mapping(source = "filials.groups", target = "filialDTOs.groupDTOs")
    /*@Mapping(source = "filials.groups.teacher", target = "filialDTOs.groupDTOs.teacherDTO")
    @Mapping(source = "filials.groups.weekDayAndTimes", target = "filialDTOs.groupDTOs.weekDayAndTimeDTOs")
    @Mapping(source = "filials.groups.course", target = "filialDTOs.groupDTOs.courseDTO")
    @Mapping(source = "filials.groups.course.lessons", target = "filialDTOs.groupDTOs.courseDTO.lessonDTOs")
    @Mapping(source = "filials.groups.course.technologies", target = "filialDTOs.groupDTOs.courseDTO.technologyDTOs")
    @Mapping(source = "filials.groups.students", target = "filialDTOs.groupDTOs.studentDTOs")
    @Mapping(source = "filials.groups.calendarLessons", target = "filialDTOs.groupDTOs.calendarLessonDTOs")*/
//    @Mapping(source = "calendarLessons.lesson", target = "calendarLessonDTOs.lessonDTO")
    MainCenterDTO toDTO(MainCenter mainCenter);


    @Mapping(source = "filialDTOs", target = "filials")
    @Mapping(source = "groupDTOs", target = "groups")
    //@Mapping(source="filialDTOs.groupDTOs",target="filials.groups")
    /*@Mapping(source = "groupDTOs.teacherDTO", target = "groups.teacher")
    @Mapping(source = "groupDTOs.weekDayAndTimeDTOs", target = "groups.weekDayAndTimes")
    @Mapping(source = "groupDTOs.courseDTO", target = "groups.course")
    @Mapping(source = "groupDTOs.courseDTO.lessonDTOs", target = "groups.course.lessons")
    @Mapping(source = "groupDTOs.courseDTO.technologyDTOs", target = "groups.course.technologies")
    @Mapping(source = "groupDTOs.studentDTOs", target = "groups.students")
    @Mapping(source = "groupDTOs.calendarLessonDTOs", target = "groups.calendarLessons")*/
        //@Mapping(source = "filialDTOs.groupDTOs", target = "filials.groups")
    /*@Mapping(source = "filialDTOs.groupDTOs.teacherDTO", target = "filials.groups.teacher")
    @Mapping(source = "filialDTOs.groupDTOs.weekDayAndTimeDTOs", target = "filials.groups.weekDayAndTimes")
    @Mapping(source = "filialDTOs.groupDTOs.courseDTO", target = "filials.groups.course")
    @Mapping(source = "filialDTOs.groupDTOs.courseDTO.lessonDTOs", target = "filials.groups.course.lessons")
    @Mapping(source = "filialDTOs.groupDTOs.courseDTO.technologyDTOs", target = "filials.groups.course.technologies")
    @Mapping(source = "filialDTOs.groupDTOs.studentDTOs", target = "filials.groups.students")
    @Mapping(source = "filialDTOs.groupDTOs.calendarLessonDTOs", target = "filials.groups.calendarLessons")*/
        //static
        // static
//    @Mapping(source = "calendarLessonDTOs.lessonDTO", target = "calendarLessons.lesson")
    MainCenter toModel(MainCenterDTO mainCenterDTO);

    //MainCenter toModel(MainCenterDTO mainCenterDTO);
}
