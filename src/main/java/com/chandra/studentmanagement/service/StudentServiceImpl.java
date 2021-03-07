package com.chandra.studentmanagement.service;

import com.chandra.studentmanagement.dto.AddressDto;
import com.chandra.studentmanagement.dto.StudentDto;
import com.chandra.studentmanagement.model.Address;
import com.chandra.studentmanagement.model.Student;
import com.chandra.studentmanagement.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public void saveStudentInfo(StudentDto studentDto) {
        Student student = new Student();
        Address address = new Address();
        BeanUtils.copyProperties(studentDto.getAddress(), address);
        BeanUtils.copyProperties(studentDto, student);
        student.setAddress(address);
        studentRepository.save(student);
    }

    @Override
    public List<StudentDto> getAllStudent() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtoList = students.stream().map(student -> {
            StudentDto studentDto = new StudentDto();
            AddressDto addressDto = new AddressDto();
            BeanUtils.copyProperties(student, studentDto);
            BeanUtils.copyProperties(student.getAddress(), addressDto);
            studentDto.setAddress(addressDto);
            return studentDto;
        }).collect(Collectors.toList());
        return studentDtoList;
    }
}
