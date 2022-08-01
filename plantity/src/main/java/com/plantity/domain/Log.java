package com.plantity.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Log {

    private int water;
    private int look;
    private int sun;
    private int repot;

    protected Log() {}

    public Log(int water, int look, int sun, int repot) {
        this.water = water;
        this.look = look;
        this.sun = sun;
        this.repot = repot;
    }
}
