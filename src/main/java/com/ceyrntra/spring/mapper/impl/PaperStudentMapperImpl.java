package com.ceyrntra.spring.mapper.impl;

import com.ceyrntra.spring.dto.Paper_StudentDTO;
import com.ceyrntra.spring.entity.Paper;
import com.ceyrntra.spring.entity.Paper_Student;
import com.ceyrntra.spring.entity.Student;
import com.ceyrntra.spring.mapper.PaperStudentMapper;
import org.springframework.stereotype.Service;

@Service
public class PaperStudentMapperImpl implements PaperStudentMapper {
    @Override
    public Paper_Student sourcePaper_StudentDTOToPaper_Student(Paper_StudentDTO paper_studentDTO) {
        if(paper_studentDTO==null){
            return null;
        }
        return new Paper_Student(new Student(paper_studentDTO.getStudent_id()),new Paper(paper_studentDTO.getPaper_id()));
    }

    @Override
    public Paper_StudentDTO sourceMark_SheetToMark_SheetDTO(Paper_Student paper_student) {

        if(paper_student==null){
            return null;
        }
        return new Paper_StudentDTO(paper_student.getId(),paper_student.getStudent().getStudent_id(),paper_student.getPaper().getP_id());
    }
}

