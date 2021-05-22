package SBK.Controller;

import java.io.File;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import SBK.Model.Emails;
import SBK.Model.Users;

@Controller
public class EmailController {
	
	@Autowired
	private JavaMailSender mailSenderObj;
	
	@RequestMapping(path = "/emailForm",method = RequestMethod.GET)
	public String emailForm(@SessionAttribute("userModel") Users userModel,Model model) {
		model.addAttribute("emailModel", new Emails());
		System.out.println("User id: "+userModel.getUserId()+"EMail Form ");
		System.out.println("Password: "+userModel.getPwd());
		model.addAttribute("userModel", userModel);
		return "EmailForm";
	}
	@RequestMapping(path = "/emailSend", method = RequestMethod.POST)
	public String sendEmail(@Valid @ModelAttribute("emailModel") Emails email, BindingResult br,
				Model model,@SessionAttribute("userModel") Users userModel) {
		
		model.addAttribute("userModel", userModel);
		
		if(br.hasErrors()) {
			return "EmailForm";
		}
		File file = new File(email.getFileName());
		System.out.println(file.getAbsolutePath());
		System.out.println("To...: "+email.getMailTo());
		System.out.println("Subject: "+email.getSubject());
		System.out.println("Message: "+email.getMessage());
		System.out.println("File Name: "+email.getFileName());
		model.addAttribute("email",email);
		
		mailSenderObj.send(
				new MimeMessagePreparator() {
			
			public void prepare(MimeMessage mimeMessage) throws Exception {
				// TODO Auto-generated method stub
				MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMessageHelper.setTo(email.getMailTo());
				mimeMessageHelper.setText(email.getMessage()+"\nSended Using JavaMail Object Spring MVC");
				mimeMessageHelper.setSubject(email.getSubject());
				if(email.getFileName() !="") {
				DataSource datasource = new FileDataSource("/Users/chiragsardana/Desktop/4th Sem/SpringMVCFile/"+email.getFileName());  
				mimeMessageHelper.addAttachment(email.getFileName(), datasource);
				System.out.println(datasource);
				}
				
			}
		});
		return "EmailSendSuccessfully";
	}
}
