package com.plantity.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.awt.*;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
public class MyPlant {
    //myPlant_id, user_id, plantName,
    //plantType, level, content, plantImage, status, createAt, updateAt

    @Id @GeneratedValue
    @Column(name = "myPlant_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "log_id")
    private PlantLog plantLog;

    //갱신일이 외래키로 들어갔는데 이게 맞는지 의문,, 더 구글링해봐야겠다..
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "updatedAt")
    @LastModifiedDate
    private LocalDateTime updatedAt;

    private String plantName;
    private String plantType;

    private int level;

    @Column(length = 200)
    private String content;

    private String plantImage;
    private String status;


    @CreatedDate
    private LocalDateTime createdAt;
}
