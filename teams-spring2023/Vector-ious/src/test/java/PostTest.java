import org.junit.*;

public class PostTest {

    @Test
    public void testCreatePost() {
        Room newRoom = new Room("SunnyHouse", "Bright House for Rent!",
        1000, "123 Sunny Side Ave, Pomona, CA, 98765");
        Post newPost = new Post("Testing Post", newRoom);

        String postMsg = newPost.getPostMessage();
        Assert.assertEquals("Testing Post", postMsg);

        String roomTitle = newRoom.getTitle();
        Assert.assertEquals("SunnyHouse", roomTitle);
    }
}
