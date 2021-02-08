package com.ceyrntra.spring.service;

import com.ceyrntra.spring.dto.AnswerDTO;

import java.util.List;

public interface AnswerService {
    void saveAnswer(AnswerDTO answerDTOS);
    void updateAnswer(AnswerDTO dto);
    AnswerDTO searchAnswer(String id);
    void deleteAnswer(String id);
    List<AnswerDTO> getAllAnswer();
}
