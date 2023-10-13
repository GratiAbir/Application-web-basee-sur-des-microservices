package com.example.demo;

import java.util.Date;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr",discriminatorType = DiscriminatorType.STRING, length =3)
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Membre {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String cin; 
	@NonNull
    private String nom; 
	@NonNull
    private String prenom; 
	@NonNull @Temporal(TemporalType.DATE)
    private Date dateNaissance; 
	@NonNull
    private String cv; 
	@NonNull
    private String email; 
	@NonNull
    private String password; 
	//@NonNull
    private byte[] Photo; 
	
    
}
