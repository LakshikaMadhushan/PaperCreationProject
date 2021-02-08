package com.ceyrntra.spring.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mark_Sheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int m_id;
    private String is_correct;
    private String submit_answer;
    private String studentMail;

    @ManyToOne
    @JoinColumn(name="q_id", referencedColumnName = "q_id", nullable = false)
    private Question question;

    @ManyToOne
    @JoinColumn(name="p_id", referencedColumnName = "p_id", nullable = false)
    private Paper paper;


    public Mark_Sheet(String is_correct, String submit_answer, String studentMail, Question question, Paper paper) {
        this.is_correct = is_correct;
        this.submit_answer = submit_answer;
        this.studentMail = studentMail;
        this.question = question;
        this.paper = paper;
    }
}
