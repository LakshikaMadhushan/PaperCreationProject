package com.ceyrntra.spring.mapper;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.TeacherDTO;
import com.ceyrntra.spring.entity.Answer;
import com.ceyrntra.spring.entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherMapper {
    Teacher sourceTeacherDTOToTeacher(TeacherDTO teacherDTO);
    TeacherDTO sourceTeacherToTeacherDTO(Teacher teacher);
}
