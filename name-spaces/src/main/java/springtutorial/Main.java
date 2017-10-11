package springtutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		System.out.println(someBean.getStringValue());
		
		SomeBean someBean2 = context.getBean("someBean2", SomeBean.class);
		System.out.println(someBean2.getStringValue());
		String str3 = "dupa";
		String[] dupa = str3.split("p");
		
		System.out.println(Arrays.toString(dupa));
		
		Random random = new Random();
		int[] arr = new int[100];
		for (int i = 0; i<100; i++) {
			arr[i] = random.nextInt(99);
		}
		String[] arr2 = new String[100];
		Arrays.sort(arr);
		int j = 0;
		for (int i = 99; i>=0; i--) {
				
				arr2[j] = "|" + arr[i] + "|\n";
				j++;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
