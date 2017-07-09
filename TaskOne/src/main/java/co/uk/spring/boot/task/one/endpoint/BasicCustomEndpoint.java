package co.uk.spring.boot.task.one.endpoint;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class BasicCustomEndpoint implements Endpoint<String> {

	@Override
	public String getId() {
		return "internal-greetings";
	}

	@Override
	public String invoke() {
		return "{\"msg\":\"Hello Management\"}";
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isSensitive() {
		return false;
	}

}
