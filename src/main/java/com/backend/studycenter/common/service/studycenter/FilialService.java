package com.backend.studycenter.common.service.studycenter;

//public class FilialService {



/*


import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.mapper.StudyCenter.FilialMapper;
import com.backend.studycenter.common.model.studycenter.Filial;

import java.util.ArrayList;
import java.util.Optional;

import com.backend.studycenter.common.repository.studycenter.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilialService {
    @Autowired
    private FilialRepository filialRepository;
    @Autowired
    private FilialService filialService;

    public ArrayList<Filial> getFilials() {
        return (ArrayList<Filial>) filialRepository.findAll();
    }

    public ArrayList<Filial> getFilialsById(Long filialId) throws EntityNotFoundException {
        ArrayList<Filial> filials = new ArrayList<>();
        Filial filial = filialService.getFilialById(filialId);
        for (Lesson lesson : course.getLessons()) {
            lessons.add(lesson);
        }
        return lessons;
    }

    public Filial getFilialById(Long filialId) throws EntityNotFoundException {
        Filial filial = filialRepository.findById(filialId)
                .orElseThrow(() -> new EntityNotFoundException("Not found filial with id = " + filialId));
        return filial;
    }


    public Filial addFilial(FilialDTO filialDTO) {
        return filialRepository.save(FilialMapper.toModel(filialDTO));
    }

    public void deleteFilial(Long filialId) throws EntityNotFoundException {
        Filial filial = filialRepository.findById(filialId)
                .orElseThrow(() -> new EntityNotFoundException("Not found filial with id = " + filialId));
        filialRepository.delete(filial);
    }

    //public Filial updateFilial(FilialDTO filialDTO, Long filialId) throws EntityNotFoundException {
        Optional<Filial> filialOptional = filialRepository.findById(filialId);
        if (filialOptional.isEmpty()) {
            throw new EntityNotFoundException("Not found filial with id = " + filialId);
        } else {
            Filial filial = filialOptional.get();
            return filialRepository.save(FilialMapper.INSTANCE.toModel(filialDTO, filial));
        }
    }

    public void clear() {
        filialRepository.deleteAll();
    }
}
*/














import com.backend.studycenter.common.dto.education.GroupDTO;
import com.backend.studycenter.common.dto.studycenter.FilialDTO;
import com.backend.studycenter.common.exception.EntityNotFoundException;
import com.backend.studycenter.common.exception.NotValidException;
import com.backend.studycenter.common.mapper.StudyCenter.FilialMapper;
import com.backend.studycenter.common.mapper.education.GroupMapper;
import com.backend.studycenter.common.model.course.Lesson;
import com.backend.studycenter.common.model.education.CalendarLesson;
import com.backend.studycenter.common.model.education.Group;
import com.backend.studycenter.common.model.education.WeekDayAndTime;
import com.backend.studycenter.common.model.studycenter.Filial;
import com.backend.studycenter.common.repository.education.CalendarLessonRepository;
import com.backend.studycenter.common.repository.education.GroupRepository;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.backend.studycenter.common.repository.studycenter.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilialService {
    @Autowired
    private FilialRepository filialRepository;


    public ArrayList<Filial> getFilials() {
        return (ArrayList<Filial>) filialRepository.findAll();
    }

    public Filial getFilialById(Long filialId) throws EntityNotFoundException {
        return filialRepository.findById(filialId).orElseThrow(() -> new EntityNotFoundException("Not found filial by id = " + filialId));
    }

    public Filial addFilial(FilialDTO filialDTO) {
        return filialRepository.save(FilialMapper.INSTANCE.toModel(filialDTO));
    }

    public void deleteFilial(Long filialId) throws EntityNotFoundException {
        Filial filial = filialRepository.findById(filialId).orElseThrow(() -> new EntityNotFoundException("Not found filial by id = " + filialId));
        filialRepository.delete(filial);
    }

    public Filial updateFilial(FilialDTO filialDTO, Long filialId) throws EntityNotFoundException {
        Filial existingFilial = filialRepository.findById(filialId).orElseThrow(() -> new EntityNotFoundException("Not found filial by id = " + filialId));
        Filial updatedFilial = FilialMapper.INSTANCE.toModel(filialDTO);
        updatedFilial.setId(existingFilial.getId());
        return filialRepository.save(updatedFilial);
    }

    public void clear() {
        filialRepository.deleteAll();
    }
}

