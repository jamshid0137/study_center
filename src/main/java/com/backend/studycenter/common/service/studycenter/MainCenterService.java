package com.backend.studycenter.common.service.studycenter;

//public class MainCenterService {



/*

import com.backend.studycenter.common.dto.course.CourseDTO;
import com.backend.studycenter.common.dto.studycenter.MainCenterDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.mapper.StudyCenter.MainCenterMapper;
import com.backend.studycenter.common.mapper.course.CourseMapper;
import com.backend.studycenter.common.model.course.Course;
import com.backend.studycenter.common.model.studycenter.MainCenter;
import com.backend.studycenter.common.repository.course.CourseRepository;
import java.util.ArrayList;
import java.util.Optional;

import com.backend.studycenter.common.repository.studycenter.MainCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainCenterService {
    @Autowired
    private MainCenterRepository mainCenterRepository;
//course to maincenter
//
    public ArrayList<MainCenter> getMainCenter() {
        return (ArrayList<MainCenter>) MainCenterRepository.findAll();
    }

    /*public Course getCourseById(Long courseId) throws EntityNotFoundException {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new EntityNotFoundException("Not found course with id = " + courseId));
        return course;
    }*/

 /*   public MainCenter addMainCenter(MainCenterDTO mainCenterDTO) {
        return mainCenterRepository.save(MainCenterMapper.toModel(mainCenterDTO));
    }
/*
    public void deleteCourse(Long courseId) throws EntityNotFoundException {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new EntityNotFoundException("Not found course with id = " + courseId));
        courseRepository.delete(course);
    }*

    public MainCenter updateMainCenter(MainCenterDTO mainCenterDTO, Long mainCenterId) throws EntityNotFoundException {
        Optional<MainCenter> mainCenterOptional = mainCenterRepository.findById(mainCenterId);
        if (mainCenterOptional.isEmpty()) {
            throw new EntityNotFoundException("Not found mainCenter with id = " + mainCenterId);
        } else {
            MainCenter mainCenter = mainCenterOptional.get();
            return mainCenterRepository.save(MainCenterMapper.toModel(mainCenterDTO, mainCenter));
        }
    }

    public void clear() {
        mainCenterRepository.deleteAll();
    }
}*/












//package com.backend.studycenter.common.service.education;

import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.studycenter.MainCenterDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.exception.NotValidException;
import com.backend.studycenter.common.mapper.StudyCenter.MainCenterMapper;
import com.backend.studycenter.common.mapper.education.GroupMapper;
import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.education.CalendarLesson;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.education.WeekDayAndTime;
import com.backend.studycenter.common.model.studycenter.MainCenter;
import com.backend.studycenter.common.repository.education.CalendarLessonRepository;
import com.backend.studycenter.common.repository.education.GroupRepository;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.backend.studycenter.common.repository.studycenter.MainCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainCenterService {
    @Autowired
    private MainCenterRepository mainCenterRepository;


    public ArrayList<MainCenter> getMainCenter() {
        return (ArrayList<MainCenter>) mainCenterRepository.findAll();
    }

    public MainCenter getMainCenterById(Long mainCenterId) throws EntityNotFoundException {
        MainCenter mainCenter = mainCenterRepository.findById(mainCenterId).orElseThrow(() -> new EntityNotFoundException("Not found mainCenter by id = " + mainCenterId));
        return mainCenter;
    }

    public MainCenter addMainCenter(MainCenterDTO mainCenterDTO) {
        return mainCenterRepository.save(MainCenterMapper.INSTANCE.toModel(mainCenterDTO));
    }

    public void deleteMainCenter(Long mainCenterId) throws EntityNotFoundException {
        MainCenter mainCenter = mainCenterRepository.findById(mainCenterId).orElseThrow(() -> new EntityNotFoundException("Not found mainCenter by id = " + mainCenterId));
        mainCenterRepository.delete(mainCenter);
    }

    public MainCenter updateMainCenter(MainCenterDTO mainCenterDTO, Long mainCenterId) throws EntityNotFoundException {
        MainCenter existingMainCenter = mainCenterRepository.findById(mainCenterId).orElseThrow(() -> new EntityNotFoundException("Not found mainCenter by id = " + mainCenterId));
        MainCenter updatedMainCenter = MainCenterMapper.INSTANCE.toModel(mainCenterDTO);
        updatedMainCenter.setId(existingMainCenter.getId());
        return mainCenterRepository.save(updatedMainCenter);
    }

    public void clear() {
        mainCenterRepository.deleteAll();
    }
}






