package com.ceyrntra.spring.mapper;

import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.entity.Student;

public interface StudentMapper {

    Student sourceStudentDTOToStudent(StudentDTO studentDTO);
    StudentDTO sourceStudentToStudentDTO(Student student);

}
