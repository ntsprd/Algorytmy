package pl.connectis.school.algorithms;

import java.math.BigInteger;

public class Rekurencje {
	public static long silniaBenchmark(long n){
		int result = 1;
		while (n > 0) {
			result *= n;
			n--;
		}
		return result;
	}
	
	public static long silnia(long n){
		if (n == 0)
			return 1;
		else
			return n* silnia(n-1);
	}
	
	public static BigInteger silnia(BigInteger n){
		if (n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else
			return n.multiply(silnia(n.subtract(BigInteger.ONE)));
	}
	
	public static int nwd (int a, int b){
//    	if(a <= b) {
//    		return nwd(b,a);
//    	} else {
//    		if(b == 0){
//    			return a;
//    		} else{
//    		 return nwd(b, a%b);	
//    		}
    	return a <= b ? nwd(b,a) : (b == 0 ? a : nwd(b, a%b));
    	}
    //}
	
	public static long fibonacci(long n){
//		if(n < 2) 
//			return n;
//		else 
//			return fibonacci(n-1) + fibonacci(n-2);
		return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static long fibonacciSzybciej(long n){

		return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2);
	}
	public static long hanoi(long n, char wA, char wB, char wX){
		long wynik = hanoi(n-1, wA, wB, wX);
		if(n == 0){
			return 0;
		} else {
		
		wynik++;
		System.out.println(wA + "-->" + wB);
		return hanoi(n-1, wX, wA, wB) + wynik;
		
		}
		
    
	}
	
	// Zadania:
	// 1. 	Napisać funkcję obliczającą n-tą liczbę Fibonacciego o złożoności O(n). 
	//		Napisać odpowiednie testy.
	// 2.	Napisać funkcję obliczającą liczbę operacji '+' wykonaną przez funkcję obliczającą n-tą liczbę Fibonaciego, 
	//		zarówno dla wersji rekurencyjnej jak i liniowej.
	// 3.   Zadanie domowe:
	// 		Napisać funkcję pozwalającą policzyć n-tą liczbę Fibonacciego w czasie logarytmicznym.
	//		Patrz: https://pl.wikipedia.org/wiki/Ci%C4%85g_Fibonacciego
	// 4.   Zadanie domowe:
	//		Napisać funkcję obliczającą liczbę kroków potrzebną do rozwiązania problemu wież Hanoi o wysokości n.
	// 5.	Zadanie 1. i 3. zrealizować przy użyciu typu BigInteger
}
