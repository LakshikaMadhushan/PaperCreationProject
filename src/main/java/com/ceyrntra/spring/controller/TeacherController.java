package com.ceyrntra.spring.controller;

import com.ceyrntra.spring.dto.StudentDTO;

import com.ceyrntra.spring.dto.TeacherDTO;
import com.ceyrntra.spring.service.TeacherService;
import com.ceyrntra.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {


    @Autowired
    private TeacherService teacherService;



    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addTeacher(@RequestBody TeacherDTO dto) {
        teacherService.saveTeacher(dto);
        return new ResponseEntity(new StandradResponse(200,"Success","null"), HttpStatus.OK) ;
    }



    @GetMapping
    public ResponseEntity getAll(){
        List<TeacherDTO> list = teacherService.getAllTeacher();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }

}
