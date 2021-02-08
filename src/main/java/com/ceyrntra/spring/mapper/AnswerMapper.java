package com.ceyrntra.spring.mapper;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.entity.Answer;
import com.ceyrntra.spring.entity.Paper;

public interface AnswerMapper {
    Answer sourceAnswerDTOToAnswer(AnswerDTO answerDTO);
    AnswerDTO sourceAnswerToAnswerDTO(Answer answer);
}
