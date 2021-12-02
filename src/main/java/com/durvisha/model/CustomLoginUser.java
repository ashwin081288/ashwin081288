package com.durvisha.model;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import lombok.Data;

@JsonSerializableSchema
@Data
public class CustomLoginUser {
    private Integer userId;
    private String userName;
    private String email;
    private String mobileNumber;


}
