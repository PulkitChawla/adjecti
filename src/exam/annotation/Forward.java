package exam.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Forward {
	String key() default "failure";
	String page() default "error.jsp";
}
