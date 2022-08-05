package com.plantity.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Entity
@Getter
public class PlantLog {

    @ManyToOne
    @JoinColumn(name = "log_id")
    private MyPlant myPlant;

    private boolean water;
    private boolean look;
    private boolean sun;
    private boolean repot;
}
