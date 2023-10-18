package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;
import dmacc.beans.ComputerInformation;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Oct 18, 2023
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Computer computer() {
		Computer bean = new Computer();
		bean.setName("Knim Desktop");
		bean.setNumCores(16);
		bean.setStorageSpace(6);
		return bean;
	}
	
	@Bean
	public ComputerInformation computerInfo() {
		ComputerInformation bean = new ComputerInformation("Kenneth Nimmo", "Knimmo", "123abc");
		return bean;
	}
	
}
