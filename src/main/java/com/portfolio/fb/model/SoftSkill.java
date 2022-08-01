package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class SoftSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_soft_skill;
    @Column(length = 45)
    private String name;

    public SoftSkill() {
    }

    public SoftSkill(Long id_softSkill, String name) {
        this.id_soft_skill = id_softSkill;
        this.name = name;
    }


    @Override
    public String toString() {
        return "SoftSkill{" +
                "id_softSkill=" + id_soft_skill +
                ", name='" + name + '\'' +
                '}';
    }
}
