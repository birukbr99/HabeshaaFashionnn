package com.mum.edu.jemaw.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;












import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mum.edu.jemaw.model.Customer;
import com.mum.edu.jemaw.model.Person;
import com.mum.edu.jemaw.service.CustomerService;


@Controller
public class RegistrationController {
	
	@Autowired
    private CustomerService customerService;
	
	@RequestMapping(value="/register")
	public String addCustomer(Customer customer) {
		return "register";
	}

	@RequestMapping(value="/addCustomer")
	public String saveEmployee(@Valid @ModelAttribute  Customer customer, BindingResult bindingResult,
			Model model) {
 		
		if (bindingResult.hasErrors()) {
			return "register";
		}
		

		customerService.saveCustomer(customer);
		
	    model.addAttribute("customer", customer);
	    
	   
		return "EmployeeDetails";
	}
	
	
/*	@InitBinder
    public void initBinder(WebDataBinder binder) {
//         binder.setDisallowedFields("id");
//        binder.setRequiredFields("username", "password", "emailAddress");
      
     binder.registerCustomEditor(Person.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
               Date date=new Date();
               SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                try {
					setValue(sdf.parse(text));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
       
    }*/
	
	@InitBinder
	public void allowEmptyDateBinding( WebDataBinder binder )
	{
	    // tell spring to set empty values as null instead of empty string.
	    binder.registerCustomEditor( String.class, new StringTrimmerEditor( true ));
	    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
	    simpleDateFormat.setLenient(false);
	    binder.registerCustomEditor( Date.class, new CustomDateEditor( simpleDateFormat,false));	   
	}
}
