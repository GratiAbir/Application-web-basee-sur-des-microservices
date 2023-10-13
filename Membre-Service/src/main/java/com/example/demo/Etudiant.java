package com.example.demo;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@DiscriminatorValue("etd")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant extends Membre {
	
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	@NonNull
	private String diplome;
	@NonNull
	private String sujet;
	@ManyToOne
	private EnseignantChercheur encadrant;
	@Builder
	public Etudiant(@NonNull String cin, @NonNull String nom, @NonNull String prenom,
			@NonNull Date dateNaissance, @NonNull String cv, @NonNull String email, @NonNull String password,
			 @NonNull Date dateInscription, @NonNull String diplome, @NonNull String sujet,
			EnseignantChercheur encadrant) {
		super(cin, nom, prenom, dateNaissance, cv, email, password);
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.sujet = sujet;
		this.encadrant = encadrant;
	}
	
	

	
	

}
