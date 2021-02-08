package com.ceyrntra.spring.dto;

import com.ceyrntra.spring.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AnswerDTO {
    private int a_id;
    private String answer;
    private int question_id;

    public AnswerDTO(String answer, int question_id) {
        this.answer = answer;
        this.question_id = question_id;
    }
}
