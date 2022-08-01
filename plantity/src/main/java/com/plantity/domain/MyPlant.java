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

    private String plantName;

    private String plantType;

    private int level;

    @Column(length = 200)
    private String content;

    private String plantImage;

    private String status;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
