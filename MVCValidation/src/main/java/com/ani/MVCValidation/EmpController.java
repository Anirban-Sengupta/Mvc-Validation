package com.ani.MVCValidation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
@RequestMapping("/a1")
public String Display(Model m) {
	m.addAttribute("emp", new Employee());
	return "Viewpage";
}
	
	@RequestMapping("/a2")
	public String SubmitForm(@Valid @ModelAttribute("emp")Employee e, BindingResult br, Model m1) {
		if(br.hasErrors())  
        {  
            return "Viewpage";
            //return "errorpage";  
        }  
        else  
        {  
        return "final";  
        }  
	}
}

