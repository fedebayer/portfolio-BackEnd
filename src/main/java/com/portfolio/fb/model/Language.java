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
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_language;
    @NotNull
    private String name;
    @NotNull
    @Min(1)
    @Max(100)
    private int lvl;

    public Language() {
    }

    public Language(Long id_language, String name, int lvl) {
        this.id_language = id_language;
        this.name = name;
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id_language=" + id_language +
                ", name='" + name + '\'' +
                ", lvl=" + lvl +
                '}';
    }
}
