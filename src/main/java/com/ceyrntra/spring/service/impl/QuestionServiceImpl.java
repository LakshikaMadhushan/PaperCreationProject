package com.ceyrntra.spring.service.impl;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.dto.QuestionDTO;
import com.ceyrntra.spring.entity.Answer;
import com.ceyrntra.spring.entity.Paper;
import com.ceyrntra.spring.entity.Question;
import com.ceyrntra.spring.mapper.AnswerMapper;
import com.ceyrntra.spring.mapper.QuestionMapper;
import com.ceyrntra.spring.repo.AnswerRepo;
import com.ceyrntra.spring.repo.QuestionRepo;
import com.ceyrntra.spring.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;
    @Autowired
    QuestionRepo questionRepo;
    @Autowired
    AnswerMapper answerMapper;
    @Autowired
    AnswerRepo answerRepo;

    @Override
    public void saveQuestion(QuestionDTO dto) {
        questionRepo.save( questionMapper.sourceQuestionDTOToQuestion(dto));
    }

    @Override
    public void updateQuestion(QuestionDTO dto) {

    }

    @Override
    public QuestionDTO searchQuestion(String id) {
        return null;
    }

    @Override
    public void deleteQuestion(String id) {

    }

    @Override
    public List<QuestionDTO> getAllQuestion() {
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        List<Question> all = questionRepo.findAll();

        for (Question question : all) {
            questionDTOList.add(questionMapper.sourceQuestionToQuestionDTO(question));
        }
        return questionDTOList;
    }

    @Override
    public List<QuestionDTO> getAllQuestionByPaperId(int paperId) {
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        List<Question> all = questionRepo.getAllQuestionByPaperId(paperId);
        List<AnswerDTO> answerDTOS = new ArrayList<>();

        for (Question question : all) {
            List<Answer> answerList = answerRepo.getAllAnswersByQuestionId(question.getQ_id());
            for (Answer answer : answerList){
                answerDTOS.add(answerMapper.sourceAnswerToAnswerDTO(answer));
            }
            QuestionDTO questionDTO = questionMapper.sourceQuestionToQuestionDTO(question);
            questionDTO.setAnswerDTOList(answerDTOS);
            questionDTOList.add(questionDTO);

        }
        return questionDTOList;
    }
}
