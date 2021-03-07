package com.chandra.studentmanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student_tbl")
@Data
public class Student extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private Long mobileNo;
    private String gender;
    private LocalDate dob;
    @Column(name = "process_status")
    private String processStatus;

}
