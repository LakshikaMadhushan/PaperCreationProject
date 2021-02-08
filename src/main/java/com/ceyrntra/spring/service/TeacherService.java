package com.ceyrntra.spring.service;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    void saveTeacher(TeacherDTO dto);
    void updateTeacher(TeacherDTO dto);
    TeacherDTO searchTeacher(String id);
    void deleteTeacher(String id);
    List<TeacherDTO> getAllTeacher();
}
