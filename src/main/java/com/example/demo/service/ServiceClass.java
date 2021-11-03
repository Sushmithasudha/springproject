package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ModelClass;

@Service
public class ServiceClass {

	
	public ModelClass getModelData() {
		
		ModelClass model = new ModelClass();
		
		model.setStudent_id("2");
		model.setStudent_name("Banana");
		model.setAge("25");
		
		
		return model;
		
	}

}
