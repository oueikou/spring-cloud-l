package eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/hi/{name}")
	public String home(@PathVariable String name) {
		return "hello " + name + ",i am from port:" + port;
	}
	
}
