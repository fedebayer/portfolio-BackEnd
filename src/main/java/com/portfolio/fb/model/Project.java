package com.portfolio.fb.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Getter
@Setter
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_project;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private String technologies;
    private String img_url;
    private String live_url;
    private String repo_url;
    @NotNull
    @Min(2021)
    @Max(3000)
    private int year;
    private String desc_img1;
    private String desc_text1;
    private String desc_img2;
    private String desc_text2;
    private String desc_img3;
    private String desc_text3;

    public Project() {
    }

    public Project(Long id_project, String title, String description, String technologies, String img_url, String live_url, String repo_url, int year, String desc_img1, String desc_text1, String desc_img2, String desc_text2, String desc_img3, String desc_text3) {
        this.id_project = id_project;
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.img_url = img_url;
        this.live_url = live_url;
        this.repo_url = repo_url;
        this.year = year;
        this.desc_img1 = desc_img1;
        this.desc_text1 = desc_text1;
        this.desc_img2 = desc_img2;
        this.desc_text2 = desc_text2;
        this.desc_img3 = desc_img3;
        this.desc_text3 = desc_text3;
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
                ", desc_img1='" + desc_img1 + '\'' +
                ", desc_text1='" + desc_text1 + '\'' +
                ", desc_img2='" + desc_img2 + '\'' +
                ", desc_text2='" + desc_text2 + '\'' +
                ", desc_img3='" + desc_img3 + '\'' +
                ", desc_text3='" + desc_text3 + '\'' +
                '}';
    }
}
