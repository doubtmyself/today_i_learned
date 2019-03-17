package chap02_9ClassArray;

import java.util.Scanner;
// ��ü �˻� �����Ϳ� Ŭ���� �迭 �� ���Ű�� �÷��� ������ ���ϴ� �˰��� ����
public class PhysicalExamination {
	
	static final int VMAX = 21; // VMAX �÷� ����(0.0���� 0.1������ 21�� ����
/**
 * // PhyscDataŬ���� name, height, vision(�Ű�����)�� ��ü�� �����Ѵ�.
 * @author reg13
 *
 */
	static class PhyscData {
		String name;
		int height;
		double vision;

		// ������
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;

		}
	}
	
	/**
	 * Ű�� ����� ���ϴ� �޼ҵ�
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
	 * �÷� ������ ���ϴ� �޼ҵ� VMAX / 0.0 �̻� &&10.0 ���� => 2.1�� �ʰ��� �÷º����� �������� �÷º����� ����ϴ� �迭�� �߰����� �ʴ´�.
	 * @param dat
	 * @param dist
	 */

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;

		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) //
				dist[(int) (dat[i].vision * 10)]++; 
		//1~21 �� ���� �÷��� ���� �� ���� �������� dist[] 1�� �߰�
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		PhyscData[] x = {
			new PhyscData("������", 162, 0.3),
			new PhyscData("������", 173, 0.7),
			new PhyscData("������", 175, 2.0),
			new PhyscData("ȫ����", 171, 1.5),
			new PhyscData("�̼���", 168, 0.4),
			new PhyscData("�迵��", 174, 2.2), //-> �÷º����� ���Ե��� ���� 6���� �÷º��� ���
			new PhyscData("�ڿ��", 169, 0.8),
		};
		int [] vdist = new int[VMAX];
		
		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println("�̸�	Ű	�÷�");
		System.out.println("--------------");
		for (int i = 0; i < x.length; i++) 
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
			
		System.out.printf("\n ���Ű : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("/n�÷� ����");
		for (int i = 0; i < VMAX; i++) 
		System.out.printf("%3.1f~:%2d��\n", i/10.0,vdist[i]);
		in.close();
	}

}
