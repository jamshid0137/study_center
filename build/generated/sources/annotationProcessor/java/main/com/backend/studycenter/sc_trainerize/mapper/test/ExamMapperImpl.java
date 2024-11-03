package com.backend.studycenter.sc_trainerize.mapper.test;

import com.backend.studycenter.sc_trainerize.dto.test.ExamDTO;
import com.backend.studycenter.sc_trainerize.model.test.Exam;
import com.backend.studycenter.sc_trainerize.model.topic.Module;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ExamMapperImpl implements ExamMapper {

    @Override
    public ExamDTO toDTO(Exam exam) {
        if ( exam == null ) {
            return null;
        }

        ExamDTO examDTO = new ExamDTO();

        examDTO.setId( exam.getId() );
        examDTO.setDate( exam.getDate() );
        examDTO.setTypeOfExam( exam.getTypeOfExam() );
        List<Module> list = exam.getModules();
        if ( list != null ) {
            examDTO.setModules( new ArrayList<Module>( list ) );
        }

        return examDTO;
    }

    @Override
    public Exam toModel(ExamDTO examDTO) {
        if ( examDTO == null ) {
            return null;
        }

        Exam exam = new Exam();

        exam.setId( examDTO.getId() );
        exam.setDate( examDTO.getDate() );
        exam.setTypeOfExam( examDTO.getTypeOfExam() );
        List<Module> list = examDTO.getModules();
        if ( list != null ) {
            exam.setModules( new ArrayList<Module>( list ) );
        }

        return exam;
    }
}
