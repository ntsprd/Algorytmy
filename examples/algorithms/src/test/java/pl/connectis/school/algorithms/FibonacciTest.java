package pl.connectis.school.algorithms;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void FibbonacciValueTest(){
		assertEquals("Fib", 8, Rekurencje.fibonacci(6));
	}
	
	@Test(timeout=1000)
	public void FibbonacciTimeTest(){
		Rekurencje.fibonacci(40);
	}
	
	

}
