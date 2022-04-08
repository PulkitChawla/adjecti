 package exam.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.reflections.Reflections;

import exam.servlet.Action;
import exam.servlet.MethodList;

public class MethodHandler {

	public static List<Action> actions = new ArrayList<Action>();

	public static List<Action> getCustomAnnotation() {

		Reflections reflex = new Reflections("exam");//package first name

		for (Class c : reflex.getTypesAnnotatedWith(actionMapping.class)) {

			actionMapping cla = (actionMapping) c.getAnnotation(actionMapping.class);
			

			List<MethodList> methodL = new ArrayList<MethodList>();

			Method[] m = c.getDeclaredMethods();
			for (Method m1 : m) {

				requestMapping t = (requestMapping) m1.getAnnotation(requestMapping.class);

				MethodList meth = new MethodList(m1.getName(), t.path());
				methodL.add(meth);
			}

			Action act = new Action(c.getSimpleName(), c.getName(), methodL);
			actions.add(act);
		}
		System.out.println("---------------- MethodHandler class -----------------");
		System.out.println(actions);
		return actions;

	}
}
