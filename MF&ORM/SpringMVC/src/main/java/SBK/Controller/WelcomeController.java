package SBK.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import SBK.Models.Customers;
import SBK.Models.Users;

@Controller
public class WelcomeController {

	@RequestMapping(path = "/hello")
	public String welcomemsg(Model model) {
		model.addAttribute("msg", "HomePage");
		return "Welcome";
	}
//	HttpServletRequest
//	@RequestMapping("/login")
//	public String doLogin(HttpServletRequest request, Model model) {
//		String userId=request.getParameter("userId");
//		String password = request.getParameter("pwd");
//		model.addAttribute("msg", "login User-->"+userId +" password: "+password);
//		return "login";
//	}
//	RequestMapping
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String doLogin(@RequestParam(required=false,name="userId") String userId, @RequestParam(required=false,name="pwd") String password, Model model) {
//		model.addAttribute("msg", "login User-->"+userId +" password: "+password);
//		return "login";
//	}
	@RequestMapping(path = "/login",method = RequestMethod.GET)
	public String login(Model model) {
//		model.addAttribute("msg", user.getUserId()+" and "+user.getPwd());
		model.addAttribute("userModel", new Users());
		return "login";
	}
	@RequestMapping(path = "/LoginSuccessfully",method = RequestMethod.POST)
	public String loginSuccessfuly(@ModelAttribute("userModel") Users user , Model model) {
		model.addAttribute("userId", user.getUserId());
		model.addAttribute("pwd", user.getPwd());
		return "LoginSuccessfully";
	}
	@RequestMapping(path = "/AddCustomer",method = RequestMethod.GET)
	public String addCustomer(Model model) {
		//Basically Just i want to get the value of username in all pages 
		model.addAttribute("customerModel", new Customers());
		Map<String, String> Birthday_YearItems = new LinkedHashMap<String, String>();
		for(Integer i = 2020;i >=1980;i--) {
			Birthday_YearItems.put(""+i, ""+i);
		}
		Map<String, String> Birthday_MonthItems = new LinkedHashMap<String, String>();
		Birthday_MonthItems.put("Jan", "January");
		Birthday_MonthItems.put("Feb", "February");
		Birthday_MonthItems.put("Mar", "March");
		Birthday_MonthItems.put("Apr", "April");
		Birthday_MonthItems.put("May", "May");
		Birthday_MonthItems.put("Jun", "June");
		Birthday_MonthItems.put("Jul", "July");
		Birthday_MonthItems.put("Aug", "August");
		Birthday_MonthItems.put("Sep", "September");
		Birthday_MonthItems.put("Oct", "October");
		Birthday_MonthItems.put("Nov", "November");
		Birthday_MonthItems.put("Dec", "December");
		
		Map<String, String> Birthday_dayItems = new LinkedHashMap<String, String>();
		
		for(Integer i = 1;i <= 31;i++) {
			Birthday_dayItems.put(""+i, ""+i);
		}
		model.addAttribute("Birthday_YearItems", Birthday_YearItems);
		model.addAttribute("Birthday_MonthItems", Birthday_MonthItems);
		model.addAttribute("Birthday_dayItems", Birthday_dayItems);
		return "AddCustomer";
	}
	@RequestMapping(path = "/NewCustomerAdd",method = RequestMethod.POST)
	public String addedCustomer(@ModelAttribute("customerModel") Customers customer ,Model model) {
		System.out.println("Name: "+customer.getFirst_Name());
		System.out.println("Last Name: "+customer.getLast_Name());
		System.out.println("Address: "+customer.getAddress());
		System.out.println("Birthday Month: "+customer.getBirthday_Month());
		System.out.println("City: "+customer.getCity());
		System.out.println("Country: "+customer.getCountry());
		System.out.println("Email Id: "+customer.getEmail_Id());
		System.out.println("Gender: "+customer.getGender());
		System.out.println("Hobbies Drawing: "+customer.getHobby_Drawing());
		System.out.println("Hobbies Singing: "+customer.getHobby_Singing());
		System.out.println("Hobbies Dancing: "+customer.getHobby_Dancing());
		System.out.println("Hobbies Cooking: "+customer.getHobby_Cooking());
		System.out.println("Hobbies Other: "+customer.getHobby_Other());
		System.out.println("Birthday Year: "+customer.getBirthday_Year());
		System.out.println("BIrthday Day: "+customer.getBirthday_day());
		System.out.println("Mobile Number: "+customer.getMobile_Number());
		model.addAttribute("customer", customer);
		return "SuccessfullyCustomerAdded";
	}
	@RequestMapping(path = "/welcome")
	public String welcome() {
		//Here we can use session Management to get user name and password  to this page
		return "LoginSuccessfully";
	}
}