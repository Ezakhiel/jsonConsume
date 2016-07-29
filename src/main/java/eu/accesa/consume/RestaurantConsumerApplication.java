package eu.accesa.consume;

import com.fasterxml.jackson.databind.ObjectMapper;

import eu.accesa.consume.model.Restaurant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import javafx.application.Application;

@SpringBootApplication
public class RestaurantConsumerApplication implements CommandLineRunner {
	
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestaurantConsumerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		RestTemplate restTemplate = new RestTemplate();
		Restaurant restaurant = restTemplate.getForObject("http://localhost:8080/restaurant/1", Restaurant.class);
		LOG.info(mapper.writeValueAsString(restaurant));
	}
}
