package pl.connectis.school.algorithms;

import org.junit.Test;

import pl.connectis.school.algorithms.Rekurencje;

import static org.junit.Assert.*;

import java.math.BigInteger;

public class SilniaTest {
	@Test
	public void SilniaValueTest(){
		assertEquals("Silnia", 6, Rekurencje.silnia(3));
	}
	
	@Test
	public void SilniaArrayOfValuesTest(){
		int n = 10;
		long refValues[] = new long[n];
		long testValues[] = new long[n];
		
		for(int i = 0; i < refValues.length; i++){
			refValues[i] = Rekurencje.silniaBenchmark(i);
			testValues[i] = Rekurencje.silnia(i);
		}
		assertArrayEquals(refValues, testValues);
	}

	@Test
	public void SilniaBigIntegerTest(){
		assertEquals(BigInteger.valueOf(Rekurencje.silniaBenchmark(6)), Rekurencje.silnia(BigInteger.valueOf(6)));
	}

}
