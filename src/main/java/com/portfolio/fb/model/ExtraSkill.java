package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@Entity
public class ExtraSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_extraSkill;
    private String name;

    public ExtraSkill() {
    }

    public ExtraSkill(Long id_extraSkill, String name) {
        this.id_extraSkill = id_extraSkill;
        this.name = name;
    }


    @Override
    public String toString() {
        return "ExtraSkill{" +
                "id_extraSkill=" + id_extraSkill +
                ", name='" + name + '\'' +
                '}';
    }
}
