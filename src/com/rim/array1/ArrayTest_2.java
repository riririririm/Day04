package com.rim.array1;

import java.util.Scanner;

public class ArrayTest_2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int [] ar2= {10,20,30};
		System.out.println("검색할 번호를 입력하세요");
		int count = sc.nextInt();
		System.out.println("ar2["+count+"] : "+ar2[count]);

		sc.close();
	}

}
