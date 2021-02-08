package com.ceyrntra.spring.controller;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.service.AnswerService;
import com.ceyrntra.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/answer")
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addAnswer(@RequestBody AnswerDTO dto) {
        answerService.saveAnswer(dto);
        return new ResponseEntity(new StandradResponse(200,"Success","null"), HttpStatus.OK) ;
    }

    @GetMapping
    public ResponseEntity getAll(){
        List<AnswerDTO> list = answerService.getAllAnswer();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }
}
