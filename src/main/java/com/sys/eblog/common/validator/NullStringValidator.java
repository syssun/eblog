package com.sys.eblog.common.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullStringValidator implements ConstraintValidator<NullString, String> {
	int min=0;
	int max=0;
	@Override
    public void initialize(NullString str) {
		min = str.min();
		max = str.max();
    }
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value==null || value.length()<=0) {
			return true;
		}
		if(value.length()>max || value.length()<min) {
			return false;
		}
		return true;
	}

}
