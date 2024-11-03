package com.backend.studycenter.common.service.course;

import com.backend.studycenter.common.dto.course.CourseDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.mapper.course.CourseMapper;
import com.backend.studycenter.common.model.course.Course;
import com.backend.studycenter.common.repository.course.CourseRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public ArrayList<Course> getCourses() {
        return (ArrayList<Course>) courseRepository.findAll();
    }

    public Course getCourseById(Long courseId) throws EntityNotFoundException {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new EntityNotFoundException("Not found course with id = " + courseId));
        return course;
    }

    public Course addCourse(CourseDTO courseDTO) {
        return courseRepository.save(CourseMapper.toModel(courseDTO));
    }

    public void deleteCourse(Long courseId) throws EntityNotFoundException {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new EntityNotFoundException("Not found course with id = " + courseId));
        courseRepository.delete(course);
    }

    public Course updateCourse(CourseDTO courseDTO, Long courseId) throws EntityNotFoundException {
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        if (courseOptional.isEmpty()) {
            throw new EntityNotFoundException("Not found course with id = " + courseId);
        } else {
            Course course = courseOptional.get();
            return courseRepository.save(CourseMapper.toModel(courseDTO, course));
        }
    }

    public void clear() {
        courseRepository.deleteAll();
    }
}
