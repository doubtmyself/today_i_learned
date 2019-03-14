package chap01_1.MinMax;

import java.util.Scanner;

public class Max3m {
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("max ดย:"+max3(in.nextInt(), in.nextInt(), in.nextInt()));
		in.close();
	}

}
