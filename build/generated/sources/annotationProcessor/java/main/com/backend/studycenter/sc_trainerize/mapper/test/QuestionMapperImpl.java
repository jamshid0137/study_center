package com.backend.studycenter.sc_trainerize.mapper.test;

import com.backend.studycenter.sc_trainerize.dto.test.AnswerDTO;
import com.backend.studycenter.sc_trainerize.dto.test.QuestionDTO;
import com.backend.studycenter.sc_trainerize.model.test.Answer;
import com.backend.studycenter.sc_trainerize.model.test.Question;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public QuestionDTO toDTO(Question question) {
        if ( question == null ) {
            return null;
        }

        QuestionDTO questionDTO = new QuestionDTO();

        questionDTO.setAnswerDTOS( answerListToAnswerDTOList( question.getAnswers() ) );
        questionDTO.setId( question.getId() );
        questionDTO.setText( question.getText() );
        questionDTO.setMark( question.getMark() );
        questionDTO.setVariantId( question.getVariantId() );
        questionDTO.setTypeQuestions( question.getTypeQuestions() );

        return questionDTO;
    }

    @Override
    public Question toModel(QuestionDTO questionDTO) {
        if ( questionDTO == null ) {
            return null;
        }

        Question question = new Question();

        question.setAnswers( answerDTOListToAnswerList( questionDTO.getAnswerDTOS() ) );
        question.setId( questionDTO.getId() );
        question.setText( questionDTO.getText() );
        question.setMark( questionDTO.getMark() );
        question.setVariantId( questionDTO.getVariantId() );
        question.setTypeQuestions( questionDTO.getTypeQuestions() );

        return question;
    }

    @Override
    public Question updateQuestion(Question question, QuestionDTO questionDTO) {
        if ( questionDTO == null ) {
            return question;
        }

        question.setId( questionDTO.getId() );
        question.setText( questionDTO.getText() );
        question.setMark( questionDTO.getMark() );
        question.setVariantId( questionDTO.getVariantId() );
        question.setTypeQuestions( questionDTO.getTypeQuestions() );

        return question;
    }

    protected AnswerDTO answerToAnswerDTO(Answer answer) {
        if ( answer == null ) {
            return null;
        }

        AnswerDTO answerDTO = new AnswerDTO();

        answerDTO.setId( answer.getId() );
        answerDTO.setAnswerText( answer.getAnswerText() );
        answerDTO.setTrue( answer.isTrue() );

        return answerDTO;
    }

    protected List<AnswerDTO> answerListToAnswerDTOList(List<Answer> list) {
        if ( list == null ) {
            return null;
        }

        List<AnswerDTO> list1 = new ArrayList<AnswerDTO>( list.size() );
        for ( Answer answer : list ) {
            list1.add( answerToAnswerDTO( answer ) );
        }

        return list1;
    }

    protected Answer answerDTOToAnswer(AnswerDTO answerDTO) {
        if ( answerDTO == null ) {
            return null;
        }

        Answer answer = new Answer();

        answer.setId( answerDTO.getId() );
        answer.setAnswerText( answerDTO.getAnswerText() );
        answer.setTrue( answerDTO.isTrue() );

        return answer;
    }

    protected List<Answer> answerDTOListToAnswerList(List<AnswerDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Answer> list1 = new ArrayList<Answer>( list.size() );
        for ( AnswerDTO answerDTO : list ) {
            list1.add( answerDTOToAnswer( answerDTO ) );
        }

        return list1;
    }
}
