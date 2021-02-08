package com.ceyrntra.spring.controller;

import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.dto.QuestionDTO;
import com.ceyrntra.spring.service.QuestionService;
import com.ceyrntra.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping(value = "/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addQuestion(@RequestBody QuestionDTO dto) {
        questionService.saveQuestion(dto);
        return new ResponseEntity(new StandradResponse(200,"Success","null"), HttpStatus.OK) ;
    }



    @GetMapping
    public ResponseEntity getAll(){
        List<QuestionDTO> list = questionService.getAllQuestion();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }

    @GetMapping(value = "/getAllQuestionByPaperId/{paperId}")
    public ResponseEntity getAll(@PathVariable(value = "paperId")int paperId){
        List<QuestionDTO> list = questionService.getAllQuestionByPaperId(paperId);
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }
}
