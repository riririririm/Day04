package com.rim.array1;

import java.util.Scanner;

public class ArrayTest_6 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		//1.학생등록
			//학생수 입력
			//학생번호 입력(학생수만큼 반복)
			//학생이름 입력
			//학생 국어, 수학, 영어점수 입력
		//2.전체정보 조회
			//번호, 이름, 국어, 수학, 영어 점수 출력
		//3.학생정보 검색
			//검색할 학생의 번호를 입력
			//검색한 학생의 정보 출력
		//4.프로그램 종료
		int select=0, search=0;
		int stuNum=0, totalStuNum=0;//학생수, 총학생수
		int [] numbers=null;
		String [] name =null;
		int [] kor = null;    int [] eng = null;    int [] math = null;
		
		while(select!=4) {
			System.out.println("1.학생등록 / 2.전체정보 조회 / 3.학생정보 검색 / 4.프로그램 종료");
			select = sc.nextInt();
			
			if(select==4) {
				System.out.println("프로그램이 종료되었습니다");
			}else if(select==1) {
				System.out.println("학생수:");
				stuNum = sc.nextInt();
				totalStuNum+=stuNum;
				name = new String[stuNum]; 
				numbers = new int[stuNum];
				kor = new int [stuNum];
				eng = new int [stuNum];
				math = new int [stuNum];
				
				for(int i=0;i<name.length;i++) {
					System.out.println("학생이름 입력:");
					name[i] = sc.next();
					System.out.println("학생번호 입력:");
					numbers[i] = sc.nextInt();
					System.out.println("국어점수 입력:");
					kor[i] = sc.nextInt();
					System.out.println("영어점수 입력:");
					eng[i] = sc.nextInt();
					System.out.println("수학점수 입력:");
					math[i] = sc.nextInt();
				}
			} else if(select==2) { 
				for(int i=0;i<totalStuNum;i++) {
					System.out.println("["+name[i]+"] "+numbers[i]+"  "+"국어:"+kor[i]
							+" 영어:"+eng[i]+" 수학:"+math[i]);
					}	
				System.out.println();
			}else if(select==3) {
				System.out.println("검색하실 학생의 번호를 입력하세요:");
				search = sc.nextInt();
				
				for(int i=0;i<totalStuNum;i++) {
					if(numbers[i]==search) {
						System.out.println("["+name[i]+"] "+numbers[i]+"  "+"국어:"+kor[i]
								+" 영어:"+eng[i]+" 수학:"+math[i]);
					}
				}
				System.out.println();
			}
		}//end of while
		
		System.out.println("end");
		

	}

}
