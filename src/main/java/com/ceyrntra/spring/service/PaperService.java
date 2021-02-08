package com.ceyrntra.spring.service;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.dto.commonDTO;

import java.util.List;

public interface PaperService {
    void savePaper(commonDTO dto);
    void updatePaper(PaperDTO dto);
    PaperDTO searchPaper(String id);
    void deletePaper(String id);
    List<PaperDTO> getAllPaper();
}
