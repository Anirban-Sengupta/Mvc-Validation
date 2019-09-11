package com.ani.MVCValidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.ani.MVCValidation.customAnno.Password;

public class Employee {
 @Size(min=1,max=10, message="required") //spring MVC validation
 private String Name;
// @Size(min=1, message="required")                                    //spring MVC validation
// @Pattern(regexp="^[a-zA-Z0-9]{8}",message="length must be 8")      //spring Expression validation
// private String password;
 
 @Password  // Custom Annotation
 @Pattern(regexp="^[a-zA-Z0-9]{8}",message="length must be 8") //spring Expression validation
 private String password; 
 @Min(value=18, message="must be equal or greater than 18")  //minimum number annotation
 @Max(value=45, message="must be equal or less than 45")    // maximum number annotation
 private int age;  
 
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
