package springtutorial;

public class Adress {
	private String locality;
	private String zipCode;
	private String street;
	private String streetNumber;

	public Adress(String locality, String zipCode, String street, String streetNumber) {
		super();
		this.locality = locality;
		this.zipCode = zipCode;
		this.street = street;
		this.streetNumber = streetNumber;
	}

	@Override
	public String toString() {
		return "Adress [locality=" + locality + ", zipCode=" + zipCode + ", street=" + street + ", streetNumber="
				+ streetNumber + "]";
	}

}
