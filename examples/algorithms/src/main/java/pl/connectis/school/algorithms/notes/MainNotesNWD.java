package pl.connectis.school.algorithms.notes;

import java.math.BigInteger;

import pl.connectis.school.algorithms.Rekurencje;

public class MainNotesNWD {

	public static void main(String[] args) {
		int a = 36, b = 12;
		long wynik;
		long time;
		
			time = System.currentTimeMillis();
			wynik = Rekurencje.nwd(a, b);
			time = System.currentTimeMillis() - time;
			System.out.println("Hanoi("+a+","+b+"):" + wynik + " czas: " + time);
		
	
	}

	}


