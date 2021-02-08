package com.ceyrntra.spring.mapper;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.entity.Answer;
import com.ceyrntra.spring.entity.Mark_Sheet;

public interface Mark_SheetMapper {
    Mark_Sheet sourceMark_SheetDTOToMark_Sheet(Mark_SheetDTO mark_sheetDTO);
    Mark_SheetDTO sourceMark_SheetToMark_SheetDTO(Mark_Sheet mark_sheet);
}
