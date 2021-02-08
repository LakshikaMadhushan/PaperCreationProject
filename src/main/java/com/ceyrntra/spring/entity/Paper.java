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
public class Paper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;
    private String p_name;

    @OneToMany(mappedBy = "paper", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Question> questions = new ArrayList<>();

    @OneToMany(mappedBy = "paper", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Mark_Sheet> mark_sheet = new ArrayList<>();

    @OneToMany(mappedBy = "paper", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Paper_Student> studentPapers = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="teacher_id", referencedColumnName = "teacher_id", nullable = false)
    private Teacher teacher;

    public Paper(int p_id) {
        this.p_id = p_id;
    }

    public Paper(String p_name, Teacher teacher) {
        this.p_name = p_name;
        this.teacher = teacher;
    }
}
