package com.ceyrntra.spring.dto;

import com.ceyrntra.spring.entity.Paper;
import com.ceyrntra.spring.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Paper_StudentDTO {
    private int id;
    private int student_id;
    private int paper_id;

}
