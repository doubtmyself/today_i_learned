package chap02_9ClassArray;

import java.util.Scanner;
// 신체 검사 데이터용 클래스 배열 에 평균키와 시력의 분포를 구하는 알고리즘 제작
public class PhysicalExamination {
	
	static final int VMAX = 21; // VMAX 시력 분포(0.0에서 0.1단위로 21개 존재
/**
 * // PhyscData클래스 name, height, vision(매개변수)로 객체를 구분한다.
 * @author reg13
 *
 */
	static class PhyscData {
		String name;
		int height;
		double vision;

		// 생성자
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;

		}
	}
	
	/**
	 * 키의 평균을 구하는 메소드
	 * @param dat
	 * @return
	 */
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;
	}
	/**
	 * 시력 분포를 구하는 메소드 VMAX / 0.0 이상 &&10.0 이하 => 2.1를 초과한 시력분포가 나왔을땐 시력분포를 출력하는 배열에 추가하지 않는다.
	 * @param dat
	 * @param dist
	 */

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;

		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) //
				dist[(int) (dat[i].vision * 10)]++; 
		//1~21 값 존재 시력이 범위 내 값이 나왔을때 dist[] 1씩 추가
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		PhyscData[] x = {
			new PhyscData("박현규", 162, 0.3),
			new PhyscData("함진아", 173, 0.7),
			new PhyscData("최윤미", 175, 2.0),
			new PhyscData("홍연의", 171, 1.5),
			new PhyscData("이수진", 168, 0.4),
			new PhyscData("김영준", 174, 2.2), //-> 시력분포에 포함되지 않음 6명의 시력분포 출력
			new PhyscData("박용규", 169, 0.8),
		};
		int [] vdist = new int[VMAX];
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름	키	시력");
		System.out.println("--------------");
		for (int i = 0; i < x.length; i++) 
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			
		System.out.printf("\n 평균키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("/n시력 분포");
		for (int i = 0; i < VMAX; i++) 
		System.out.printf("%3.1f~:%2d명\n", i/10.0,vdist[i]);
		in.close();
	}

}
