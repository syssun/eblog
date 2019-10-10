package com.sys.eblog.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = NullDateValidator.class)
public @interface NullDate {

	String message() default "时间格式有误";
	
	String pattern() default "yyyy-MM-dd HH:mm:ss";
	
    Class<?>[] groups() default {};
 
    Class<? extends Payload>[] payload() default {};
	
	
	
}
