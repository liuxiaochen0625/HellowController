import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import conf.CustomDataSourceProperties;


@SpringBootApplication
public class Application{


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping("/")
	public void hello(){
		CustomDataSourceProperties custom = new CustomDataSourceProperties();
		System.out.println(custom.getDriverClassName());
		System.out.println(custom.getUrl());
	}
}
