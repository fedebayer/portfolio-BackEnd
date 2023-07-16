package com.portfolio.fb.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id_person;
    @NotNull
    private String name;
    @NotNull
    private String job_title;
    @NotNull
    private String about;
    @NotNull
    private String email;
    private String linkedin_url;
    private String github_url;
    @NotNull
    private String img_url;
    @NotNull
    private String banner_url;

    @OneToMany(mappedBy = "id_experience", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Experience> experiences;

    @OneToMany(mappedBy = "id_education", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Education> educations;

    @OneToMany(mappedBy = "id_skill", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Skill> skills;

    @OneToMany(mappedBy = "id_soft_skill", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SoftSkill> softSkills;


    public Person() {
    }

    public Person(Long id_person, String name, String job_title, String about, String email, String linkedin_url, String github_url, String img_url, String banner_url) {
        this.id_person = id_person;
        this.name = name;
        this.job_title = job_title;
        this.about = about;
        this.email = email;
        this.linkedin_url = linkedin_url;
        this.github_url = github_url;
        this.img_url = img_url;
        this.banner_url = banner_url;
    }

    public Person(String name, String job_title, String about, String email, String linkedin_url, String github_url, String img_url, String banner_url) {
        this.name = name;
        this.job_title = job_title;
        this.about = about;
        this.email = email;
        this.linkedin_url = linkedin_url;
        this.github_url = github_url;
        this.img_url = img_url;
        this.banner_url = banner_url;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id_person=" + id_person +
                ", name='" + name + '\'' +
                ", job_title='" + job_title + '\'' +
                ", about='" + about + '\'' +
                ", email='" + email + '\'' +
                ", linkedin_url='" + linkedin_url + '\'' +
                ", github_url='" + github_url + '\'' +
                ", img_url='" + img_url + '\'' +
                ", banner_url='" + banner_url + '\'' +
                '}';
    }
}
