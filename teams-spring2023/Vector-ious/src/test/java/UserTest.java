import org.junit.*;
public class UserTest {

    @Test
    public void testMakeUser()
    {
        User use = new User("Raymar", "Lagos","rlagos","12345");
        String firstName = use.getFirstName();
        Assert.assertEquals("Raymar", firstName);
    }
}
