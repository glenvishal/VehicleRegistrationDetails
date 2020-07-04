package com.registration;

import com.registration.model.RegistrationDetails;
import com.registration.persistence.entities.VehicleRegistration;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static io.restassured.RestAssured.when;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;

@SpringBootTest
public class VehicleRegistrationApplicationTests {

	@Test
	void testHttp200Status() {
		when().request("GET", "/").then().assertThat()
				.statusCode(200);
	}

	@Test
	void testJsonBody() {
		List<VehicleRegistration> vehicleRegistrationList = when().request("GET", "/").then().assertThat()
				.statusCode(200).extract()
				.path("registrations");
		assertThat(vehicleRegistrationList.size()).isEqualTo(4);
	}

}
