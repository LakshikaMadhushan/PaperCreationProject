package com.ceyrntra.spring.mapper;

import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.dto.Paper_StudentDTO;
import com.ceyrntra.spring.entity.Mark_Sheet;
import com.ceyrntra.spring.entity.Paper_Student;

public interface PaperStudentMapper {
    Paper_Student sourcePaper_StudentDTOToPaper_Student(Paper_StudentDTO paper_studentDTO);
    Paper_StudentDTO sourceMark_SheetToMark_SheetDTO(Paper_Student paper_student);
}
