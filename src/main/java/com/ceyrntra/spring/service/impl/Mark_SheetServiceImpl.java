package com.ceyrntra.spring.service.impl;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.CommonMarkSheetDTO;
import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.entity.Mark_Sheet;
import com.ceyrntra.spring.entity.Question;
import com.ceyrntra.spring.exception.RecordNotFoundException;
import com.ceyrntra.spring.mapper.Mark_SheetMapper;
import com.ceyrntra.spring.repo.Mark_SheetRepo;
import com.ceyrntra.spring.repo.QuestionRepo;
import com.ceyrntra.spring.service.Mark_SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class Mark_SheetServiceImpl implements Mark_SheetService {
    @Autowired
    private Mark_SheetRepo mark_sheetRepo;
    @Autowired
    private QuestionRepo questionRepo;

    @Autowired
    private Mark_SheetMapper mark_sheetMapper;

    @Override
    public void saveMark_Sheet(CommonMarkSheetDTO dto) {

        for (Mark_SheetDTO sheetDTO : dto.getMarkSheetDTOS()){

            Question question = questionRepo.findById(sheetDTO.getQuestion_id()).orElseThrow(() ->
                    new RecordNotFoundException("Question Not Found"));

            String correct_answer = question.getCorrect_answer();

            String isCorrect = "Wrong";

            if (correct_answer.equals(sheetDTO.getSubmit_answer())){
                isCorrect = "Correct";
            }

            Mark_SheetDTO mark_sheetDTO = new Mark_SheetDTO(
                    isCorrect,
                    sheetDTO.getSubmit_answer(),
                    dto.getStudentMail(),
                    sheetDTO.getQuestion_id(),
                    sheetDTO.getPaper_id()
            );

            mark_sheetRepo.save(mark_sheetMapper.sourceMark_SheetDTOToMark_Sheet(mark_sheetDTO));

        }

    }

    @Override
    public void updateMark_Sheet(Mark_SheetDTO dto) {

    }

    @Override
    public AnswerDTO searchMark_Sheet(String id) {
        return null;
    }

    @Override
    public void deleteMark_Sheet(String id) {

    }

    @Override
    public List<Mark_SheetDTO> getAllMark_Sheet() {

        List<Mark_SheetDTO> mark_sheetDTO = new ArrayList<>();
        List<Mark_Sheet> all = mark_sheetRepo.findAll();

        for (Mark_Sheet mark_sheet : all) {
            mark_sheetDTO.add(mark_sheetMapper.sourceMark_SheetToMark_SheetDTO(mark_sheet));
        }
        return mark_sheetDTO;
    }
}
