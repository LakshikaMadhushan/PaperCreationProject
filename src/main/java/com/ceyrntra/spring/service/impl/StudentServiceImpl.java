package com.ceyrntra.spring.service.impl;

import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.entity.Student;
import com.ceyrntra.spring.mapper.StudentMapper;
import com.ceyrntra.spring.repo.StudentRepo;
import com.ceyrntra.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void saveStudent(StudentDTO dto) {
        studentRepo.save(studentMapper.sourceStudentDTOToStudent(dto));

    }

    @Override
    public void updateStudent(StudentDTO dto) {

    }

    @Override
    public StudentDTO searchStudent(String id) {
        return null;
    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public List<StudentDTO> getAll() {
        List<StudentDTO> studentDTOList = new ArrayList<>();
        List<Student> all = studentRepo.findAll();
        for (Student student : all){
            studentDTOList.add(studentMapper.sourceStudentToStudentDTO(student));
        }
        return studentDTOList;
    }
}
