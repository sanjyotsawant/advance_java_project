package com.shop.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.shop.dto.User;

@Service
public class UserValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","unKey","Username is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPass","upKey", "Password is required");
		
//		User user=(User)target;
//		if(!user.getUserName().isEmpty()) {
//			String mail = user.getUserName();
//			
//			String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
//			Pattern emailPtrn = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
//			Matcher matcher=emailPtrn.matcher(mail);
//			
//			if(!matcher.find()) {
//				System.out.println("=======");
//				errors.rejectValue("userName", "unKey", "mail is invalid");
//			}else {
//				System.out.println("+++++");
//				errors.rejectValue("userName", "unm", "email is required");
//				
//			}
			
			
//			if(!user.getUserPass().isEmpty())
//			{
//				String pass=user.getUserPass();
//				
//				String passRegex="(?=.\\d)(?=.[a-z])(?=.*[A-Z]).{8,}";
//				Pattern emailPat=Pattern.compile(passRegex);
//				Matcher matcher1=emailPat.matcher(pass);
//				if(!matcher1.matches())
//				{
//					System.out.println("=======================================");
//					errors.rejectValue("userPass", "passKey", "password is invalid");
//				}
//			}else {
//				
//				System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//				errors.rejectValue("userPass", "passKey1", "password is required");
//			}
			
			
		}
			
			
		
	}

	


