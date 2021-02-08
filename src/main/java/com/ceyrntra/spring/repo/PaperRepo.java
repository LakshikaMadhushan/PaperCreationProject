package com.ceyrntra.spring.repo;


import com.ceyrntra.spring.entity.Paper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperRepo extends JpaRepository<Paper,Integer> {
}
