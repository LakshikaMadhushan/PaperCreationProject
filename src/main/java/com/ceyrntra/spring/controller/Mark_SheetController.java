package com.ceyrntra.spring.controller;

import com.ceyrntra.spring.dto.AnswerDTO;
import com.ceyrntra.spring.dto.CommonMarkSheetDTO;
import com.ceyrntra.spring.dto.Mark_SheetDTO;
import com.ceyrntra.spring.service.Mark_SheetService;
import com.ceyrntra.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/mark_sheet")
public class Mark_SheetController {
    @Autowired
    Mark_SheetService mark_sheetService;
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addMark_Sheet(@RequestBody CommonMarkSheetDTO dtoList) {
        mark_sheetService.saveMark_Sheet(dtoList);
        return new ResponseEntity(new StandradResponse(200,"Success","null"), HttpStatus.OK) ;
    }



    @GetMapping
    public ResponseEntity getAll(){
        List<Mark_SheetDTO> list = mark_sheetService.getAllMark_Sheet();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }
}
