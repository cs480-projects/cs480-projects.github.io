package edu.cpp.CS4800_A4_ChinLee;
import org.junit.*;
public class CalculatorTest {

   private Calculator c;
   
   @Before
   public void setup() {
       System.out.println("Setting up...");
       c = new Calculator();
   }
   
   @After
   public void cleanup() {
       System.out.println("Test finished...");
   }
   
   @Test
   public void TestAdd1() {
       int sum = c.add(10, 20);
       Assert.assertEquals(30, sum);
   }
   
   @Test
   public void TestAdd2() {
       int sum = c.add(-10, 200);
       Assert.assertEquals(190, sum);
   }
   
   @Test
   public void TestAdd3() {
       int sum = c.add(130, -20);
       Assert.assertEquals(110, sum);
   }

}
