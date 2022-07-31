package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable=false, updatable=false)
    private Long id_experience;
    private String title;
    private String company;
    private String description;
    private String date;
    private String img_url;

    public Experience() {
    }

    public Experience(Long id_experience, String title, String company, String description, String date, String img_url) {
        this.id_experience = id_experience;
        this.title = title;
        this.company = company;
        this.description = description;
        this.date = date;
        this.img_url = img_url;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id_experience=" + id_experience +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", img_url='" + img_url + '\'' +
                '}';
    }
}
