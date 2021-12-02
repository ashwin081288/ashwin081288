package com.durvisha.service.impl;

import com.durvisha.entity.UserMasterEntity;
import com.durvisha.model.CustomLoginUser;
import com.durvisha.repository.LoginUserDetailRepository;
import com.durvisha.service.LoginUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class LoginUserDetailServiceImpl  implements LoginUserDetailService {

    @Autowired
    private LoginUserDetailRepository loginUserDetailRepository;
    @Override
    public CustomLoginUser loggingUser(String userName, Integer userId) {
        List<UserMasterEntity> userMasterEntity=loginUserDetailRepository.findUserByEmails(userName,userId);

      //  System.out.println(userMasterEntity.get(0).getUserId());
        CustomLoginUser customLoginUser= CustomLoginUser.builder().
                userId(userId)
        .userName(userName)
        .email("ashubarapatre8@gmail.com")
        .mobileNumber("9021301462").build();

        return customLoginUser;
    }
}
