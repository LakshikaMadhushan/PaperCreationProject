package com.ceyrntra.spring.mapper;

import com.ceyrntra.spring.dto.QuestionDTO;
import com.ceyrntra.spring.entity.Question;

public interface QuestionMapper {
    Question sourceQuestionDTOToQuestion(QuestionDTO questionDTO);

    QuestionDTO sourceQuestionToQuestionDTO(Question question);
}
