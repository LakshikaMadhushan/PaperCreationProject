package com.ceyrntra.spring.repo;

import com.ceyrntra.spring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
