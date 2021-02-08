package com.ceyrntra.spring.repo;

import com.ceyrntra.spring.entity.Paper_Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaperStudentRepo extends JpaRepository<Paper_Student,Integer> {
}
