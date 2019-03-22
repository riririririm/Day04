package com.rim.array2;

import java.util.Scanner;

public class Array_2_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] point = new int[5];
		int max=0, min=0, maxIndex=0, minIndex=0;
		int sum=0; int same=0;
		
		for(int i=0;i<point.length;i++) {
			System.out.println(i+1+"번 점수입력");
			point[i]=sc.nextInt();
		}
		
		min=point[0]; max=point[0];
		for(int i=0;i<point.length;i++) {
			if(min>point[i]) {
				//최소가 point보다 크면 point를 최소값으로
				min=point[i];
				minIndex=i;
			}
			if(max<point[i]) {
				max=point[i];
				maxIndex=i;
			}
		}
		
		for(int i=0;i<point.length;i++) {
			sum+=point[i];
		}
		
		double avg = (sum - point[minIndex] - point[maxIndex]) /3;
		
		
		System.out.println("avg:"+avg);
		System.out.println("max:"+max);
		System.out.println("min:"+min);

	}

}
