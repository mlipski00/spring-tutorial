package springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSpring {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean somebean = context.getBean("someBean", SomeBean.class);
		somebean.checkIsWorking();

	}

}
