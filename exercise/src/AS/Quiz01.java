package AS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * <���� ���� ���α׷�>
 * 1.Nation
 * �ʵ�: ������(nation),����(capital),�α���(population)
 * �޼���: ������ ������
 *        toString() �������̵�(�������)
 * 
 * 2.Quiz01
 * �޴�>
 * 1.���� ���
 * 2.��� ���� ����
 * (3.���� �˻�- ������ �Է� �ް� �ش� ������ ��� ���� ���)
 * 0.����
 * 
 */
class Nation {
	String nation;
	String capital;
	String population;

	public Nation(String name, String capital, String population) {
		nation = name;
		this.capital = capital;
		this.population = population;
	}

	public String toString() {
		return nation;
		// fomat�� �տ� ���� ���Ĵ�� ����϶�� ����
	}

	public void prints() {
		System.out.println("������: " + nation);
		System.out.println("������: " + capital);
		System.out.println("�α���:" + population);
		System.out.println();
	}
	

}

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<Nation> list = new ArrayList<Nation>();

		Scanner in = new Scanner(System.in);
		String menu = "1.�������\n" + "2.��籹������\n" + "3.�����˻�\n" + "0.����";
		System.out.println(menu);
		int count = 0;
		Nation na[] = new Nation[10];
		while (true) {
			System.out.println("�׸��� �ϳ��� �����ϼ���!");
			int select = in.nextInt();

			switch (select) {
			case 1:
				System.out.println("����� ���� ���� ������: ");
				String select2 = in.next();
				System.out.println("������ ���� ������ ������: ");
				String select3 = in.next();
				System.out.println("������ ���� �α����� ������: ");
				String select4 = in.next();
				System.out.println("��������� �Ϸ�Ǿ����ϴ�.");
				System.out.println(menu);

				na[count] = new Nation(select2, select3, select4);
				list.add(na[count]);
				count++;
				System.out.println("����� ������ �����帳�ϴ�.");

				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {

					list.get(i).prints();
				}
				break;
			case 3:
				System.out.println("�����Է�");
				String a = in.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).nation.equals(a)) {
						System.out.println(list.get(i));
					}
				}
				int idx = Arrays.binarySearch(na, new Nation(a,"",""));
				System.out.println(idx);
			
			}

		}
	}
}