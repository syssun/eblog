package com.sys.eblog.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullIntergerValidator  implements ConstraintValidator<NullInterger, Integer>{

	
	int min=0;
	int max=0;
	@Override
    public void initialize(NullInterger str) {
		min = str.min();
		max = str.max();
    }
	
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(value==null) {
			return true;
		}
		if(value>max || value < min) {
			return false;
		}
		return true;
	}

}
