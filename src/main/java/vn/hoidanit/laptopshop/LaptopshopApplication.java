package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LaptopshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopshopApplication.class, args);
		// ApplicationContext hello = SpringApplication.run(LaptopshopApplication.class, args);
		// for(String s: hello.getBeanDefinitionNames()) {
		// 	System.out.println(s);
		// }
	}

}
