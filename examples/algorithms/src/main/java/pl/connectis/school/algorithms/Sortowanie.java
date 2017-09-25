package pl.connectis.school.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Sortowanie {
	
	
	
	
	static boolean czyTablicaPosortowana(int[] t){
		boolean result = true;
		if(t != null && t.length > 1) 
			for(int i = 0; i < t.length-1; i++)
				if(t[i] > t[i+1]) result = false;
		return result;
	}
	
	

	//
	// sortowanie tablic
	//
	static void swap(int[] tab, int i, int j) {
        int pom = tab[i];
        tab[i] = tab[j];
        tab[j] = pom;
    }
    
    // Sortowanie bąbelkowe
    static void sortowanieBabelkowe(int[] tab) {
        for(int i = 1; i < tab.length; i++)
            for(int j = tab.length - 1; j > 0; j--)
                if(tab[j - 1] > tab[j])
                    swap(tab, j - 1, j);
    }
    
    static void sortowanieBabelkoweArray(List<Integer> list) {
    	 
    	    for(Integer out = list.size()-1; out>1; out--) {
    	        for(Integer i = 0; i < out;i ++){
    	            int n = i+1;
    	            if(list.get(i) > list.get(n)) {
    	                Integer temp = list.get(i);
    	                list.set(i, list.get(n));
    	                list.set(n, temp);
    	            }
    	        }
    	    }

    	    
    }

    // Sortowanie przez wstawianie
    //
    static void sortowanieWstawianie(int[] tab) {
        int x, j;
        for(int i = 1; i < tab.length - 1; i++) {
            //tab[0..i-1] jest już posortowana
            x = tab[i]; //odkładamy element z pozycji i
            j = i;
            while(j > 0 && x < tab[j - 1]) {
                tab[j] = tab[j - 1]; //przesuwamy element większy od x o jedną pozycję w prawo    
                j = j - 1;
            }
            tab[j] = x;
        }
    }
    
    private static int[] mergeTab(int[] ls, int[] ls2) {
        int[] c = new int[ls.length + ls2.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= ls.length) c[k] = ls2[j++];
            else if (j >= ls2.length) c[k] = ls[i++];
            else if (ls[i] <= ls2[j])  c[k] = ls[i++];
            else                    c[k] = ls2[j++];
        }
        return c;
    }

    public static int[] mergeSortTab(int[] a2) {
        int N = a2.length;
        if (N <= 1) return a2;
        int[] a = new int[N/2];
        int[] b = new int[N - N/2];
        for (int i = 0; i < a.length; i++)
            a[i] = a2[i];
        for (int i = 0; i < b.length; i++)
            b[i] = a2[i + N/2];
        return mergeTab(mergeSortTab(a), mergeSortTab(b));
    }
    public static List<Integer> sortedArray(List<Integer> list) {
        if (list.size() < 2) {
          return list;
        }
        int mid = list.size()/2;
        return mergedArray(
            sortedArray(list.subList(0, mid)), 
            sortedArray(list.subList(mid, list.size())));
      }

      private static List<Integer> mergedArray(List<Integer> left, List<Integer> right) {
        int leftIndex = 0;
        int rightIndex = 0;
        List<Integer> merged = new ArrayList<Integer>();

        while (leftIndex < left.size() && rightIndex < right.size()) {
          if (left.get(leftIndex) < right.get(rightIndex)) {
            merged.add(left.get(leftIndex++));
          } else {
            merged.add(right.get(rightIndex++));
          }
        }
        merged.addAll(left.subList(leftIndex, left.size()));
        merged.addAll(right.subList(rightIndex, right.size()));
        return merged;
      }

    
    



    
}
    
    // Zadanie:
    //	1.	Wzorując się na przedstawionych powyżej algorytmach, napisać sortowanie listy elementów typu 
    //		ArrayList<String>. Napisać testy dla zaimplementowanych funkcji.

