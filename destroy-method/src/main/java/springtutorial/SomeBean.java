package springtutorial;

import org.springframework.beans.factory.DisposableBean;

public class SomeBean implements DisposableBean{

	public void destroyMethod() {
		System.out.println("Niszczenie beana!");
		
	}
	
	public void isWorking() {
		System.out.println("działa!");
	}

	public void destroy() throws Exception {
		System.out.println("metoda uruchomiona przy niszczeniu");
		
	}
}
