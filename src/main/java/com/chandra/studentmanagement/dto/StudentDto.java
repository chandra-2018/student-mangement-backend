package com.chandra.studentmanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentDto extends BaseDto{

    private String firstName;
    private String lastName;
    private String email;
    private Long mobileNo;
    private String gender;
    private String processStatus;
    private LocalDate dob;
    private AddressDto address;
}
