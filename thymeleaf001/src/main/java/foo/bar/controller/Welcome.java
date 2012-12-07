package foo.bar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Welcome {
	private final static Logger logger = LoggerFactory.getLogger(Welcome.class);

	@RequestMapping("/welcome")
	public String welcomePage(){
		logger.debug("Sending to welcome page.");
		return "Welcome"; 
	}
}
