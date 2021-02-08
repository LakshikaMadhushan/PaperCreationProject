package com.ceyrntra.spring.mapper.impl;

import com.ceyrntra.spring.dto.TeacherDTO;
import com.ceyrntra.spring.entity.Teacher;
import com.ceyrntra.spring.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

@Service
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public Teacher sourceTeacherDTOToTeacher(TeacherDTO teacherDTO) {
        if(teacherDTO==null){
            return null;
        }
        return new Teacher(teacherDTO.getEmail(),teacherDTO.getName(),teacherDTO.getPassword());
    }

    @Override
    public TeacherDTO sourceTeacherToTeacherDTO(Teacher teacher) {
        if(teacher==null){
            return null;
        }
        return new TeacherDTO(teacher.getTeacher_id(),teacher.getEmail(),teacher.getName(),teacher.getPassword());
    }
}
