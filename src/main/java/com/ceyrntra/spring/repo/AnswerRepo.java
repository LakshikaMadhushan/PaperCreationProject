package com.ceyrntra.spring.repo;

import com.ceyrntra.spring.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AnswerRepo extends JpaRepository<Answer,Integer> {

    @Query(value = "SELECT * FROM answer WHERE q_id=:questionId",
    nativeQuery = true)
    List<Answer> getAllAnswersByQuestionId(@Param(value = "questionId")int questionId);

}
