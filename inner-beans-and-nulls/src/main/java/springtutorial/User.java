package springtutorial;

public class User {

	private String name;
	private Adress adress;

	
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", adress=" + adress + "]";
	}

}
