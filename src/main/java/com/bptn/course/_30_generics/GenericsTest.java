package com.bptn.course._30_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest<T extends Number> {

	private List<T> list = new ArrayList<>();

	public void add(T num) {
		list.add(num);
	}

	public T get(int index) {
		return list.get(index);
	}

	public double sum() {
		double sum = 0;
		for (T number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		GenericsTest<Integer> intList = new GenericsTest<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		System.out.println("Integer List:");
		for (int i = 0; i < intList.list.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("Integer List Sum = " + intList.sum());

		GenericsTest<Double> doubleList = new GenericsTest<>();
		doubleList.add(1.1);
		doubleList.add(2.2);
		doubleList.add(3.3);

		System.out.println("\nDouble List:");
		for (int i = 0; i < doubleList.list.size(); i++) {
			System.out.println(doubleList.get(i));
		}
		System.out.println("Double List Sum = " + doubleList.sum());

	}
}
