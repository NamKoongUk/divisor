// �Է��� ���� ����� ����� ������ ����ϴ� �ڵ�

package com.one.day;

import java.util.Scanner;

public class B_divisor_12_19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������ �Է��Ͻÿ� : ");
		long lnum = sc.nextLong(); // lnum ������ �Է¹��� ���� long ���·� ���� 

		int count=0;
		System.out.print("{");
		for(long i =1; i<lnum; i++) {        // ����� ���� ���ϱ����� ���� i���� ������Ű�� �Է¹��� ���� ����� �ݺ����� ����
			if(lnum%i==0) {                   // ���ǹ��� ���ؼ� �Է��� ���� i�� ������ �� �������� 0 �̸� �Է¹��� ���� ����� �ȴ�

				System.out.print(+i);         // ����� ���� ���
				System.out.print(", ");
				count++;                      // ����� ������ ī��Ʈ
			} 
		}
		System.out.print(lnum);    
		System.out.println("}");
		System.out.println("����� ������ : " + (count+1)); 




	}
}
