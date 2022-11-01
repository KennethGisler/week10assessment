package myProject;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import myProject.beans.Stats;
import myProject.beans.Units;
import myProject.controller.BeanConfiguration;
import myProject.repository.ContactRepository;*/

@SpringBootApplication
public class Week10AssessmentApplication{

	public static void main(String[] args) {
		SpringApplication.run(Week10AssessmentApplication.class, args);
	}

	/*@Autowired     I USED THIS FOR TESTING TO MAKE SURE EVERYTHING WORKS!
	ContactRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Units u = appContext.getBean("units",Units.class);
		repo.save(u);
		
		Units u2 = new Units("Veterans","Elites",60);
		Stats stats = new Stats(6,3,3,1,3,4,9,1,5);
		u2.setStats(stats);
		repo.save(u2);
		
		List<Units> allMyUnits = repo.findAll();
		for(Units units : allMyUnits) {
			System.out.println(units.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}*/

}
