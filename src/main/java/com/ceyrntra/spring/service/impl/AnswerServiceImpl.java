package com.ceyrntra.spring.service.impl;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.entity.Answer;
import com.ceyrntra.spring.entity.Student;
import com.ceyrntra.spring.mapper.AnswerMapper;
import com.ceyrntra.spring.mapper.StudentMapper;
import com.ceyrntra.spring.repo.AnswerRepo;
import com.ceyrntra.spring.repo.StudentRepo;
import com.ceyrntra.spring.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerRepo answerRepo;
    @Autowired
    private AnswerMapper answerMapper;
    @Override
    public void saveAnswer(AnswerDTO answerDTOS) {
        answerRepo.save( answerMapper.sourceAnswerDTOToAnswer(answerDTOS));
    }

    @Override
    public void updateAnswer(AnswerDTO dto) {

    }
    @Override
    public AnswerDTO searchAnswer(String id) {
        return null;
    }

    @Override
    public void deleteAnswer(String id) {

    }

    @Override
    public List<AnswerDTO> getAllAnswer() {


        List<AnswerDTO> answerDTOList = new ArrayList<>();
        List<Answer> all = answerRepo.findAll();

        for (Answer answer : all) {
            answerDTOList.add(answerMapper.sourceAnswerToAnswerDTO(answer));
        }
        return answerDTOList;
    }
}
