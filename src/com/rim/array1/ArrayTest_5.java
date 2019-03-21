package com.rim.array1;

import java.util.Scanner;

public class ArrayTest_5 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		String [] name = new String [count];
		int [] kor = new int [count];
		int [] math = new int [count];
		int kTotal=0, mTotal=0;
		
		for(int i=0;i<count;i++) {
			System.out.println(i+1+"번째 학생의 이름을 입력하세요:");
			name[i] = sc.next();			
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(name[i]+" 학생의 국어점수 입력:");
			kor[i] = sc.nextInt();		
			kTotal+=kor[i];
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(name[i]+" 학생의 수학점수 입력:");
			math[i] = sc.nextInt();		
			mTotal+=math[i];
		}
		
		
		/*
		 * for(int i=0;i<name.length;i++) { System.out.println(name[i]+" : "+kor[i]); }
		 */
		System.out.println("국어평균:"+kTotal/name.length);
		System.out.println("수학평균:"+mTotal/name.length);

	}

}
