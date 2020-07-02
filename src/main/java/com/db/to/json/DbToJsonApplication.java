package com.db.to.json;

//import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DbToJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbToJsonApplication.class, args);
	}

//	@Bean
//	public SpringLiquibase liquibase() {
//		SpringLiquibase liquibase = new SpringLiquibase();
//		liquibase.setChangeLog("classpath:liquibase-changeLog.xml");
//		//liquibase.setDataSource(dataSource());
//		return liquibase;
//	}

}
