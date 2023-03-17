import org.junit.Assert;
import org.junit.Test;

public class RoomTest {
	Room sampleroom = new Room("Nice Room for Rent" ,""
			+ "Description\r\n"
			+ "Nice open room for rent. Very cheap. DM if interested!\r\n"
			+ "Room for rent by 4/1 $800 (w/utilities included) (female only)\r\n"
			+ "Have access to kitchen, living room, & in unit washer and dryer.\r\n"
			+ "You also have access to amenities (24hr gym, pool, jacuzzi, tennis court, etc. It’s in a safe gated community.",
			800,
			"3801 W Temple Ave, Pomona, CA 91768");
	
	@Test
    public void testRoomTitle()
    {
        Assert.assertEquals("Nice Room for Rent", sampleroom.getTitle());
    }
	
	@Test
    public void testRoomDescription()
    {
        Assert.assertEquals(""
    			+ "Description\r\n"
    			+ "Nice open room for rent. Very cheap. DM if interested!\r\n"
    			+ "Room for rent by 4/1 $800 (w/utilities included) (female only)\r\n"
    			+ "Have access to kitchen, living room, & in unit washer and dryer.\r\n"
    			+ "You also have access to amenities (24hr gym, pool, jacuzzi, tennis court, etc. It’s in a safe gated community.", 
    			sampleroom.getDescription());
    }
	
	@Test
    public void testRoomPrice()
    {
        Assert.assertEquals(800, sampleroom.getPrice());
    }
	
	@Test
    public void testRoomAddress()
    {
        Assert.assertEquals("3801 W Temple Ave, Pomona, CA 91768", sampleroom.getAddress());
    }
}
