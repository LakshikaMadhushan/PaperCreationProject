package com.ceyrntra.spring.repo;

import com.ceyrntra.spring.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer> {

    @Query(value = "SELECT * FROM question WHERE p_id=:paperId",
    nativeQuery = true)
    List<Question> getAllQuestionByPaperId(@Param(value = "paperId")int paperId);

}
