package com.kellyunit.junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitApplicationTests {

	
    @Test
    public void testAdd() {
        JunitApplication j = new JunitApplication();
        int rest = j.add(10, 20);
        Assert.assertEquals(30, rest); 
    }

	@Test
	public void testAdd2() {
		JunitApplication j = new JunitApplication();
		int res = j.add(100, 20);
		Assert.assertEquals(120, res);
	}

	@Test
	public void testAdd3() {
		JunitApplication j = new JunitApplication();
		int res = j.add(-100, -20);
		Assert.assertEquals(-120, res); 
	}

}
