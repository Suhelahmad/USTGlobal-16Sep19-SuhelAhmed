package com.ustglobal.datastructure.algoanalysis;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {
		System.out.println("main program");
		long num=444444444L;
		System.out.println(AlgoAnalysis.addUpto(num));
		System.out.println("*********************");
		AlgoAnalysis.countingDuration();
	}
	public static long addUpto(Long number) {
		long total=0L;
		for(long i=0;i<number;i++) {
			total+=i;
		}
		return total;
	}
	public static long addUptoQuick(long number) {
		return number * (number+1)/2;
	}
	
	public static void countingDuration() {
		long number =444444444L;
		Instant start = Instant.now();
		System.out.println(AlgoAnalysis.addUptoQuick(number));
		Instant stop = Instant.now();
		long duration=Duration.between(start, stop).toMillis();
		double second=duration/1000.0;
		System.out.println("total");
		System.out.println("time "+second);
		
	}
}
