package chap02_7.Int2DArray;

import java.util.Scanner;
/**
 * 
 * @author reg13
 *
 */
public class Q9 {
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, }; // 윤년

	static int isLeap(int year){
		return (year %4 ==0 && year %100 !=0 ||year % 400 ==0)? 1:0; 
		//년도를 조건에 맞춰 2가지의 출력형태로 바꿈 !! 0:평년 1:윤년
	}
	static int leftDayOfYear(int y, int m, int d){
		int day =  mdays[isLeap(y)][m-1] -d;
		for (int i = m; i < 12; i++) {
			day += mdays[isLeap(y)][i-1];
		}
		return day;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do{
			System.out.println("년 : "); int year = in.nextInt();
			System.out.println("월 : "); int month = in.nextInt();
			System.out.println("일 : "); int day = in.nextInt();
			
			System.out.printf("그 해 %d 일째 입니다.", leftDayOfYear(year, month, day));
			System.out.println("한번더 실행할까요(1:예)");
			retry = in.nextInt();
		}while(retry ==1);
		in.close();
	}
	

}
