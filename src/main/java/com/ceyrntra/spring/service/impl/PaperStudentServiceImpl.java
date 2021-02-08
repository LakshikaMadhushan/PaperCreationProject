package com.ceyrntra.spring.service.impl;

import com.ceyrntra.spring.dto.Paper_StudentDTO;
import com.ceyrntra.spring.dto.QuestionDTO;
import com.ceyrntra.spring.entity.Paper_Student;
import com.ceyrntra.spring.entity.Question;
import com.ceyrntra.spring.mapper.PaperStudentMapper;
import com.ceyrntra.spring.repo.PaperStudentRepo;
import com.ceyrntra.spring.service.PaperStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaperStudentServiceImpl implements PaperStudentService {
    @Autowired
    PaperStudentMapper paperStudentMapper;
    @Autowired
    PaperStudentRepo paperStudentRepo;


    @Override
    public void savePaper_Student(Paper_StudentDTO dto) {
        paperStudentRepo.save(paperStudentMapper.sourcePaper_StudentDTOToPaper_Student(dto));


    }

    @Override
    public void updatePaper_Student(Paper_StudentDTO dto) {

    }

    @Override
    public Paper_StudentDTO searchPaper_Student(String id) {
        return null;
    }

    @Override
    public void deletePaper_Student(String id) {

    }

    @Override
    public List<Paper_StudentDTO> getAllPaper_Student() {
        List<Paper_StudentDTO> paper_studentDTOList = new ArrayList<>();
        List<Paper_Student> all = paperStudentRepo.findAll();

        for (Paper_Student paper_student : all) {
            paper_studentDTOList.add(paperStudentMapper.sourceMark_SheetToMark_SheetDTO(paper_student));
        }
        return paper_studentDTOList;
    }
}
