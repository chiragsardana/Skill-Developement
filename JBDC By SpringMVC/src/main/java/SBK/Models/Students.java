package SBK.Models;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import SBK.Validators.CourseCode;

public class Students {
	private Map<String, String> Birthday_YearItems = new LinkedHashMap<String, String>();
	private Map<String, String> Birthday_MonthItems = new LinkedHashMap<String, String>();
	private Map<String, String> Birthday_dayItems = new LinkedHashMap<String, String>();
	
	public Students() {
		super();
		for(Integer i = 2020;i >=1980;i--) {
			Birthday_YearItems.put(""+i, ""+i);
		}
		
		Birthday_MonthItems.put("January", "January");
		Birthday_MonthItems.put("February", "February");
		Birthday_MonthItems.put("March", "March");
		Birthday_MonthItems.put("April", "April");
		Birthday_MonthItems.put("May", "May");
		Birthday_MonthItems.put("June", "June");
		Birthday_MonthItems.put("July", "July");
		Birthday_MonthItems.put("August", "August");
		Birthday_MonthItems.put("September", "September");
		Birthday_MonthItems.put("October", "October");
		Birthday_MonthItems.put("November", "November");
		Birthday_MonthItems.put("December", "December");
		
		
		
		for(Integer i = 1;i <= 31;i++) {
			Birthday_dayItems.put(""+i, ""+i);
		}
	}
	@NotEmpty(message = "The First Name Should Not Be Empty")
	private String First_Name;
	
	
	@NotNull(message = "Required")
	@Size(min=2, max = 30, message="Size Should be Greater than 2 Char"
			+ "aracter and Less than 30")
	private String Last_Name;
	
	@NotNull(message = "Required")
	private String Birthday_day;
	
	@NotNull(message = "Required")
	private String Birthday_Month;
	
	@NotNull(message = "Required")
	private String Birthday_Year;
	
	@NotNull(message="is required")
	@Email
	private String Email_Id;
	
	@NotNull(message="is required")
	@Pattern(regexp= "[0-9]{10}", message="Only 10 digits allowed")
	private String Mobile_Number;
	
	
	@NotNull(message = "Required")
	private String Gender;
	
	@NotNull(message="is required")
	private String Address;
	
	@NotNull(message="is required")
	@Pattern(regexp="[^0-9]*")
	private String City;
	
	@NotNull(message="is required")
	@Pattern(regexp= "[0-9]{6}", message="Only 6 digits allowed")
	private String Pin_Code;
	
	@NotNull(message="is required")
	@Pattern(regexp="[^0-9]*")
	@Size(max = 30)
	private String State;
	
	@NotNull(message="is required")
	@Pattern(regexp="[^0-9]*")
	@Size(max = 30)
	private String Country;
	
	@NotNull(message="is required")
	@CourseCode(value={"CSE","ECE","CSL","SOM"})
	private String Course_Id;
	
	@NotNull(message="is required")
	private String Enrolement_Id;
	
	public String getBirthday_day() {
		return Birthday_day;
	}
	public void setBirthday_day(String Birthday_day) {
		this.Birthday_day = Birthday_day;
	}
	public String getBirthday_Month() {
		return Birthday_Month;
	}
	public void setBirthday_Month(String birthday_Month) {
		Birthday_Month = birthday_Month;
	}
	public String getBirthday_Year() {
		return Birthday_Year;
	}
	public void setBirthday_Year(String birthday_Year) {
		Birthday_Year = birthday_Year;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public String getMobile_Number() {
		return Mobile_Number;
	}
	public void setMobile_Number(String mobile_Number) {
		Mobile_Number = mobile_Number;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPin_Code() {
		return Pin_Code;
	}
	public void setPin_Code(String pin_Code) {
		Pin_Code = pin_Code;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getCourse_Id() {
		return Course_Id;
	}
	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}
	public Map<String, String> getBirthday_YearItems() {
		return Birthday_YearItems;
	}
	public void setBirthday_YearItems(Map<String, String> birthday_YearItems) {
		Birthday_YearItems = birthday_YearItems;
	}
	public Map<String, String> getBirthday_MonthItems() {
		return Birthday_MonthItems;
	}
	public void setBirthday_MonthItems(Map<String, String> birthday_MonthItems) {
		Birthday_MonthItems = birthday_MonthItems;
	}
	public Map<String, String> getBirthday_dayItems() {
		return Birthday_dayItems;
	}
	public void setBirthday_dayItems(Map<String, String> birthday_dayItems) {
		Birthday_dayItems = birthday_dayItems;
	}
	public String getEnrolement_Id() {
		return Enrolement_Id;
	}
	public void setEnrolement_Id(String enrolement_Id) {
		Enrolement_Id = enrolement_Id;
	}
}
