package exam.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import exam.handler.ForwardMapping;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface actionMapping {
	
		String actionName() default "index.jsp";
		
}


