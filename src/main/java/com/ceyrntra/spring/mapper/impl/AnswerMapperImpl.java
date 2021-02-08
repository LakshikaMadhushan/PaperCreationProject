package com.ceyrntra.spring.mapper.impl;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.entity.Answer;
import com.ceyrntra.spring.entity.Question;
import com.ceyrntra.spring.mapper.AnswerMapper;
import org.springframework.stereotype.Service;

@Service
public class AnswerMapperImpl implements AnswerMapper {
    @Override
    public Answer sourceAnswerDTOToAnswer(AnswerDTO answerDTO) {
        if(answerDTO==null){
            return null;
        }
        return new Answer(answerDTO.getAnswer(),new Question(answerDTO.getQuestion_id()));
    }

    @Override
    public AnswerDTO sourceAnswerToAnswerDTO(Answer answer) {
        if(answer==null){
            return null;
        }
        return new AnswerDTO(answer.getA_id(),answer.getAnswer(),answer.getQuestion().getQ_id());
    }
}
