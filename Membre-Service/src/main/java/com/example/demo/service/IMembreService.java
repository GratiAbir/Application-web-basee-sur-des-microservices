package com.example.demo.service;

import java.util.List;
import com.example.demo.EnseignantChercheur;
import com.example.demo.Etudiant;
import com.example.demo.Membre;

public interface IMembreService {
	
	//Crud sur les membres
	public Membre addMember(Membre m);
	public void deleteMember(Long id) ;
	public Membre updateMember(Membre p) ;
	public Membre findMember(Long id) ;
	public List<Membre> findAll();
	
	//Filtrage par propriété
	public Membre findByCin(String cin);
	public Membre findByEmail(String email);
	public List<Membre> findByNom(String nom);
	
	//recherche spécifique des étudiants
	public List<Etudiant> findByDiplome(String diplome);
	
	//recherche spécifique des enseignants
	public List<EnseignantChercheur> findByGrade(String grade);
	public List<EnseignantChercheur> findByEtablissement(String etablissement);
	
	//other ...
	public void AffecterEtudiantToEnseignant(Long idEtd, Long idEns) ;
		
	//recherche spécifique des étudiants
	public List<Etudiant> ChercherEtdForEns(EnseignantChercheur ens);
}
