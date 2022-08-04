package com.plantity.repository;

import com.plantity.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    //저장
    public void save(User user) {
        em.persist(user);
    }

    //단건 조회
    public User findOne(Long id) {
        return em.find(User.class, id);
    }

}
