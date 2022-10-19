package A6;
import org.junit.*;
public class CalculatorTest {
     private Calculator c;
   
   @Before
   public void setup() {
       System.out.println("Before testing...");
       c = new Calculator();
   }
   
   @After
   public void cleanup() {
       System.out.println("Finishing and testing up the test...");
   }
   
   @Test
   public void TestAdd1() {
       int sum = c.add(10, 20);
       Assert.assertEquals(30, res);
   }
   
   @Test
   public void TestAdd2() {
       int sum = c.add(-10, 190);
       Assert.assertEquals(190, res);
   }
   
   @Test
   public void TestAdd3() {
       int sum = c.add(110, -20);
       Assert.assertEquals(110, res);
   }
}
