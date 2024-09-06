package com.denec.vidyatracker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "released_at")
    private Date releasedAt;

    @ManyToMany
    private List<Developer> developers;

    @ManyToMany
    private List<Platform> platforms;

    @ManyToMany
    private List<Publisher> publishers;
}
