package pl.connectis.school.algorithms.notes;

import java.math.BigInteger;

import pl.connectis.school.algorithms.Rekurencje;

public class MainNotesHanoi {

	public static void main(String[] args) {
		int n_start = 2, n_stop = 10;
		long hanoiRek;
		long time;
		for(int i = n_start; i < n_stop; i++){
			time = System.currentTimeMillis();
			hanoiRek = Rekurencje.hanoi(i, 'A', 'B', 'X');
			time = System.currentTimeMillis() - time;
			System.out.println("Hanoi("+i+"):" + hanoiRek + " czas: " + time);
		}
		
	}

	}


