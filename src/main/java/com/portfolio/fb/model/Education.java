package com.portfolio.fb.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_education;
    @NotNull
    @Column(length = 45)
    private String title;
    @NotNull
    @Column(length = 45)
    private String institution;
    @NotNull
    @Column(length = 240)
    private String description;
    @NotNull
    @Column(length = 45)
    private String date;
    @Column(length = 100)
    private String img_url;

    public Education() {
    }

    public Education(Long id_education, String title, String institution, String description, String date, String img_url) {
        this.id_education = id_education;
        this.title = title;
        this.institution = institution;
        this.description = description;
        this.date = date;
        this.img_url = img_url;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id_education=" + id_education +
                ", title='" + title + '\'' +
                ", institution='" + institution + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", img_url='" + img_url + '\'' +
                '}';
    }
}
