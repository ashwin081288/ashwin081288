package com.durvisha.model;

import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import lombok.Builder;
import lombok.Data;

@JsonSerializableSchema
@Data
@Builder
public class CustomLoginUser {
    private Integer userId;
    private String userName;
    private String email;
    private String mobileNumber;


}
