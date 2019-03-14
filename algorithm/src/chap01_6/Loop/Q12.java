package chap01_6.Loop;

import java.util.Scanner;
//°ö¼ÀÇ¥
public class Q12 {
	public static void main(String[] args) {
		System.out.println("-------------°ö¼ÀÇ¥-------------");
		Scanner in = new Scanner(System.in);

		for (int i = 0; i <= 9; i++) {
			System.out.print(i+"|");
			for (int j = 1; j <= 9; j++) {
				if (i == 0) {
					System.out.printf("%3d", j);	
				} else{
					
					System.out.printf("%3d", i * j);
				}
			}
			System.out.println();
			if(i==0){
				System.out.println("---+-----------------------------");
			}

		}
		in.close();
	}

}
