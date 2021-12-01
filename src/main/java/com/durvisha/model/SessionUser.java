package com.durvisha.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;

@Component
@SessionScope( proxyMode = ScopedProxyMode.TARGET_CLASS)
@SessionAttributes
@Getter
@Setter
public class SessionUser  implements Serializable {
    private   String name;



}
