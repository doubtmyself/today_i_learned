package chap02_7.Int2DArray;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, }; // ����

	static int isLeap(int year){
		return (year %4 ==0 && year %100 !=0 ||year % 400 ==0)? 1:0; //�⵵�� ���ǿ� ���� 2������ ������·� �ٲ� !!
	}
	static int dayOfYear(int y, int m, int d){
		int days = d;//d���� �����ؾ� d+mday�� ���� �ȴ�.
		
		for(int i =1; i<m ; i++)
			days += mdays[isLeap(y)][i -1];//��
		return days;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do{
			System.out.println("�� : "); int year = in.nextInt();
			System.out.println("�� : "); int month = in.nextInt();
			System.out.println("�� : "); int day = in.nextInt();
			
			System.out.printf("�� �� %d �Ϥ� �Դϴ�.", dayOfYear(year, month, day));
			System.out.println("�ѹ��� �����ұ��(1:��)");
			retry = in.nextInt();
		}while(retry ==1);
		in.close();
	}
	

}
