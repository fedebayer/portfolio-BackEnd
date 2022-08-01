package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_skill;
    @Column(length = 45)
    private String name;
   @Min(1) @Max(100)
    private int lvl;

    public Skill() {
    }

    public Skill(Long id_skill, String name, int lvl) {
        this.id_skill = id_skill;
        this.name = name;
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id_skill=" + id_skill +
                ", name='" + name + '\'' +
                ", lvl=" + lvl +
                '}';
    }
}
