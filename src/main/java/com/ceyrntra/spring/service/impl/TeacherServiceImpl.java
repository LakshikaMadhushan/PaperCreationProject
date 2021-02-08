package com.ceyrntra.spring.service.impl;

import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.dto.TeacherDTO;
import com.ceyrntra.spring.entity.Student;
import com.ceyrntra.spring.entity.Teacher;
import com.ceyrntra.spring.mapper.TeacherMapper;
import com.ceyrntra.spring.repo.TeacherRepo;
import com.ceyrntra.spring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    TeacherRepo teacherRepo;

    @Override
    public void saveTeacher(TeacherDTO dto) {
        teacherRepo.save(teacherMapper.sourceTeacherDTOToTeacher(dto));

    }

    @Override
    public void updateTeacher(TeacherDTO dto) {

    }

    @Override
    public TeacherDTO searchTeacher(String id) {
        return null;
    }

    @Override
    public void deleteTeacher(String id) {

    }

    @Override
    public List<TeacherDTO> getAllTeacher() {
        List<TeacherDTO> studentDTOList = new ArrayList<>();
        List<Teacher> all = teacherRepo.findAll();
        for (Teacher teacher : all){
            studentDTOList.add(teacherMapper.sourceTeacherToTeacherDTO(teacher));
        }
        return studentDTOList;
    }
}
