package com.ceyrntra.spring.controller;

import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.dto.Paper_StudentDTO;
import com.ceyrntra.spring.service.PaperStudentService;
import com.ceyrntra.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/paperstudent")
public class PaperStudentController {
    @Autowired
    PaperStudentService paperStudentService;



    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addPaperStudent(@RequestBody Paper_StudentDTO dto) {
        paperStudentService.savePaper_Student(dto);
        return new ResponseEntity(new StandradResponse(200,"Success","null"), HttpStatus.OK) ;
    }



    @GetMapping
    public ResponseEntity getAll(){
        List<Paper_StudentDTO> list = paperStudentService.getAllPaper_Student();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }
}
