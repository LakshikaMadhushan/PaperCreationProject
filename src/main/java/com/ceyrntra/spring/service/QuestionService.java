package com.ceyrntra.spring.service;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.dto.QuestionDTO;
import com.ceyrntra.spring.entity.Question;

import java.util.List;

public interface QuestionService {
    void saveQuestion(QuestionDTO dto);
    void updateQuestion(QuestionDTO dto);
    QuestionDTO searchQuestion(String id);
    void deleteQuestion(String id);
    List<QuestionDTO> getAllQuestion();

    List<QuestionDTO> getAllQuestionByPaperId(int paperId);
}
