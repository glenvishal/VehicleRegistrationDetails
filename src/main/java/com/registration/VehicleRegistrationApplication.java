package com.registration;

//import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRegistrationApplication.class, args);
	}

//	@Bean
//	public SpringLiquibase liquibase() {
//		SpringLiquibase liquibase = new SpringLiquibase();
//		liquibase.setChangeLog("classpath:liquibase-changeLog.xml");
//		//liquibase.setDataSource(dataSource());
//		return liquibase;
//	}

}
