
public class Address {
	public String address;
	public Address(String address) {
		this.address = address;
	}
	
	public String getStreetName() {
		String[] parts = address.split(",");
		return parts[0].trim();
	}
	
	public String getCityName() {
		String[] parts = address.split(",");
		return parts[1].trim();
	}
	
	public String getStateName() {
		String[] parts = address.split(",");
		String statezipcode = parts[2].trim();
		String[] statecode = statezipcode.split(" ");
		return statecode[0].trim();
	}
	
	public int getZipCode() {
		String[] parts = address.split(",");
		String statezipcode = parts[2].trim();
		String[] statecode = statezipcode.split(" ");
		return Integer.parseInt(statecode[1].trim());
	}
}