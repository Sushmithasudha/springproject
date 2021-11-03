package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ModelClass;
import com.example.demo.service.ServiceClass;

@RestController
public class EmployeeController {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	ServiceClass service;

	// Trail rest Api.....

	@RequestMapping(value = "/GetData")
	public ArrayList<ModelClass> GetData() {

		ModelClass model1 = new ModelClass();

		model1.setStudent_id("1");
		model1.setStudent_name("sandhya");
		model1.setAge("25");

		ModelClass model2 = new ModelClass();

		model2.setStudent_id("2");
		model2.setStudent_name("hi");
		model2.setAge("25");

		ArrayList<ModelClass> ss = new ArrayList();

		ss.add(model1);
		ss.add(model2);

		return ss;

	}

	// Trail for saving the data into database with Exception
	@RequestMapping(value = "/GetDataFromDatabase")
	public void GetDataFromDatabase() {

		ModelClass model1 = new ModelClass();

		model1.setStudent_id("1");
		model1.setStudent_name("sandhya");
		model1.setAge("25");

		try {
			mongoTemplate.save(model1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Tested for HashMap.....

	@RequestMapping(value = "/myMap")
	public Map<String, String> myMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Hello", "world");
		return map;
	}

	// Trail for getting the data from the service class...

	@RequestMapping(value = "/getDataFromService")
	public ModelClass getDataFromService() {
		ModelClass model = service.getModelData();
		return model;
	}

	// Trail for creating the Path Variable................
	
	@RequestMapping(value = "/getPathVariable/{name}")
	public String PathVariable(@PathVariable String name) {
		return name;
	}
	
	// Checking the Request Param................

	@RequestMapping(value = "/getRequestParam")
	public String getRequestParam(@RequestParam String name) {
	   return name;	
	}

}
