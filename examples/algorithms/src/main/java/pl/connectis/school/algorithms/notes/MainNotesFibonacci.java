package pl.connectis.school.algorithms.notes;

import pl.connectis.school.algorithms.Rekurencje;

public class MainNotesFibonacci {

	public static void main(String[] args) {
		int n_start = 2, n_stop = 6;
		long fibRek = 0;
		long time;
		for(int i = n_start; i < n_stop; i++){
			time = System.currentTimeMillis();
			fibRek = Rekurencje.fibonacci(i);
			time = System.currentTimeMillis() - time;
			System.out.println("FibRek("+i+"):" + fibRek + " czas: " + time);
		}
		
	}
}
