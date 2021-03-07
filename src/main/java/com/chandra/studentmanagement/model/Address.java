package com.chandra.studentmanagement.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_tbl")
@Data
public class Address  extends BaseEntity{

    @Column(name = "street_name")
    private String streetName;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "state_name")
    private String stateName;
    @Column(name = "zip_code")
    private Long zipCode;
    @Column(name = "country_name")
    private String countryName;

}
