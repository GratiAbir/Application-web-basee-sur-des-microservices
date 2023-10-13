package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.bean.IHello;


@SpringBootApplication
public class Essai1Application implements CommandLineRunner {
	//CommandLineRunner: interface fiha méthode run li ta3mel el affichage fl console
	
	//pour faire l'injection de dépendance on utilise @Autowired 
	//pour faire une relation entre la classe HelloBean et la classe principale
	@Autowired 
	@Qualifier("fr") //mch i3ayet lel instance de type BonjourBean
	IHello h;
	
	public static void main(String[] args) {
		SpringApplication.run(Essai1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(h.getMessage("GI3"));
		
	}

}
