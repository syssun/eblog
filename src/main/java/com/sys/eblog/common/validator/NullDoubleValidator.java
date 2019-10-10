package com.sys.eblog.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullDoubleValidator implements ConstraintValidator<NullDouble, Double>{

	Double min=0.0;
	Double max=0.0;
	@Override
    public void initialize(NullDouble str) {
		min = str.min();
		max = str.max();
    }
	
	
	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		if(value==null) {
			return true;
		}
		if(value>max || value < min) {
			return false;
		}
		return true;
	}


}
