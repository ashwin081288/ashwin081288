package com.durvisha.repository.impl;

import com.durvisha.entity.UserMasterEntity;
import com.durvisha.repository.LoginUserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class LoginUserDetailRepositoryImpl implements LoginUserDetailRepository {



    @Autowired
    private EntityManager entityManager;

    @Override
    public List<UserMasterEntity> findUserByEmails(String userName,Integer userId ){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserMasterEntity> query = cb.createQuery(UserMasterEntity.class);
        Root<UserMasterEntity> user = query.from(UserMasterEntity.class);

        //Path<String> emailPath = user.get("email");

        query.select(user);
              //  .where(cb.or(predicates.toArray(new Predicate[predicates.size()])));

        return entityManager.createQuery(query)
                .getResultList();
    }
}

