package com.ceyrntra.spring.mapper.impl;

import com.ceyrntra.spring.dto.QuestionDTO;
import com.ceyrntra.spring.entity.Paper;
import com.ceyrntra.spring.entity.Question;
import com.ceyrntra.spring.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

@Service
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public Question sourceQuestionDTOToQuestion(QuestionDTO questionDTO) {
        if(questionDTO==null){
         return null;
        }
        return new Question(questionDTO.getQuestion(),questionDTO.getCorrect_answer(),new Paper(questionDTO.getPaper_id()));

    }

    @Override
    public QuestionDTO sourceQuestionToQuestionDTO(Question question) {
        if(question==null){
            return null;
        }

        return new QuestionDTO(question.getQ_id(),question.getQuestion(),question.getCorrect_answer(),question.getPaper().getP_id());
    }
}
