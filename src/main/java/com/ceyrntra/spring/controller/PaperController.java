package com.ceyrntra.spring.controller;

import com.ceyrntra.spring.dto.PaperDTO;
import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.dto.commonDTO;
import com.ceyrntra.spring.service.PaperService;
import com.ceyrntra.spring.service.StudentService;
import com.ceyrntra.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@RequestMapping(value = "/paper")
public class PaperController{
    @Autowired
    PaperService paperService;



    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addPaper(@RequestBody commonDTO dto) {
        System.out.println(dto);
        paperService.savePaper(dto);
        return new ResponseEntity(new StandradResponse(200,"Success","null"), HttpStatus.OK) ;
    }



    @GetMapping
    public ResponseEntity getAll(){
        List<PaperDTO> list = paperService.getAllPaper();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }


}
