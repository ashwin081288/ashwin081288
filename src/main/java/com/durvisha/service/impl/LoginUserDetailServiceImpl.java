package com.durvisha.service.impl;

import com.durvisha.model.CustomLoginUser;
import com.durvisha.service.LoginUserDetailService;
import org.springframework.stereotype.Service;

@Service
public class LoginUserDetailServiceImpl  implements LoginUserDetailService {
    @Override
    public CustomLoginUser loggingUser(String userName, Integer userId) {
        CustomLoginUser customLoginUser= new CustomLoginUser();
        customLoginUser.setUserId(userId);
        customLoginUser.setUserName(userName);
        customLoginUser.setEmail("ashubarapatre8@gmail.com");
        customLoginUser.setMobileNumber("9021301462");
        return customLoginUser;
    }
}
