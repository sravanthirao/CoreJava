package com.day3.arrays;

import java.util.Arrays;

public class MultidimensionalArrayExample {

	public static void main(String[] args) {
		// int arr[][] = new int[2][2];
		// arr[0][0] = 1;
		// arr[0][1] = 2;
		// arr[1][0] = 3;
		// arr[1][1] = 4;
		// or
		int arr[][] = { { 1, 2 }, { 3, 4 } };
		System.out.println(Arrays.deepToString(arr));
		// or
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// or

		for (int[] a : arr) {
			for (int v : a) {
				System.out.print(v + " ");
			}
			System.out.println();
		}

	}
}
