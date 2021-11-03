

/** this is the configuration class for Mongo Database...........................

package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;



@Configuration
public class MongoConfiguration {
	

	public @Bean MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("127.0.0.1"), "TrailDatabase");

		return mongoTemplate;

	}
	
}

**/
