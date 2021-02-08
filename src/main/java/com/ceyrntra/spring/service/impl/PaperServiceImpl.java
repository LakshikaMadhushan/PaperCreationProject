package com.ceyrntra.spring.service.impl;

import com.ceyrntra.spring.dto.*;
import com.ceyrntra.spring.entity.*;
import com.ceyrntra.spring.mapper.AnswerMapper;
import com.ceyrntra.spring.mapper.PapersMapper;
import com.ceyrntra.spring.mapper.QuestionMapper;
import com.ceyrntra.spring.repo.AnswerRepo;
import com.ceyrntra.spring.repo.PaperRepo;
import com.ceyrntra.spring.repo.QuestionRepo;
import com.ceyrntra.spring.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class PaperServiceImpl implements PaperService {
    @Autowired
    PapersMapper papersMapper;

    @Autowired
    AnswerMapper answerMapper;

    @Autowired
    QuestionMapper questionMapper;

    @Autowired
    PaperRepo paperRepo;

    @Autowired
    AnswerRepo answerRepo;

    @Autowired
    QuestionRepo questionRepo;

    @Override
    public void savePaper(commonDTO dto) {
        PaperDTO paperDTO = new PaperDTO(dto.getP_name(),dto.getTeacher());
        Paper save = paperRepo.save(papersMapper.sourcePaperDTOToPaper(paperDTO));

        List<QuestionDTO> questionDTOS=dto.getQuestionDTOList();

        for (QuestionDTO questionDTO :  questionDTOS) {
            questionDTO.setPaper_id(save.getP_id());
            Question question = questionRepo.save(questionMapper.sourceQuestionDTOToQuestion(questionDTO));
            List<AnswerDTO> answerDTOList = questionDTO.getAnswerDTOList();
            for (AnswerDTO answerDTO : answerDTOList){
                answerDTO.setQuestion_id(question.getQ_id());
                Answer answer = answerRepo.save(answerMapper.sourceAnswerDTOToAnswer(answerDTO));
            }
        }

    }

    @Override
    public void updatePaper(PaperDTO dto) {

    }

    @Override
    public PaperDTO searchPaper(String id) {
        return null;
    }

    @Override
    public void deletePaper(String id) {

    }

    @Override
    public List<PaperDTO> getAllPaper() {
        List<PaperDTO> PaperDTO = new ArrayList<>();
        List<Paper> all = paperRepo.findAll();

        for (Paper paper : all) {
            PaperDTO.add(papersMapper.sourcePaperToPaperDTO(paper));
        }
        return PaperDTO;
    }
}
