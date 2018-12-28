package com.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Dao.StudentDao;
import com.model.Student;



@Controller
public class LoginController {
@Autowired
StudentDao dao;
	@RequestMapping(value="/newEmployee")
	public ModelAndView empform(@ModelAttribute("addform") Student st)
	{
		return new ModelAndView("addForm");
		
	}
	@RequestMapping(value="/saveStudent")
	public ModelAndView saveform(@Valid @ModelAttribute("addform") Student st,BindingResult result)
	{
		if(result.hasErrors())
		return new ModelAndView("addForm");
		else{
			dao.saveEmployee(st);
			return new ModelAndView("Success");}
	}
}
