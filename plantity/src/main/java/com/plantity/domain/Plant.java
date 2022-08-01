package com.plantity.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
public class Plant {

    @Id @GeneratedValue
    @Column(name = "plant_id")
    private Long id;

    private String status;

    @CreatedDate
    private LocalDateTime createdAt;
}
