package com.shop.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.dto.User;
import com.shop.service.UserService;
import com.shop.valid.UserValidator;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private MailSender mailSender;
	@Autowired
	private UserValidator userValidator;
	
	
	@RequestMapping(value="/pre_reg_form.htm" , method=RequestMethod.GET)
	public String preRegForm(ModelMap map) {
		map.put("user", new User());
		return "Reg_form";
		
	}
	
	@RequestMapping(value="/reg.htm" , method=RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user") User user
			,BindingResult result,ModelMap map) {
		
		if(result.hasErrors()) {
			List<ObjectError>allErrors = result.getAllErrors();
			for(ObjectError temp : allErrors) {
				
				System.out.println(temp);
		         
		         
		      }

			return "Reg_form";
		}else {
		userService.addUser(user);
		return "login";
		}
		
	}
	
	@RequestMapping(value="/pre_log_form.htm" , method=RequestMethod.GET)
	public String preLogForm(ModelMap map) {
		map.put("user", new User());
		return "login";
		
	}
	
	@RequestMapping(value="/login.htm" , method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("user") User user
,BindingResult result,ModelMap map,HttpSession session) {

		if(result.hasErrors()) {
			List<ObjectError>allErrors = result.getAllErrors();
			for(ObjectError temp : allErrors) {
				
				System.out.println(temp);
		         
		         
		      }

			return "login";
		}
		
		else {
			boolean b=userService.findUser(user);
			
			if(b) {
				session.setAttribute("user", user);
				return "home";
			}else {
				return "login";
		}
	}
}	
	@RequestMapping(value="/log_out.htm" , method=RequestMethod.GET)
	public String logOut(ModelMap map, HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		return "index";
		
	}
	
	@RequestMapping(value = "/forgot_password.htm",method = RequestMethod.POST)
	public String forgotPassword(@RequestParam String userName,ModelMap map) {		
		String pass = userService.forgotPassword(userName);
		String msg = "you are not registered";
		if(pass!=null) {	
			
			SimpleMailMessage message = new SimpleMailMessage();  
	        message.setFrom("cdacmumbai3@gmail.com");  
	        message.setTo(userName);  
	        message.setSubject("Your password");  
	        message.setText(pass);  
	        //sending message   
	        mailSender.send(message);
			msg = "check the mail for password";
		}
		map.put("msg", msg);
		return "info";
	}

}
