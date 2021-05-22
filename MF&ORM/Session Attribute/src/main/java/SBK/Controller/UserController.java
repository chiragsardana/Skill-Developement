package SBK.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import SBK.Model.Users;


@Controller
public class UserController {

	@RequestMapping(value="/info", method = RequestMethod.GET)
	 public String userInfo(@SessionAttribute("userModel") Users userModel) {

		System.out.println("User id: "+userModel.getUserId());
		System.out.println("Password: "+userModel.getPwd());
		return "user";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.GET)
	public String userUpdateInfo(@SessionAttribute("userModel") Users userModel, Model model) {

		System.out.println("User id: "+userModel.getUserId());
		System.out.println("Password: "+userModel.getPwd());
		model.addAttribute("userModel", userModel);
		return "update";
	}
}