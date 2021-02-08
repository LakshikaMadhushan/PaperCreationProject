package com.ceyrntra.spring.service;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.dto.Paper_StudentDTO;
import com.ceyrntra.spring.entity.Paper_Student;

import java.util.List;

public interface PaperStudentService {
    void savePaper_Student(Paper_StudentDTO dto);
    void updatePaper_Student(Paper_StudentDTO dto);
    Paper_StudentDTO searchPaper_Student(String id);
    void deletePaper_Student(String id);
    List<Paper_StudentDTO> getAllPaper_Student();
}
