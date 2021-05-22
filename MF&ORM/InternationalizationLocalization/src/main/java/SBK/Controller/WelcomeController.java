package SBK.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SBK.Model.SignupForm;
import SBK.Model.Users;


@Controller
public class WelcomeController {

	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping(path = "/login",method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("userModel", new Users());
		return "login";
	}
	@RequestMapping(path = "/signup",method = RequestMethod.GET)
	public String signUp(Model model) {
		model.addAttribute("signUpModel", new SignupForm());
		return "signup";
	}
	
	@RequestMapping(path = "/SignUpSuccessfully",method = RequestMethod.POST)
	public String loginSuccessfuly(@Valid @ModelAttribute("signUpModel") SignupForm signUp ,BindingResult theBindingResult,Model model) {
		model.addAttribute("firstName", signUp.getFirstName());
		model.addAttribute("lastName", signUp.getLastName());
		model.addAttribute("pwd", signUp.getPwd());
		model.addAttribute("userId", signUp.getUserId());
		
		if (theBindingResult.hasErrors()) {
			System.out.println(theBindingResult+"\n\n");
			return "signup";
		}
		
		return "Signupsuccesfully";
	}
	
	@RequestMapping(path = "/LoginSuccessfully",method = RequestMethod.POST)
	public String loginSuccessfuly(@Valid @ModelAttribute("userModel") Users user ,BindingResult theBindingResult,Model model) {
		model.addAttribute("userId", user.getUserId());
		model.addAttribute("pwd", user.getPwd());
		
		if (theBindingResult.hasErrors()) {
			System.out.println(theBindingResult+"\n\n");
			return "login";
		}
		
		return "LoginSuccessfully";
	}
	
	@RequestMapping(path = "/LoginSuccessfully",method = RequestMethod.GET)
	public String backPage(@ModelAttribute("userModel") Users user, Model model) {
		model.addAttribute("userId", user.getUserId());
		model.addAttribute("pwd", user.getPwd());
		return "LoginSuccessfully";
	}
}