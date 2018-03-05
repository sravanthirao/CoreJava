package com.day4.strings;

public class PerformanceCalculation {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String s ="Java";
		for (int i = 0; i < 10000; i++) {
		s= s+"course";
		}
		System.out.println("time taken by string:" + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for (int i = 0; i < 10000; i++) {
			sb.append("course");
		}
		System.out.println("time taken by string buffer:" + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("java");

		for (int i = 0; i < 10000; i++) {
			sb1.append("course");
		}
		System.out.println("time taken by string builder:" + (System.currentTimeMillis() - startTime) + "ms");

	}

}
