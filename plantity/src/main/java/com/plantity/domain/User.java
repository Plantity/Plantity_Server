package com.plantity.domain;

import com.plantity.utils.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
public class User extends Timestamped {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    private String social;

    @Column(nullable = false)
    private String rating;

    @Column(nullable = false)
    private int score;

    private String status;

    public User(String social, String rating, int score, String status) {
        this.social = social;
        this.rating = rating;
        this.score = score;
        this.status = status;
    }

}
