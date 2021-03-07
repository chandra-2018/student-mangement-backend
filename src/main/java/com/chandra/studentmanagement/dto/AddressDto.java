package com.chandra.studentmanagement.dto;

import lombok.Data;

@Data
public class AddressDto extends BaseDto{

    private String streetName;
    private String cityName;
    private String stateName;
    private Long zipCode;
    private String countryName;
}
