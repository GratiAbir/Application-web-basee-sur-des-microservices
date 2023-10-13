package com.example.demo.bean;

import org.springframework.stereotype.Component;

//pour créer l'objet eng <=> HelloBean eng = new HelloBean()
@Component("eng")
public class HelloBean implements IHello {
	public String getMessage(String msg) {
		return "Hello "+msg;
	}
}
