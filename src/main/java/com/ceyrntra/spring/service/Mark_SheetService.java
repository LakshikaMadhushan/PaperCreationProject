package com.ceyrntra.spring.service;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.CommonMarkSheetDTO;
import com.ceyrntra.spring.dto.Mark_SheetDTO;

import java.util.List;

public interface Mark_SheetService {
    void saveMark_Sheet(CommonMarkSheetDTO dto);
    void updateMark_Sheet(Mark_SheetDTO dto);
    AnswerDTO searchMark_Sheet(String id);
    void deleteMark_Sheet(String id);
    List<Mark_SheetDTO> getAllMark_Sheet();
}
