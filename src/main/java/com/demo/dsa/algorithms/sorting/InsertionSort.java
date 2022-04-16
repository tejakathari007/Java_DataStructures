package com.demo.dsa.algorithms.sorting;

public class InsertionSort {

	void insertionSort(int[] integers) {

		for (int i = 1; i < integers.length; i++) {
			int temp = integers[i], j = i;
			while (j > 0 && integers[j - 1] > temp) {
				integers[j] = integers[j - 1];
				j--;
			}
			integers[j] = temp;
		}
	}

	void display(int[] integers) {
		for (int i : integers) {
			System.out.println(i);
		}
	}
}
