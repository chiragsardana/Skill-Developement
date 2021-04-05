package SBK.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String welcomemsg(Model model) {
		model.addAttribute("msg", "HomePage");
		return "Welcome";
	}
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request, Model model) {
		String userId=request.getParameter("userId");
		model.addAttribute("msg", "Chirag Sardana login -->"+userId);
		return "login";
	}
}