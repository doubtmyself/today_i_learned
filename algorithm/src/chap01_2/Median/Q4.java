package chap01_2.Median;


import java.util.Scanner;
//중앙값 출력 확인
public class Q4 {
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("med3(3,2,1) 중앙값은"+ med3(3,2,1)+"입니다");
		System.out.println("med3(3,2,2) 중앙값은"+ med3(3,2,2)+"입니다");
		System.out.println("med3(3,1,2) 중앙값은"+ med3(3,1,2)+"입니다");
		System.out.println("med3(3,2,3) 중앙값은"+ med3(3,2,3)+"입니다");
		System.out.println("med3(2,1,3) 중앙값은"+ med3(2,1,3)+"입니다");
		System.out.println("med3(3,3,2) 중앙값은"+ med3(3,3,2)+"입니다");
		System.out.println("med3(3,3,3) 중앙값은"+ med3(3,3,3)+"입니다");
		System.out.println("med3(2,2,3) 중앙값은"+ med3(2,2,3)+"입니다");
		System.out.println("med3(2,3,1) 중앙값은"+ med3(2,3,1)+"입니다");
		System.out.println("med3(2,3,2) 중앙값은"+ med3(2,3,2)+"입니다");
		System.out.println("med3(1,3,2) 중앙값은"+ med3(1,3,2)+"입니다");
		System.out.println("med3(2,3,3) 중앙값은"+ med3(2,3,3)+"입니다");
		System.out.println("med3(1,2,3) 중앙값은"+ med3(1,2,3)+"입니다");
		in.close();
	}

}
