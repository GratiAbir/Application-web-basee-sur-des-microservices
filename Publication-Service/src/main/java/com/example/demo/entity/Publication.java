package com.example.demo.entity;

import java.util.Date;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Publication {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String type;

    @NonNull
    private String titre;

    @NonNull
    private String lien;

    @NonNull
    private Date date;

    @NonNull
    private String sourcepdf;

    @Builder
    public Publication(Long id, @NonNull String type, @NonNull String titre, @NonNull String lien, @NonNull Date date, @NonNull String sourcepdf) {
        this.id = id;
        this.type = type;
        this.titre = titre;
        this.lien = lien;
        this.date = date;
        this.sourcepdf = sourcepdf;
    }
}
