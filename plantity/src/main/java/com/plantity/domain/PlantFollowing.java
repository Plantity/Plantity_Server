package com.plantity.domain;

import com.plantity.utils.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@Entity
@Getter
public class PlantFollowing extends Timestamped {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int following_idx;
    private String status;
}
