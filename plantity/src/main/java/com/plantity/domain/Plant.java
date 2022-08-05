package com.plantity.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
@Getter
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int plantId;

    private User user;
    private String status;
}
