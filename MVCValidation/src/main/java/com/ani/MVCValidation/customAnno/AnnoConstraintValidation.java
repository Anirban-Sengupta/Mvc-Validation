package com.ani.MVCValidation.customAnno;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AnnoConstraintValidation implements ConstraintValidator<Password, String> {
	public boolean isValid(String s, ConstraintValidatorContext cvc) {  
        
        boolean result=s.contains("jtp");  
        return result;  
    }  

}
