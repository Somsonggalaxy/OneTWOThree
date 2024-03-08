package com.dailycodebuffer.Springbootdepartment.model;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Department {

    @Id
    private Long departmentId;

    private String departmentName;

    private String departmentAddress;

    private String departmentCode;


}
