package com.portfolio.fb.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter @Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_project;
    @NotNull
    @Column(length = 45)
    private String title;
    @NotNull
    @Column(length = 170)
    private String description;
    @NotNull
    @Column(length = 45)
    private String technologies;
    @Column(length = 100)
    private String img_url;
    @Column(length = 100)
    private String live_url;
    @Column(length = 100)
    private String repo_url;
    @NotNull
    @Min(2021)  @Max(3000)
    private int year;

    public Project() {
    }

    public Project(Long id_project, String title, String description, String technologies, String img_url, String live_url, String repo_url, int year) {
        this.id_project = id_project;
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.img_url = img_url;
        this.live_url = live_url;
        this.repo_url = repo_url;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id_project=" + id_project +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", technologies='" + technologies + '\'' +
                ", img_url='" + img_url + '\'' +
                ", live_url='" + live_url + '\'' +
                ", repo_url='" + repo_url + '\'' +
                ", year=" + year +
                '}';
    }
}
