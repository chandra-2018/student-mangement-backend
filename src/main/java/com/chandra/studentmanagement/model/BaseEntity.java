package com.chandra.studentmanagement.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Integer id;
    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;
    @Column(name = "created_date")
    @CreatedDate
    private LocalDate createdDate;
    @Column(name = "modified_by")
    @LastModifiedBy
    private String modifiedBy;
    @Column(name = "modified_date")
    @LastModifiedDate
    private LocalDate modifiedDate;
}
