package com.ceyrntra.spring.controller;

import com.ceyrntra.spring.dto.StudentDTO;
import com.ceyrntra.spring.service.StudentService;
import com.ceyrntra.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addStudent(@RequestBody StudentDTO dto) {
        studentService.saveStudent(dto);
        return new ResponseEntity(new StandradResponse(200,"Success","null"), HttpStatus.OK) ;
    }



    @GetMapping
    public ResponseEntity getAll(){
        List<StudentDTO> list = studentService.getAll();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK);
    }


/*

    @DeleteMapping(params = {"id"})
    public ResponseEntity deleteCarDetails(@RequestParam String id) {
        carService.deleteCar(id);
        return new ResponseEntity(new StandradResponse(200,"Success","null"),HttpStatus.OK) ;
    }

    @PutMapping
    public ResponseEntity updateCarDetails(@RequestBody CarDTO dto) {
        carService.updateCar(dto);
        return new ResponseEntity(new StandradResponse(200,"Success","null"),HttpStatus.OK) ;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity searchCarDetails(@PathVariable String id) {
        CarDTO user = carService.searchCar(id);
        return new ResponseEntity( new StandradResponse(200,"Success",user),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllUser() {
        List<CarDTO> list = carService.getAllCar();
        return new ResponseEntity(new StandradResponse(200,"Success",list),HttpStatus.OK) ;
    }

 */
}
