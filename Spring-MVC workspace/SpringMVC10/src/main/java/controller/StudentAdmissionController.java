package controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


		//Auto-DataBinding-- own custom-property
@Controller
public class StudentAdmissionController 
{
	//function having init. Method Argument WebDataBinder will ignore data binding
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	@RequestMapping(value ="admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() 
	{
		ModelAndView model1 = new ModelAndView("AdmissionForm");
		return model1;
	}
	//Always make call first for this method-spring mvc//
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage","Faltu College Of Engineering, U.S.A");
		
	}
	//Auto Data Binding //
	@RequestMapping(value ="submitAdmissionForm", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student, BindingResult result)
	{		
		if(result.hasErrors()){
			ModelAndView model1 = new ModelAndView("AdmissionForm");
			return model1;
		}
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");
		return model1;
	}
}