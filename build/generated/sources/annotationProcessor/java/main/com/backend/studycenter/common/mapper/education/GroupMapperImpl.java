package com.backend.studycenter.common.mapper.education;

import com.backend.studycenter.common.dto.course.CourseDTO;
import com.backend.studycenter.common.dto.course.LessonDTO;
import com.backend.studycenter.common.dto.course.TechnologyDTO;
import com.backend.studycenter.common.dto.education.CalendarLessonDTO;
import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.education.WeekDayAndTimeDTO;
import com.backend.studycenter.common.dto.person.StudentDTO;
import com.backend.studycenter.common.dto.person.TeacherDTO;
import com.backend.studycenter.common.model.course.Course;
import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.course.Technology;
import com.backend.studycenter.common.model.education.CalendarLesson;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.education.WeekDayAndTime;
import com.backend.studycenter.common.model.person.Student;
import com.backend.studycenter.common.model.person.Teacher;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class GroupMapperImpl implements GroupMapper {

    @Override
    public GroupDTO toDTO(Group group) {
        if ( group == null ) {
            return null;
        }

        GroupDTO groupDTO = new GroupDTO();

        groupDTO.setCourseDTO( courseToCourseDTO( group.getCourse() ) );
        groupDTO.setTeacherDTO( teacherToTeacherDTO( group.getTeacher() ) );
        groupDTO.setWeekDayAndTimeDTOs( weekDayAndTimeListToWeekDayAndTimeDTOList( group.getWeekDayAndTimes() ) );
        groupDTO.setStudentDTOs( studentListToStudentDTOList( group.getStudents() ) );
        groupDTO.setCalendarLessonDTOs( calendarLessonListToCalendarLessonDTOList( group.getCalendarLessons() ) );
        groupDTO.setId( group.getId() );
        groupDTO.setName( group.getName() );
        groupDTO.setDescription( group.getDescription() );
        groupDTO.setStartDate( group.getStartDate() );

        return groupDTO;
    }

    @Override
    public Group toModel(GroupDTO groupDTO) {
        if ( groupDTO == null ) {
            return null;
        }

        Group group = new Group();

        group.setCourse( courseDTOToCourse( groupDTO.getCourseDTO() ) );
        group.setTeacher( teacherDTOToTeacher( groupDTO.getTeacherDTO() ) );
        group.setWeekDayAndTimes( weekDayAndTimeDTOListToWeekDayAndTimeList( groupDTO.getWeekDayAndTimeDTOs() ) );
        group.setStudents( studentDTOListToStudentList( groupDTO.getStudentDTOs() ) );
        group.setCalendarLessons( calendarLessonDTOListToCalendarLessonList( groupDTO.getCalendarLessonDTOs() ) );
        group.setId( groupDTO.getId() );
        group.setName( groupDTO.getName() );
        group.setDescription( groupDTO.getDescription() );
        group.setStartDate( groupDTO.getStartDate() );

        return group;
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

    protected List<LessonDTO> lessonListToLessonDTOList(List<Lesson> list) {
        if ( list == null ) {
            return null;
        }

        List<LessonDTO> list1 = new ArrayList<LessonDTO>( list.size() );
        for ( Lesson lesson : list ) {
            list1.add( lessonToLessonDTO( lesson ) );
        }

        return list1;
    }

    protected TechnologyDTO technologyToTechnologyDTO(Technology technology) {
        if ( technology == null ) {
            return null;
        }

        TechnologyDTO technologyDTO = new TechnologyDTO();

        technologyDTO.setId( technology.getId() );
        technologyDTO.setName( technology.getName() );
        technologyDTO.setDescription( technology.getDescription() );

        return technologyDTO;
    }

    protected List<TechnologyDTO> technologyListToTechnologyDTOList(List<Technology> list) {
        if ( list == null ) {
            return null;
        }

        List<TechnologyDTO> list1 = new ArrayList<TechnologyDTO>( list.size() );
        for ( Technology technology : list ) {
            list1.add( technologyToTechnologyDTO( technology ) );
        }

        return list1;
    }

    protected CourseDTO courseToCourseDTO(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setLessonDTOs( lessonListToLessonDTOList( course.getLessons() ) );
        courseDTO.setTechnologyDTOs( technologyListToTechnologyDTOList( course.getTechnologies() ) );
        courseDTO.setId( course.getId() );
        courseDTO.setName( course.getName() );
        courseDTO.setDescription( course.getDescription() );
        courseDTO.setDuration( course.getDuration() );
        courseDTO.setPrice( course.getPrice() );

        return courseDTO;
    }

    protected TeacherDTO teacherToTeacherDTO(Teacher teacher) {
        if ( teacher == null ) {
            return null;
        }

        TeacherDTO teacherDTO = new TeacherDTO();

        teacherDTO.setId( teacher.getId() );
        teacherDTO.setName( teacher.getName() );
        teacherDTO.setDescription( teacher.getDescription() );
        teacherDTO.setAddress( teacher.getAddress() );
        teacherDTO.setDateOfBirth( teacher.getDateOfBirth() );
        teacherDTO.setDateOfRegister( teacher.getDateOfRegister() );
        teacherDTO.setPhone( teacher.getPhone() );
        teacherDTO.setEmail( teacher.getEmail() );
        teacherDTO.setTelegramUserName( teacher.getTelegramUserName() );
        teacherDTO.setSpecialization( teacher.getSpecialization() );

        return teacherDTO;
    }

    protected WeekDayAndTimeDTO weekDayAndTimeToWeekDayAndTimeDTO(WeekDayAndTime weekDayAndTime) {
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

    protected List<WeekDayAndTimeDTO> weekDayAndTimeListToWeekDayAndTimeDTOList(List<WeekDayAndTime> list) {
        if ( list == null ) {
            return null;
        }

        List<WeekDayAndTimeDTO> list1 = new ArrayList<WeekDayAndTimeDTO>( list.size() );
        for ( WeekDayAndTime weekDayAndTime : list ) {
            list1.add( weekDayAndTimeToWeekDayAndTimeDTO( weekDayAndTime ) );
        }

        return list1;
    }

    protected StudentDTO studentToStudentDTO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setId( student.getId() );
        studentDTO.setName( student.getName() );
        studentDTO.setDescription( student.getDescription() );
        studentDTO.setAddress( student.getAddress() );
        studentDTO.setDateOfBirth( student.getDateOfBirth() );
        studentDTO.setDateOfRegister( student.getDateOfRegister() );
        studentDTO.setPhone( student.getPhone() );
        studentDTO.setEmail( student.getEmail() );
        studentDTO.setTelegramUserName( student.getTelegramUserName() );
        studentDTO.setLevel( student.getLevel() );
        studentDTO.setEducation( student.getEducation() );
        studentDTO.setEnglish( student.getEnglish() );
        studentDTO.setAdditionalInformation( student.getAdditionalInformation() );
        studentDTO.setStatus( student.getStatus() );

        return studentDTO;
    }

    protected List<StudentDTO> studentListToStudentDTOList(List<Student> list) {
        if ( list == null ) {
            return null;
        }

        List<StudentDTO> list1 = new ArrayList<StudentDTO>( list.size() );
        for ( Student student : list ) {
            list1.add( studentToStudentDTO( student ) );
        }

        return list1;
    }

    protected CalendarLessonDTO calendarLessonToCalendarLessonDTO(CalendarLesson calendarLesson) {
        if ( calendarLesson == null ) {
            return null;
        }

        CalendarLessonDTO calendarLessonDTO = new CalendarLessonDTO();

        calendarLessonDTO.setId( calendarLesson.getId() );
        calendarLessonDTO.setPlannedLessonDateTime( calendarLesson.getPlannedLessonDateTime() );
        calendarLessonDTO.setActualLessonDateTime( calendarLesson.getActualLessonDateTime() );
        calendarLessonDTO.setPlannedTeacher( calendarLesson.getPlannedTeacher() );
        calendarLessonDTO.setActualTeacher( calendarLesson.getActualTeacher() );
        calendarLessonDTO.setComment( calendarLesson.getComment() );

        return calendarLessonDTO;
    }

    protected List<CalendarLessonDTO> calendarLessonListToCalendarLessonDTOList(List<CalendarLesson> list) {
        if ( list == null ) {
            return null;
        }

        List<CalendarLessonDTO> list1 = new ArrayList<CalendarLessonDTO>( list.size() );
        for ( CalendarLesson calendarLesson : list ) {
            list1.add( calendarLessonToCalendarLessonDTO( calendarLesson ) );
        }

        return list1;
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

    protected List<Lesson> lessonDTOListToLessonList(List<LessonDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Lesson> list1 = new ArrayList<Lesson>( list.size() );
        for ( LessonDTO lessonDTO : list ) {
            list1.add( lessonDTOToLesson( lessonDTO ) );
        }

        return list1;
    }

    protected Technology technologyDTOToTechnology(TechnologyDTO technologyDTO) {
        if ( technologyDTO == null ) {
            return null;
        }

        Technology technology = new Technology();

        technology.setId( technologyDTO.getId() );
        technology.setName( technologyDTO.getName() );
        technology.setDescription( technologyDTO.getDescription() );

        return technology;
    }

    protected List<Technology> technologyDTOListToTechnologyList(List<TechnologyDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Technology> list1 = new ArrayList<Technology>( list.size() );
        for ( TechnologyDTO technologyDTO : list ) {
            list1.add( technologyDTOToTechnology( technologyDTO ) );
        }

        return list1;
    }

    protected Course courseDTOToCourse(CourseDTO courseDTO) {
        if ( courseDTO == null ) {
            return null;
        }

        Course course = new Course();

        course.setLessons( lessonDTOListToLessonList( courseDTO.getLessonDTOs() ) );
        course.setTechnologies( technologyDTOListToTechnologyList( courseDTO.getTechnologyDTOs() ) );
        course.setId( courseDTO.getId() );
        course.setName( courseDTO.getName() );
        course.setDescription( courseDTO.getDescription() );
        course.setDuration( courseDTO.getDuration() );
        course.setPrice( courseDTO.getPrice() );

        return course;
    }

    protected Teacher teacherDTOToTeacher(TeacherDTO teacherDTO) {
        if ( teacherDTO == null ) {
            return null;
        }

        Teacher teacher = new Teacher();

        teacher.setId( teacherDTO.getId() );
        teacher.setName( teacherDTO.getName() );
        teacher.setDescription( teacherDTO.getDescription() );
        teacher.setAddress( teacherDTO.getAddress() );
        teacher.setDateOfBirth( teacherDTO.getDateOfBirth() );
        teacher.setDateOfRegister( teacherDTO.getDateOfRegister() );
        teacher.setPhone( teacherDTO.getPhone() );
        teacher.setEmail( teacherDTO.getEmail() );
        teacher.setTelegramUserName( teacherDTO.getTelegramUserName() );
        teacher.setSpecialization( teacherDTO.getSpecialization() );

        return teacher;
    }

    protected WeekDayAndTime weekDayAndTimeDTOToWeekDayAndTime(WeekDayAndTimeDTO weekDayAndTimeDTO) {
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

    protected List<WeekDayAndTime> weekDayAndTimeDTOListToWeekDayAndTimeList(List<WeekDayAndTimeDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<WeekDayAndTime> list1 = new ArrayList<WeekDayAndTime>( list.size() );
        for ( WeekDayAndTimeDTO weekDayAndTimeDTO : list ) {
            list1.add( weekDayAndTimeDTOToWeekDayAndTime( weekDayAndTimeDTO ) );
        }

        return list1;
    }

    protected Student studentDTOToStudent(StudentDTO studentDTO) {
        if ( studentDTO == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentDTO.getId() );
        student.setName( studentDTO.getName() );
        student.setDescription( studentDTO.getDescription() );
        student.setAddress( studentDTO.getAddress() );
        student.setDateOfBirth( studentDTO.getDateOfBirth() );
        student.setDateOfRegister( studentDTO.getDateOfRegister() );
        student.setPhone( studentDTO.getPhone() );
        student.setEmail( studentDTO.getEmail() );
        student.setTelegramUserName( studentDTO.getTelegramUserName() );
        student.setLevel( studentDTO.getLevel() );
        student.setEducation( studentDTO.getEducation() );
        student.setEnglish( studentDTO.getEnglish() );
        student.setAdditionalInformation( studentDTO.getAdditionalInformation() );
        student.setStatus( studentDTO.getStatus() );

        return student;
    }

    protected List<Student> studentDTOListToStudentList(List<StudentDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Student> list1 = new ArrayList<Student>( list.size() );
        for ( StudentDTO studentDTO : list ) {
            list1.add( studentDTOToStudent( studentDTO ) );
        }

        return list1;
    }

    protected CalendarLesson calendarLessonDTOToCalendarLesson(CalendarLessonDTO calendarLessonDTO) {
        if ( calendarLessonDTO == null ) {
            return null;
        }

        CalendarLesson calendarLesson = new CalendarLesson();

        calendarLesson.setId( calendarLessonDTO.getId() );
        calendarLesson.setPlannedLessonDateTime( calendarLessonDTO.getPlannedLessonDateTime() );
        calendarLesson.setActualLessonDateTime( calendarLessonDTO.getActualLessonDateTime() );
        calendarLesson.setPlannedTeacher( calendarLessonDTO.getPlannedTeacher() );
        calendarLesson.setActualTeacher( calendarLessonDTO.getActualTeacher() );
        calendarLesson.setComment( calendarLessonDTO.getComment() );

        return calendarLesson;
    }

    protected List<CalendarLesson> calendarLessonDTOListToCalendarLessonList(List<CalendarLessonDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<CalendarLesson> list1 = new ArrayList<CalendarLesson>( list.size() );
        for ( CalendarLessonDTO calendarLessonDTO : list ) {
            list1.add( calendarLessonDTOToCalendarLesson( calendarLessonDTO ) );
        }

        return list1;
    }
}
