package com.durvisha.repository;

import com.durvisha.entity.UserMasterEntity;

import java.util.List;

public interface LoginUserDetailRepository {
    public List<UserMasterEntity> findUserByEmails(String userName, Integer userId );
}
