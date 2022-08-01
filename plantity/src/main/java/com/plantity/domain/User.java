package com.plantity.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
public class User {
    // user_id, nickname, social, rating, score, status, createAt, updateAt

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(length = 7)
    private String nickname;
    private String social;
    private RateStatus rating; //등급 [ONE, TWO, THREE]
    private int score;
    private String status;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
