package SBK.Controller;


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

import SBK.Models.Customers;

@Controller
public class WelcomeController {

	
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
		model.addAttribute("customerModel", new Customers());
		return "AddCustomer";
	}
	
	@RequestMapping(path = "/ProcessingAddCustomer",method = RequestMethod.POST)
	public String processingNewCustomer(@Valid @ModelAttribute("customerModel") 
		Customers customer, BindingResult theBindingResult,Model model) {
		
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
		
		return "SuccessfullyCustomerAdded";
	}
}