package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long>{
	  List<Publication> findByTitre(String titre);
	  List<Publication> findByDate(Date date);
	  List<Publication> findByLien(String lien);
	  List<Publication> findByType(String type);
	  List<Publication> findBySourcepdf(String sourcepdf);
}
