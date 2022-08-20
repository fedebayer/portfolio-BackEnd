package com.portfolio.fb.model;

import com.sun.istack.NotNull;
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
    @NotNull
    @Column(length = 70)
    private String title;
    @Column(length = 70)
    private String company;
    @NotNull
    @Column(length = 240)
    private String description;
    @NotNull
    @Column(length = 45)
    private String date;
    @Column(length = 100)
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
