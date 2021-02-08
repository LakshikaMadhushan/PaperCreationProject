package com.ceyrntra.spring.entity;



import lombok.*;

import javax.persistence.*;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int a_id;
    private String answer;

    @ManyToOne
    @JoinColumn(name="q_id", referencedColumnName = "q_id", nullable = false)
    private Question question;

    public Answer(String answer, Question question) {
        this.answer = answer;
        this.question = question;
    }
}
