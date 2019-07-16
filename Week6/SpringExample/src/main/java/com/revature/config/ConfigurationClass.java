package com.revature.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.beans.House;

@Configuration
public class ConfigurationClass {
	
	@Bean()
	@Scope("prototype")
	public House house() {
		return new House();
	}

}
