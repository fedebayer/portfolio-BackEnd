package com.portfolio.fb.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_language;
    @Column(length = 45)
    private String name;

    public Language() {
    }

    public Language(Long id_language, String name) {
        this.id_language = id_language;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id_language=" + id_language +
                ", name='" + name + '\'' +
                '}';
    }
}
