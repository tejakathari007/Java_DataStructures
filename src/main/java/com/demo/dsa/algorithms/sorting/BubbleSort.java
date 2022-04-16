package com.demo.dsa.algorithms.sorting;

public class BubbleSort {

	void bubbleSort(int[] integers) {
		int n = integers.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (integers[j] > integers[j + 1]) {
					int temp = integers[j];
					integers[j] = integers[j + 1];
					integers[j + 1] = temp;
				}
			}
		}
	}

	void display(int[] integers) {
		for (int i : integers) {
			System.out.println(i);
		}
	}
}
