package dev.nardos.springmvc101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringmvcApplication.class, args);

		System.out.format("Started: %s%n", (new Date(context.getStartupDate())).toString());
		System.out.format("Total Number of Beans: %d%n", context.getBeanDefinitionCount());
		String namesOfBeans[] = context.getBeanDefinitionNames();
		Arrays.sort(namesOfBeans);

		int i = 0;
		for(String bean : namesOfBeans) {
			System.out.format("%d. %s%n", ++i, bean);
		}
	}

}
