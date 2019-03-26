package chap03_4Compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * �������� ���� <> �������� ���� ><
 * ������ �Ǿ��־�� Ž�� ����
 * 
 * @author reg13
 *
 */
public class Q7 {
	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + "|" + height + "|" + vision;
		}

		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		public static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;

			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PhyscData[] x = { // Ű�� ������������ ���ĵǾ� �ֽ��ϴ�.
				new PhyscData("�̼���", 175, 2.0), new PhyscData("ȫ�ر�", 171, 1.5), new PhyscData("��ȣ��", 174, 1.2),
				new PhyscData("���Ѱ�", 169, 0.8), new PhyscData("������", 173, 0.7), new PhyscData("������", 168, 0.4),
				new PhyscData("�̳���", 162, 0.3), };
		System.out.println("�˻��� �÷��� �Է��Ͻÿ�");
		double key = in.nextDouble();
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, key), PhyscData.HEIGHT_ORDER);

		if (idx < 0)
			System.out.println("��Ұ� �����ϴ�");
		else {
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�");
			System.out.println("ã�� ������ : " + x[idx]);
		}
		in.close();

	}
}
