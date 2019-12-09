package com.ustglobal.datastructure;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import com.ustglobal.datastructure.algoanalysis.AlgoAnalysis;

public class SortingDatastructure {
	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("enter "+size+" elements");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("bubble sort");
		Instant startbubble = Instant.now();
		BubbleSort.bubble(array);
		Instant stopbubble = Instant.now();
		long dure=Duration.between(startbubble, stopbubble).toMillis();
		double seconds=dure/1000.0;
		System.out.println("total");
		System.out.println("time taken to "+seconds);
		System.out.println();
		
		System.out.println("insertion sort");
		Instant start = Instant.now();
		InsertionSort.insertionSort(array);
		Instant stop = Instant.now();
		long duration=Duration.between(start, stop).toMillis();
		double second=duration/1000.0;
		System.out.println("total");
		System.out.println("time taken to "+second);
		System.out.println();
		System.out.println("QuickSOrt");
		Instant startquick = Instant.now();
		int[] newarr=QuickSort.quicksort(array, 0, size-1);
		for(int i=0;i<newarr.length;i++) {
			System.out.print(newarr[i]+" ");
		}
		Instant stopquick = Instant.now();
		long durations=Duration.between(start, stop).toMillis();
		double secon=durations/1000.0;
		System.out.println("total");
		System.out.println("time taken to "+secon);
	}
}
