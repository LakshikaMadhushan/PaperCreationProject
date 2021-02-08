package com.ceyrntra.spring.mapper.impl;

import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.entity.Student;
import com.ceyrntra.spring.mapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentMapperImpl implements StudentMapper {
    @Override
    public Student sourceStudentDTOToStudent(StudentDTO studentDTO) {
        if (studentDTO == null){
            return null;
        }
        return new Student(
                studentDTO.getEmail(),
                studentDTO.getName(),
                studentDTO.getPassword()
        );
    }

    @Override
    public StudentDTO sourceStudentToStudentDTO(Student student) {
        if (student == null){
            return null;
        }
        return new StudentDTO(
                student.getStudent_id(),
                student.getEmail(),
                student.getName(),
                student.getPassword()
        );
    }
}
