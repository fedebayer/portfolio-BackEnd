package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class SkillType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_skillType;
    private String name;
}