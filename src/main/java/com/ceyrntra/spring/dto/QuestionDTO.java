package com.ceyrntra.spring.dto;

import com.ceyrntra.spring.entity.Paper;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuestionDTO {
    private int q_id;
    private String question;
    private String correct_answer;
    private int paper_id;
    private List<AnswerDTO> answerDTOList;

    public QuestionDTO(String question, String correct_answer, List<AnswerDTO> answerDTOList) {
        this.question = question;
        this.correct_answer = correct_answer;
        this.answerDTOList = answerDTOList;
    }

    public QuestionDTO(int q_id, String question, String correct_answer, int paper_id) {
        this.q_id = q_id;
        this.question = question;
        this.correct_answer = correct_answer;
        this.paper_id = paper_id;
    }

    public QuestionDTO(String question, String correct_answer, int paper_id, List<AnswerDTO> answerDTOList) {
        this.question = question;
        this.correct_answer = correct_answer;
        this.paper_id = paper_id;
        this.answerDTOList = answerDTOList;
    }
}
