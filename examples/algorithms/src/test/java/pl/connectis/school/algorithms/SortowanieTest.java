package pl.connectis.school.algorithms;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class SortowanieTest {
	@Test
	public void BubbleSortTabTest(){
		Random rand = new Random();
		int n = 10;
		int tab[] = new int[n];
		for(int i = 0; i < tab.length; i++)	
			tab[i] = rand.nextInt(100);
		Sortowanie.sortowanieBabelkowe(tab);
		assertTrue("Sortowanie bąbelkowe tablicy", Sortowanie.czyTablicaPosortowana(tab));
	}
	@Test
	public void BubbleSortArrayTest(){
		
		List<Integer> lista = new ArrayList<>(Arrays.asList(1,6,8,4));
		List<Integer> lista1 = new ArrayList<>(Arrays.asList(1,4,6,8));
		Sortowanie.sortowanieBabelkoweArray(lista);
		assertEquals(lista1, lista);
	}
	
	@Test
	public void MergeSortTabTest(){
		
		int[] tab = { 4, 1, 10, 2, 3, 6, 12 };
		int[] tab1 = { 1, 2, 3, 4, 6, 10, 12 };
		tab = Sortowanie.mergeSortTab(tab);
		assertArrayEquals(tab1, tab);
	}
	
	@Test
	public void MergeSortArrayTest(){
		
		List<Integer> lista = new ArrayList<>(Arrays.asList(1,6,8,4));
		List<Integer> lista1 = new ArrayList<>(Arrays.asList(1,4,6,8));
		lista = Sortowanie.sortedArray(lista);
		assertEquals(lista1, lista);
	}
	
	@Test(timeout=1000)
	public void BubbleSortTimeTest(){
		Random rand = new Random();
		int n = 1000;
		int tab[] = new int[n];
		for(int i = 0; i < tab.length; i++)	
			tab[i] = rand.nextInt(1000);
		Sortowanie.sortowanieBabelkowe(tab);
	}

}
