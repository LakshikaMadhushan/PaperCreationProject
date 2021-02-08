package com.ceyrntra.spring.mapper.impl;

import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.dto.TeacherDTO;
import com.ceyrntra.spring.entity.Paper;
import com.ceyrntra.spring.entity.Teacher;
import com.ceyrntra.spring.mapper.PapersMapper;
import org.springframework.stereotype.Service;

@Service
public class PaperMapperImpl implements PapersMapper {
    @Override
    public Paper sourcePaperDTOToPaper(PaperDTO paperDTO) {
        if(paperDTO==null) {
            return null;
        }
        return new Paper(
                paperDTO.getP_name(),
                new Teacher(paperDTO.getTeacher())
        );
    }

    @Override
    public PaperDTO sourcePaperToPaperDTO(Paper paper) {
        if(paper==null){
            return null;
        }
        return new PaperDTO(paper.getP_id(),paper.getP_name(),paper.getTeacher().getTeacher_id());

    }
}
