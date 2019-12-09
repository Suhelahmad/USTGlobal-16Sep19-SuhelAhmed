package com.ustglobal.datastructure;

public class InsertionSort {
	public static void insertionSort(int[] array) {

		int j;
		int key;
		for (int i = 1; i < array.length; i++) {
			key=array[i];
			j=i-1;
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
