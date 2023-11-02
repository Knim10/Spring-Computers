package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

import dmacc.beans.Computer;
import dmacc.beans.ComputerInformation;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class SpringComputersApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringComputersApplication.class, args);
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Computer c = appContext.getBean("computer", Computer.class);
		
		//System.out.println(c.toString());
		
	}
	
	//@Autowired
	//ComputerRepository repo;

	//@Override
	//public void run(String... args) throws Exception {
		
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		//Computer c = appContext.getBean("computer", Computer.class);
		//c.setNumCores(16);
		//repo.save(c);
		
		//Creating a bean to use - not managed by Spring
		//Computer d = new Computer("Knim Desktop", 16, 6);
		//ComputerInformation ci = new ComputerInformation("Kenneth Nimmo", "Knimmo", "123abc");
		//d.setComputerInfo(ci);
		//repo.save(d);
		
		//List<Computer> allMyComputers = repo.findAll();
		
		//for(Computer computer : allMyComputers) {
			//System.out.println(computer.toString());
		//}
		
		//((AbstractApplicationContext) appContext).close();
		
	//}

}
