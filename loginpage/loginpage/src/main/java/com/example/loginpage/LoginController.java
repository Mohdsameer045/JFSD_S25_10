package com.example.loginpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	 @GetMapping("/login")
	    public String showLoginForm() {
	        return "login"; // Returns login.html
	    }

	    @PostMapping("/login")
	    public String login(@RequestParam String username, @RequestParam String password, Model model) {
	        // Simple validation (replace with actual validation)
	        if ("admin".equals(username) && "password".equals(password)) {
	            model.addAttribute("username", username);
	            return "welcome"; // Returns welcome.html
	        }
	        model.addAttribute("error", "Invalid credentials");
	        return "login"; // Return to login.html
	    }
	    


}
