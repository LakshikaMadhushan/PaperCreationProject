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
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacher_id;
    private String email;
    private String name;
    private String password;

//    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    private List<Paper> papers=new ArrayList<>();

    public Teacher(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Teacher(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
