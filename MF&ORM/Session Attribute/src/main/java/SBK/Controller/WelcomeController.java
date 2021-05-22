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
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import SBK.Model.Emails;
import SBK.Model.Users;


@Controller
@SessionAttributes("userModel")
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
	@RequestMapping(path = "/LoginSuccessfully",method = RequestMethod.POST)
	public String loginSuccessfuly(@Valid @ModelAttribute("userModel") Users user ,BindingResult theBindingResult,Model model) {
		
		
		if (theBindingResult.hasErrors()) {
			System.out.println(theBindingResult+"\n\n");
			return "login";
		}
		System.out.println(user.getUserId());
		model.addAttribute("userId",user.getUserId());
		return "LoginSuccessfully";
	}
	@RequestMapping(path="/backPage", method = RequestMethod.GET)
	public String backpage(@ModelAttribute("userModel") Users user, Model model) {
		model.addAttribute("userId", user.getUserId());
		model.addAttribute("pwd", user.getPwd());
		return "LoginSuccessfully";
	}
	
	@RequestMapping(path = "/LoginSuccessfully",method = RequestMethod.GET)
	public String backPage(@ModelAttribute("userModel") Users user, Model model) {
		model.addAttribute("userId", user.getUserId());
		model.addAttribute("pwd", user.getPwd());
		return "LoginSuccessfully";
	}
	
}