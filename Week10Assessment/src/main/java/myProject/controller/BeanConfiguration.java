package myProject.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import myProject.beans.Stats;
import myProject.beans.Units;

/**
 * Kenneth Gisler - kgisler@dmacc.edu
 * CIS171 22149
 * Nov 1, 2022
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Units units() { //configures and makes new units
		//Units units = new Units("Guardsmen","Troop",50); was for testing
		Units units = new Units();
		return units;
	}
	
	@Bean
	public Stats stats() { //configures and makes new stats that are attached to units
		Stats stats = new Stats(6,3,3,1,4,4,8,1,5); 
		return stats;
	}
}
