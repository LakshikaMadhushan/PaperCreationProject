package com.ceyrntra.spring.mapper;

import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.entity.Paper;

public interface PapersMapper {

    Paper sourcePaperDTOToPaper(PaperDTO paperDTO);
    PaperDTO sourcePaperToPaperDTO(Paper paper);

}
