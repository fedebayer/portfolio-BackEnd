package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable=false, updatable=false)
    private Long id_person;
    private String name;
    private String job_title;
    @Column(length = 600)
    private String about;
    private String email;
    private String linkedin_url;
    private String github_url;
    private String img_url;
    private String banner_url;

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
