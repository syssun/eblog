package com.sys.eblog.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = NullStringValidator.class)
public @interface NullString {

	
	String message() default "参数长度错误";
	 
	/**
	 * @return size the element must be higher or equal to
	 */
	int min() default 0;

	/**
	 * @return size the element must be lower or equal to
	 */
	int max() default Integer.MAX_VALUE;
	
	
	
    Class<?>[] groups() default {};
 
    Class<? extends Payload>[] payload() default {};
	
	
	
}
