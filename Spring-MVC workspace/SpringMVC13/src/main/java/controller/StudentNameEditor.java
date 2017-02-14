package controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	// when u will submit the admission form-->
	// SPring MVC will run setAsTExt function of this class-->
	// Before Performing data binding task for studentName property os studentobjet-->
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException{
		if(studentName.contains("Mr.") || studentName.contains("Ms.") ){
			setValue(studentName);
		}
		else{
			studentName = "MR."+studentName;
			setValue(studentName);  //what every value u provide spring mvc will use same value to perform data 
									// data binding task for studentName property
		}
	}
	
}