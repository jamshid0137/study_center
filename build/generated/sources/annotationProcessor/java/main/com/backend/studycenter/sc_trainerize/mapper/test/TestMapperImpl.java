package com.backend.studycenter.sc_trainerize.mapper.test;

import com.backend.studycenter.sc_trainerize.dto.test.QuestionDTO;
import com.backend.studycenter.sc_trainerize.dto.test.TestDTO;
import com.backend.studycenter.sc_trainerize.model.test.Question;
import com.backend.studycenter.sc_trainerize.model.test.Test;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class TestMapperImpl implements TestMapper {

    @Override
    public TestDTO toDTO(Test test) {
        if ( test == null ) {
            return null;
        }

        TestDTO testDTO = new TestDTO();

        testDTO.setQuestionDTOS( questionListToQuestionDTOList( test.getQuestions() ) );
        testDTO.setId( test.getId() );
        testDTO.setName( test.getName() );

        return testDTO;
    }

    @Override
    public Test toModel(TestDTO testDTO) {
        if ( testDTO == null ) {
            return null;
        }

        Test test = new Test();

        test.setQuestions( questionDTOListToQuestionList( testDTO.getQuestionDTOS() ) );
        test.setId( testDTO.getId() );
        test.setName( testDTO.getName() );

        return test;
    }

    @Override
    public Test update(Test test, TestDTO testDTO) {
        if ( testDTO == null ) {
            return test;
        }

        if ( test.getQuestions() != null ) {
            List<Question> list = questionDTOListToQuestionList( testDTO.getQuestionDTOS() );
            if ( list != null ) {
                test.getQuestions().clear();
                test.getQuestions().addAll( list );
            }
            else {
                test.setQuestions( null );
            }
        }
        else {
            List<Question> list = questionDTOListToQuestionList( testDTO.getQuestionDTOS() );
            if ( list != null ) {
                test.setQuestions( list );
            }
        }
        test.setId( testDTO.getId() );
        test.setName( testDTO.getName() );

        return test;
    }

    protected QuestionDTO questionToQuestionDTO(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setId( question.getId() );
        questionDTO.setText( question.getText() );
        questionDTO.setMark( question.getMark() );
        questionDTO.setVariantId( question.getVariantId() );
        questionDTO.setTypeQuestions( question.getTypeQuestions() );

        return questionDTO;
    }

    protected List<QuestionDTO> questionListToQuestionDTOList(List<Question> list) {
        if ( list == null ) {
            return null;
        }

        List<QuestionDTO> list1 = new ArrayList<QuestionDTO>( list.size() );
        for ( Question question : list ) {
            list1.add( questionToQuestionDTO( question ) );
        }

        return list1;
    }

    protected Question questionDTOToQuestion(QuestionDTO questionDTO) {
        if ( questionDTO == null ) {
            return null;
        }

        Question question = new Question();

        question.setId( questionDTO.getId() );
        question.setText( questionDTO.getText() );
        question.setMark( questionDTO.getMark() );
        question.setVariantId( questionDTO.getVariantId() );
        question.setTypeQuestions( questionDTO.getTypeQuestions() );

        return question;
    }

    protected List<Question> questionDTOListToQuestionList(List<QuestionDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Question> list1 = new ArrayList<Question>( list.size() );
        for ( QuestionDTO questionDTO : list ) {
            list1.add( questionDTOToQuestion( questionDTO ) );
        }

        return list1;
    }
}
