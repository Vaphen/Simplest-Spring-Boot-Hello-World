package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"text/plain"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "Hello FUCKING World!!!"; //"application/json" mean this is a text not a redirect
	}
}
