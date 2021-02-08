package com.ceyrntra.spring.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TeacherDTO {
    private int teacher_id;
    private String email;
    private String name;
    private String password;


}
