package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_project;
    private String title;
    private String description;
    private String technologies;
    private String img_url;
    private String live_url;
    private String repo_url;
    private int year;
}
