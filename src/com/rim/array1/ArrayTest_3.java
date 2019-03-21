package com.rim.array1;

import java.util.Scanner;

public class ArrayTest_3 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int [] arr = {10,32,15,27,46,52};
		
		System.out.println("검색할 번호:");
		int num = sc.nextInt();
		
		if(num<0 || num>arr.length) {
			System.out.println("없는 번호입니다.");
		}else
			System.out.println(arr[num]);

	}

}
