package springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Spring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean = context.getBean("someBean", SomeBean.class);

		System.out.println(someBean.getSettings());
		System.out.println(someBean.getLocales());

	}

}
