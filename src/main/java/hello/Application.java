package hello;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

public class Application {

	public static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Greeting greeting = restTemplate.getForObject("http://logan-hp-notebook:8080/greeting?name=CHiku", Greeting.class);

		logger.info(greeting);
	}
}