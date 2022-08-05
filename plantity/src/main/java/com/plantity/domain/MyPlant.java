package com.plantity.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
public class MyPlant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long myPlant_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private int log_id;

    private String plantName;
    private String plantType;
    private int level;
    private String content;
    private String plantImage;
    private String status;
}
