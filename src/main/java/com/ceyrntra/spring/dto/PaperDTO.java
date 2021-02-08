package com.ceyrntra.spring.dto;

import com.ceyrntra.spring.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaperDTO {
    private int p_id;
    private String p_name;
    private int teacher;
    private List<QuestionDTO> questionDTOList;

    public PaperDTO(int p_id, String p_name, int teacher) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.teacher = teacher;
    }

    public PaperDTO(String p_name, int teacher) {
        this.p_name = p_name;
        this.teacher = teacher;
    }

    public PaperDTO(String p_name, int teacher, List<QuestionDTO> questionDTOList) {
        this.p_name = p_name;
        this.teacher = teacher;
        this.questionDTOList = questionDTOList;
    }
}
