package com.ceyrntra.spring.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int q_id;
    private String question;
    private String correct_answer;

    @ManyToOne
    @JoinColumn(name="p_id", referencedColumnName = "p_id", nullable = false)
    private Paper paper;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Answer> answers=new ArrayList<>();

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Mark_Sheet> mark_sheets=new ArrayList<>();

    public Question(int q_id) {
        this.q_id = q_id;
    }

    public Question(String question, String correct_answer, Paper paper) {
        this.question = question;
        this.correct_answer = correct_answer;
        this.paper = paper;
    }
}
