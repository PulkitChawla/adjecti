package exam.annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;

public class Test {
//List<Method> methodList=new ArrayList<>();
	
//	public List<Method> getAllMethods(Class clazz){
//		ExamRequestController examControl=new ExamRequestController();
//		while(clazz!=null) {
//			clazz=examControl.getClass();
//			//Reflections reflection=new Reflections("exam.annotation");
//			Method[] methodList=clazz.getMethods();
//				for(Method m:methodList)
//				{
//					String name=m.getName();
//					System.out.println("methods name are: "+name);
//				}
//			
//			
//		}

		//return methodList;
	//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Reflections reflection=new Reflections("Exam",new MethodAnnotationsScanner());
//		Set<Method> m=reflection.getMethodsAnnotatedWith(requestMapping.class);
//		for(Method m1:m) {
//			requestMapping rm=(requestMapping)m1.getAnnotation(requestMapping.class);
//			System.out.println(rm.path());
//			System.out.println(m1);
//		}
//		List<Method> methodList=new ArrayList<>();
//		Class clazz=new Class(null);
//		ExamRequestController examControl=new ExamRequestController();
//		while(clazz!=null) {
//			clazz=examControl.getClass();
//			//Reflections reflection=new Reflections("exam.annotation");
//			Method[] methodList=clazz.getMethods();
//				for(Method m:methodList)
//				{
//					String name=m.getName();
//					System.out.println("methods name are: "+name);
//				}
//	}

}
	}
/*
 Reflections reflection=new Reflections("Exam",new MethodAnnotationsScanner());
System.out.println(reflection);
Set<Method> m=reflection.getMethodsAnnotatedWith(requestMapping.class);
System.out.println(m);
for(Method m1:m) {
	requestMapping rm=(requestMapping)m1.getAnnotation(requestMapping.class);
	System.out.println(rm.path());
	System.out.println(m1);
}
 */
