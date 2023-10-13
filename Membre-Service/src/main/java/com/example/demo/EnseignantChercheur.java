package com.example.demo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.NonNull;

@Entity @DiscriminatorValue("ens")
public class EnseignantChercheur extends Membre {
	@NonNull
	private String grade;
	@NonNull
	private String etablissement;
	@OneToMany(mappedBy = "encadrant")
	@JsonIgnore
	private List<Etudiant> etudiant;
	@Builder
	public EnseignantChercheur(@NonNull String cin, @NonNull String nom, @NonNull String prenom,
			@NonNull Date dateNaissance, @NonNull String cv, @NonNull String email, @NonNull String password,
			@NonNull String grade, @NonNull String etablissement, List<Etudiant> etudiant) {
		super(cin, nom, prenom, dateNaissance, cv, email, password);
		this.grade = grade;
		this.etablissement = etablissement;
		this.etudiant = etudiant;
	}
	

}
