package co.uk.spring.boot.task.two.orders.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

	RestTemplate restTemplate = new RestTemplate();

	@RequestMapping(value = "/success/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
	public String placeOrder(@PathVariable long id) {
		// Call another service to generate invoice id.
		Map<String, Long> vars = new HashMap<>();
		vars.put("orderId", id);
		String url = new String("http://localhost:81/invoice/create/{orderId}");
		ResponseEntity<String> resentity = restTemplate.getForEntity(url, String.class, vars);
		return resentity.getBody();
	}
}
