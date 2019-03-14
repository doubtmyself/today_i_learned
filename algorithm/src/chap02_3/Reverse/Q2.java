package chap02_3.Reverse;

import java.util.Random;
import java.util.Scanner;

/**
 * �迭�� �������� ��Ÿ���� ���α׷� ������ ����ض� Q3
 * �迭�� �հ踦 ���϶� Q4
 * 
 * @author reg13
 *
 */
public class Q2 {
	public static int sumOf(int[] array){
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];		}
		System.out.println();
		return sum;
	}
	public static void reverse(int array[], int i1, int i2) {
		int temp;
		temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
		System.out.println("a["+i1+"]�� a["+i2+"]�� ��ȯ�մϴ�.");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("�迭�� ��ڼ��� �Է��ϼ���");
		int n = in.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(101) - 50;
		}
		System.out.println("�迭 ���");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
		System.out.println("���� ����");
		for (int i = 0; i < n/2.; i++) {
			reverse(array, i, n-i-1);
		}
		System.out.println("\n���� ����");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println("�迭�� �հ�"+ sumOf(array));
		in.close();
	}
}
