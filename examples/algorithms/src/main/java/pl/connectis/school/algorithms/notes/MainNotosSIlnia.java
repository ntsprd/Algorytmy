package pl.connectis.school.algorithms.notes;

import java.math.BigInteger;

import pl.connectis.school.algorithms.Rekurencje;

public class MainNotosSIlnia {

	public static void main(String[] args) {
		int n_start = 50, n_stop = 100;
		BigInteger silRek;
		long time;
		for(int i = n_start; i < n_stop; i++){
			time = System.currentTimeMillis();
			silRek = Rekurencje.silnia(BigInteger.valueOf(i));
			time = System.currentTimeMillis() - time;
			System.out.println("SilRek("+i+"):" + silRek + " czas: " + time);
		}
		
	}

	}


