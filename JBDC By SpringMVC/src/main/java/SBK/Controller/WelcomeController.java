package SBK.Controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import SBK.DAO.CustomerDao;
import SBK.Models.Students;
import SBK.Models.EmailTaker;
import SBK.Models.Users;

import org.apache.log4j.Logger;


@Controller("/")
@EnableAspectJAutoProxy
public class WelcomeController {

	private Logger logger = Logger.getLogger(WelcomeController.class);
	
	@Autowired
	private CustomerDao customerDao;
	
	//add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
		
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
			
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping(path = "/AddCustomer",method = RequestMethod.GET)
	public String addStudent(Model model) {
		model.addAttribute("customerModel", new Students());
		return "AddCustomer";
	}
	
	@RequestMapping(path = "/ProcessingAddCustomer",method = RequestMethod.POST)
	public String processingNewCustomer(@Valid @ModelAttribute("customerModel") 
		Students customer, BindingResult theBindingResult,Model model) {
		
		if (theBindingResult.hasErrors()) {
			System.out.println(theBindingResult+"\n\n");
			return "AddCustomer";
		}
		
		System.out.println("Name: "+customer.getFirst_Name());
		System.out.println("Last Name: "+customer.getLast_Name());
		System.out.println("Address: "+customer.getAddress());
		System.out.println("Birthday Month: "+customer.getBirthday_Month());
		System.out.println("City: "+customer.getCity());
		System.out.println("Country: "+customer.getCountry());
		System.out.println("Email Id: "+customer.getEmail_Id());
		System.out.println("Gender: "+customer.getGender());
		System.out.println("Birthday Year: "+customer.getBirthday_Year());
		System.out.println("Birthday Day: "+customer.getBirthday_day());
		System.out.println("Mobile Number: "+customer.getMobile_Number());
		System.out.println("Course Code: "+customer.getCourse_Id());
		model.addAttribute("customer", customer);
		
		customerDao.save(customer);
		
		return "SuccessfullyCustomerAdded";
	}
	
	@RequestMapping(path="/Search", method = RequestMethod.GET)
	public String search(Model model) {
		model.addAttribute("emailTakerModel", new EmailTaker());
		
		return "EmailTaker";
	}
	@RequestMapping(path="/ViewData", method = RequestMethod.GET)
	public String viewData(@ModelAttribute("emailTakerModel") 
	EmailTaker emailTaker, Model model) {
		
		System.out.println(emailTaker.getEmail_id());
//		model.addAttribute("customer", customer);
		Students customer = customerDao.get(emailTaker.getEmail_id());
		logger.debug("sardana boy kanu");
		model.addAttribute("customer", customer);
		return "ViewPage";
	}
	
	@RequestMapping(path ="/ViewAllData", method = RequestMethod.GET)
	public String viewAllData(Model model) {
		List<Students> list = customerDao.list();
		for(Integer i = 0;i < list.size();i++) {
			System.out.println(list.get(i).getFirst_Name());
		}
		model.addAttribute("listCustomer", list);
		model.addAttribute("customer", list.get(0));
		return "ViewAllPage";
	}
	@RequestMapping(value="/edit/{Email_Id}", method=RequestMethod.GET)
	public String editData(@PathVariable("Email_Id") String Email_Id,Model model) {
		Students customer = customerDao.get(Email_Id);
		System.out.println(Email_Id+" \\nBirthday Month: "+customer.getBirthday_Month());
		model.addAttribute("customerModel", customer);
		return "EditPage";
	}
	@RequestMapping(value ="edit/submit", method = RequestMethod.POST)
	public String submitEditData(@Valid @ModelAttribute("customerModel") 
	Students customer, BindingResult theBindingResult,Model model) {
		
		if (theBindingResult.hasErrors()) {
			System.out.println(theBindingResult+"\n\n");
			return "EditPage";
		}
		
		System.out.println("Name: "+customer.getFirst_Name());
		System.out.println("Last Name: "+customer.getLast_Name());
		System.out.println("Address: "+customer.getAddress());
		System.out.println("Birthday Month: "+customer.getBirthday_Month());
		System.out.println("City: "+customer.getCity());
		System.out.println("Country: "+customer.getCountry());
		System.out.println("Email Id: "+customer.getEmail_Id());
		System.out.println("Gender: "+customer.getGender());
		System.out.println("Birthday Year: "+customer.getBirthday_Year());
		System.out.println("Birthday Day: "+customer.getBirthday_day());
		System.out.println("Mobile Number: "+customer.getMobile_Number());
		System.out.println("Course Code: "+customer.getCourse_Id());
		model.addAttribute("customer", customer);
		
		customerDao.update(customer);
		
		return "UpdateSuccessfully";
	}
	@RequestMapping(value="/delete/{Email_Id}", method=RequestMethod.GET)
	public String deleteData(@PathVariable("Email_Id") String Email_Id,Model model) {
		customerDao.delete(Email_Id);
		System.out.println(Email_Id);
		model.addAttribute(Email_Id);
		return "DeleteSuccessfully";
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