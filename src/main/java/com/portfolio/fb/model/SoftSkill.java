package com.portfolio.fb.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class SoftSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_soft_skill;
    @NotNull
    private String name;
    private String icon;

    public SoftSkill() {
    }

    public SoftSkill(Long id_softSkill, String name, String icon) {
        this.id_soft_skill = id_softSkill;
        this.name = name;
        this.icon = icon;
    }


    @Override
    public String toString() {
        return "SoftSkill{" +
                "id_softSkill=" + id_soft_skill +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
