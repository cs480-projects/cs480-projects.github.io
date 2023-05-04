import org.junit.*;
public class AddressTest {
	Address address = new Address("3801 W Temple Ave, Pomona, CA 91768");
	
	@Test
	public void testStreetName() {
		Assert.assertEquals("3801 W Temple Ave", address.getStreetName());
	}
	
	@Test
	public void testCityName() {
		Assert.assertEquals("Pomona", address.getCityName());
	}
	
	@Test
	public void testStateName() {
		Assert.assertEquals("CA", address.getStateName());
	}
	
	@Test
	public void testZipCode() {
		Assert.assertEquals(91768, address.getZipCode());
	}
}