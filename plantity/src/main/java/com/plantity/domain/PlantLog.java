package com.plantity.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class PlantLog {
    // Order(MyPlant, 주테이블) - Delivery(PlantLog, 대상테이블) 관계

    @Id @GeneratedValue
    @Column(name = "log_id")
    private Long id;

    @Id @GeneratedValue
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @OneToOne(mappedBy = "plantLog", fetch = FetchType.LAZY)
    private MyPlant myPlant;

    @Embedded
    private Log log;
}
