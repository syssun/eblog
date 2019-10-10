package com.sys.eblog.common.validator;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NullDateValidator implements ConstraintValidator<NullDate, String>{

	String pattern="";
	@Override
    public void initialize(NullDate str) {
		pattern = str.pattern();
    }
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(StringUtils.isEmpty(value)) {
			return true;
		}
		try {
			SimpleDateFormat sf = new SimpleDateFormat(pattern);
			sf.parse(value);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
}
