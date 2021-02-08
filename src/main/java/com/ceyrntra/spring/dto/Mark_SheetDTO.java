package com.ceyrntra.spring.dto;

import com.ceyrntra.spring.entity.Paper;
import com.ceyrntra.spring.entity.Question;
import com.ceyrntra.spring.entity.Student;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mark_SheetDTO {
    private int m_id;
    private String is_correct;
    private String submit_answer;
    private String studentMail;
    private int question_id;
    private int paper_id;

    public Mark_SheetDTO(String is_correct, String submit_answer, String studentMail, int question_id, int paper_id) {
        this.is_correct = is_correct;
        this.submit_answer = submit_answer;
        this.studentMail = studentMail;
        this.question_id = question_id;
        this.paper_id = paper_id;
    }
}
