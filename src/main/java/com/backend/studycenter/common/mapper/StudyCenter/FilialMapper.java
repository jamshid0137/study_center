package com.backend.studycenter.common.mapper.StudyCenter;






import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.model.studycenter.Filial;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface FilialMapper {
    FilialMapper INSTANCE = Mappers.getMapper(FilialMapper.class);








    @Mapping(source = "groups", target = "groupDTOs")
    /*@Mapping(source = "groups.teacher", target = "groupDTOs.teacherDTO")
    @Mapping(source = "groups.weekDayAndTimes", target = "groupDTOs.weekDayAndTimeDTOs")
    @Mapping(source = "groups.course", target = "groupDTOs.courseDTO")
    @Mapping(source = "groups.course.lessons", target = "groupDTOs.courseDTO.lessonDTOs")
    @Mapping(source = "groups.course.technologies", target = "groupDTOs.courseDTO.technologyDTOs")
    @Mapping(source = "groups.students", target = "groupDTOs.studentDTOs")
    @Mapping(source = "groups.calendarLessons", target = "groupDTOs.calendarLessonDTOs")*/




   // static
//    @Mapping(source = "calendarLessons.lesson", target = "calendarLessonDTOs.lessonDTO")
    //@Mapping(source="filial",target = "filialDTO")
    FilialDTO toDTO(Filial filial);











    @Mapping(source = "groupDTOs", target = "groups")
    /*@Mapping(source = "groupDTOs.teacherDTO", target = "groups.teacher")
    @Mapping(source = "groupDTOs.weekDayAndTimeDTOs", target = "groups.weekDayAndTimes")
    @Mapping(source = "groupDTOs.courseDTO", target = "groups.course")
    @Mapping(source = "groupDTOs.courseDTO.lessonDTOs", target = "groups.course.lessons")
    @Mapping(source = "groupDTOs.courseDTO.technologyDTOs", target = "groups.course.technologies")
    @Mapping(source = "groupDTOs.studentDTOs", target = "groups.students")
    @Mapping(source = "groupDTOs.calendarLessonDTOs", target = "groups.calendarLessons")*/
    //static
        //static
//    @Mapping(source = "calendarLessonDTOs.lessonDTO", target = "calendarLessons.lesson")

    //@Mapping(source = "filialDTO",target="filial")
   Filial toModel(FilialDTO filialDTO);
}












/*
import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.model.studycenter.Filial;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FilialMapper {
    FilialMapper INSTANCE= Mappers.getMapper(FilialMapper.class);
    //FilialMapper INSTANCE= Mappers.getMapperClass(FilialMapper.class);
    //@Mapping(source="filials",target="filialDTOs")
    @Mapping(source="groups",target="groupDTOs")
    FilialDTO toDTO(Filial filial);

    //@Mapping(source="filialDTOs",target="filials")
    @Mapping(source="groupDTOs",target="groups")
    Filial toModel(FilialDTO filialDTO);

}*/
