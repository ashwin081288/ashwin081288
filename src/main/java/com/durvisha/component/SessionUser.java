package com.durvisha.component;

import com.durvisha.model.CustomLoginUser;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;

@JsonSerializableSchema
@Component
@SessionScope( proxyMode = ScopedProxyMode.TARGET_CLASS)
@SessionAttributes
@Data
public class SessionUser {
    private   String name;
    private CustomLoginUser customLoginUser;



}
