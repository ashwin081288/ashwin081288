package com.durvisha.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@JsonSerialize
@Entity
//@Table(name = "")
public class UserMasterEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String userName;
    private String email;
    private String mobileNumber;
}