package com.chandra.studentmanagement.service;

import com.chandra.studentmanagement.dto.StudentDto;
import com.chandra.studentmanagement.model.Student;

import java.util.List;

public interface StudentService {

    void saveStudentInfo(StudentDto studentDto);

    List<StudentDto> getAllStudent();
}
