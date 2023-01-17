package com.example.SmallWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SmallWebApp.dao.UserRepo;

@Controller

public class RegistrationController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/regform")
	public String register() {
		
		return "registration";
	}
		
		
	/*
	 * @RequestMapping("/userDetails")
	 *  public ModelAndView userInfo(UserRegistration reg) {
	 * 
	 * ModelMap model =new ModelMap();
	 *  model.addAttribute("name", reg.getUName());
	 * model.addAttribute("email", reg.getEmailId());
	 * model.addAttribute("gender",reg.getGender()== Integer.parseInt("1")? "Male": "Female");
	 *  model.addAttribute("hobbies", reg.getHobby());
	 * 
	 * ModelAndView mv = new ModelAndView("user-details");
	 * mv.addObject("regObj",model); return mv;
	 */


		@RequestMapping("/userDetail")
		public String userInfo(UserRegistration reg) {
			repo.save(reg);
			return "operation";
		}
		

		@RequestMapping("/operation")
		public ModelAndView operation(Long UId,String ddFlag) {
			if(ddFlag.equals("select")) {
				// see how to fetch value from database
				UserRegistration reg =repo.findById(UId).orElse(new UserRegistration());//don't want null value inside else so pass same object
				return selectRecords(reg);
				
				
			}else if(ddFlag.equals("delete")) {
				repo.deleteById(UId);
			}else if (ddFlag.equals("update")) {
				     //there is no update like  operation in spring so 
				     //first find which one you want update
				UserRegistration reg=repo.findById(UId).orElse(new UserRegistration());
				      //now set value of selected operation
				reg.setUName("xyz_updated _name_");
				     //now after update save changes
				repo.save(reg);
				
			}else {
				}
			return new ModelAndView("operation");
		 	
			
		}
		
		//create seperate object 
		 public ModelAndView selectRecords(UserRegistration reg) {
			 
			  ModelMap model =new ModelMap();
			   model.put("name", reg.getUName());
			  model.put("email", reg.getEmailId());
			  model.put("gender",reg.getGender()== Integer.parseInt("1")? "Male": "Female");
			 
			  ModelAndView mv = new ModelAndView("user-details");
			  mv.addObject("regObj",model); 
			  return mv;
		
		
		 }	
		
		
}
