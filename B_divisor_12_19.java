// 입력한 값의 약수와 약수의 갯수를 출력하는 코딩

package com.one.day;

import java.util.Scanner;

public class B_divisor_12_19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("약분할 정수를 입력하시오 : ");
		long lnum = sc.nextLong(); // lnum 변수에 입력받은 값을 long 형태로 저장 

		int count=0;
		System.out.print("{");
		for(long i =1; i<lnum; i++) {        // 약수의 값을 구하기위해 변수 i값을 증가시키고 입력받은 값의 양까지 반복문을 실행
			if(lnum%i==0) {                   // 조건문을 통해서 입력한 값을 i로 나눴을 때 나머지가 0 이면 입력받은 값의 약수가 된다

				System.out.print(+i);         // 약수의 값을 출력
				System.out.print(", ");
				count++;                      // 약수의 갯수를 카운트
			} 
		}
		System.out.print(lnum);    
		System.out.println("}");
		System.out.println("약수의 갯수는 : " + (count+1)); 




	}
}
