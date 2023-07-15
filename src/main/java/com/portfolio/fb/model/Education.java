package com.portfolio.fb.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_education;
    @NotNull
    private String title;
    @NotNull
    private String institution;
    @NotNull
    private String description;
    @NotNull
    private String date;
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
