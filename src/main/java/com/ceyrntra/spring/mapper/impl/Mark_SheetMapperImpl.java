package com.ceyrntra.spring.mapper.impl;

import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.entity.Mark_Sheet;
import com.ceyrntra.spring.entity.Paper;
import com.ceyrntra.spring.entity.Question;
import com.ceyrntra.spring.entity.Student;
import com.ceyrntra.spring.mapper.Mark_SheetMapper;
import org.springframework.stereotype.Service;

@Service
public class Mark_SheetMapperImpl implements Mark_SheetMapper {
    @Override
    public Mark_Sheet sourceMark_SheetDTOToMark_Sheet(Mark_SheetDTO mark_sheetDTO) {
        if(mark_sheetDTO==null){
            return null;
        }
        return new Mark_Sheet(mark_sheetDTO.getIs_correct(),mark_sheetDTO.getSubmit_answer(),mark_sheetDTO.getStudentMail(),new Question(mark_sheetDTO.getQuestion_id()),new Paper(mark_sheetDTO.getPaper_id()));
    }

    @Override
    public Mark_SheetDTO sourceMark_SheetToMark_SheetDTO(Mark_Sheet mark_sheet) {
       if(mark_sheet==null){
           return null;
       }
       return new Mark_SheetDTO(mark_sheet.getM_id(),mark_sheet.getIs_correct(),mark_sheet.getSubmit_answer(),mark_sheet.getStudentMail(),mark_sheet.getQuestion().getQ_id(),mark_sheet.getPaper().getP_id());
    }
}
