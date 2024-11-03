package com.backend.studycenter.sc_trainerize.mapper.test;

import com.backend.studycenter.sc_trainerize.dto.test.AnswerDTO;
import com.backend.studycenter.sc_trainerize.model.test.Answer;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-19T13:34:13+0500",
    comments = "version: 1.5.4.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.0.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class AnswerMapperImpl implements AnswerMapper {

    @Override
    public AnswerDTO toDTO(Answer answer) {
        if ( answer == null ) {
            return null;
        }

        AnswerDTO answerDTO = new AnswerDTO();

        answerDTO.setId( answer.getId() );
        answerDTO.setAnswerText( answer.getAnswerText() );
        answerDTO.setTrue( answer.isTrue() );

        return answerDTO;
    }

    @Override
    public Answer updateAnswer(Answer answer, AnswerDTO answerDTO) {
        if ( answerDTO == null ) {
            return answer;
        }

        answer.setId( answerDTO.getId() );
        answer.setAnswerText( answerDTO.getAnswerText() );
        answer.setTrue( answerDTO.isTrue() );

        return answer;
    }

    @Override
    public Answer toModel(AnswerDTO answerDTO) {
        if ( answerDTO == null ) {
            return null;
        }

        Answer answer = new Answer();

        answer.setId( answerDTO.getId() );
        answer.setAnswerText( answerDTO.getAnswerText() );
        answer.setTrue( answerDTO.isTrue() );

        return answer;
    }
}
