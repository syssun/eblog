package com.sys.eblog.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = NullDoubleValidator.class)
public @interface NullDouble{
	
	String message() default "参数值有误";
	/**
	 * @return size the element must be higher or equal to
	 */
	double min() default 0.0;

	/**
	 * @return size the element must be lower or equal to
	 */
	double max() default Double.MAX_VALUE;
	
	
	
    Class<?>[] groups() default {};
 
    Class<? extends Payload>[] payload() default {};
	
	
	
	
}



