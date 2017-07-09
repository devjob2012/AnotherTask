package co.uk.spring.boot.task.one.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Controller endpoint /greetings; method GET; produces JSON
 * 
 * @author devrawat
 *
 */
@RestController
public class BasicController {
	@RequestMapping(value = "/greetings", method = GET, produces = APPLICATION_JSON_VALUE)
	public String printGreeting() {
		return "{\"msg\":\"Hello World\"}";
	}
}
