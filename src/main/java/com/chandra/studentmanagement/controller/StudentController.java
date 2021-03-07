package com.chandra.studentmanagement.controller;

import com.chandra.studentmanagement.dto.StudentDto;
import com.chandra.studentmanagement.model.Student;
import com.chandra.studentmanagement.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Slf4j
@CrossOrigin(value = "*")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity saveStudentInfo(@RequestBody StudentDto studentDto) {
        studentService.saveStudentInfo(studentDto);
        log.info("student info is saved in db.");
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent() {
        List<StudentDto> studentDtoList = studentService.getAllStudent();
        return new ResponseEntity(studentDtoList, HttpStatus.OK);
    }
}
