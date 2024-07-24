package com.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
//	private AuthenticationService authenticationService ;
//	
//	public WelcomeController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

//	@RequestMapping(value = "login", method = RequestMethod.GET)
//	private String goToLoginPage( ModelMap model) {
//
//		return "login";
//	}
	

//	@RequestMapping(value = "login", method = RequestMethod.POST)
//	private String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//
//		model.put("name", name);
//		model.put("password", password);
////		logger.debug("From logger");
//		
//		//Authentication
//		if(authenticationService.authenticate(name, password)) {
//			return "welcome";
//		}
//		model.put("error", "Invalid Credentials! Please try again");
////		System.out.println("Req param is " + name);
//		return "login";
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String goWelcomePage( ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
 