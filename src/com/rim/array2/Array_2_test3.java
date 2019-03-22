package com.rim.array2;

import java.util.Arrays;

public class Array_2_test3 {

	public static void main(String[] args) {
		int[] point = {3,5,1,9,2};
		int temp=0, min=point[0];
		
		
		for(int i=0;i<point.length;i++) {
			for(int j=i+1;j<point.length;j++) {
				if(point[i]<point[j]) {
					temp= point[i];
					point[i]=point[j];
					point[j]=temp;
				}
			}		
		}
		
		
		//Arrays.parallelSort(point);
		//Arrays.sort(point);
		
		for(int i=0;i<point.length;i++) 
			System.out.println(point[i]);
		
	}

}
