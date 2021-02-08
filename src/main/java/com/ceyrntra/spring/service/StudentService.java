package com.ceyrntra.spring.service;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDTO dto);
    void updateStudent(StudentDTO dto);
    StudentDTO searchStudent(String id);
    void deleteStudent(String id);
    List<StudentDTO> getAll();

}
