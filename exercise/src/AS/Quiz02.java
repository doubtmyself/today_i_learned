package AS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * <�ܾ��� �����>
 * -Ű:���ܾ�
 *  ��: ��
 *  
 *  <�޴�>
 *  1.�ܾ� ���
 *  2.��� �ܾ� ����
 *  3.�ܾ� �˻�
 *  4.����
 *  ==> '��'�� ������ ����, ���ܾ �Է� �޾� "����!" Ȥ�� "��!"
 *  ��)'��'�� �����? ==>�Է�: home 
 *  0.�����ϱ�
 */
class TestBook {
	String english;
	String korea;

	TestBook(String e, String k) {
		english = e;
		korea = k;
	}

	public String toString() {
		return "���ܾ�: \n" + english + "�ѱ���: " + korea;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		ArrayList<TestBook> list = new ArrayList<TestBook>();
		String menu = "1.�ܾ���\n" + "2.��� �ܾ��\n" + "3.�ܾ� �˻�\n" + "4.����\n" + "0.�����ϱ�";
		while (true) {
			System.out.println(menu);
			Scanner sc = new Scanner(System.in);
			System.out.println("�׸� �� �ϳ��� ����: ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("����� ���ܾ �Է��ϼ���:");
				String select2 = sc.next() + "\n".trim();
				System.out.println("����� �ѱ�� �Է��ϼ���: ");
				String select3 = sc.next().trim();

				TestBook b = new TestBook(select2, select3);
				list.add(b);
				map.put(select2, select3);
				System.out.println(map);
				break;
			case 2:
				System.out.println("����� �ܾ� ���������");
				System.out.println(list);
				break;

			case 3:
				System.out.println("����� �ܾ��� �ϳ��� �˻��ϼ���: ");
				String select4 = sc.next().trim();
				if (map.containsKey(select4)) {
					System.out.println(map.get(select4) + "�� ���� ���� �ܾ��Դϴ�.");
				} else {
					System.out.println("�̵�� �ܾ��Դϴ�.");
				}
				break;

			case 4:
				System.out.println("������ ��µ˴ϴ�. �濡 ���� ��� �Է��ϼ���: ");
				Collection<Object> o = map.values();
				// map�� index�� �������� �迭ȭ�� ����� �Ѵ�.
				// ���⼭ �迭ȭ�� �����ϰ� �ִ°��� �ƴϰ� map���� �������� ���� ���� �۾�
				// �� �������� Collection�� ����Ѵ�.
				Collection<String> oo = map.keySet();
				// keyset�� key���� �̾��ش�.
				Object s = map.entrySet();
				// entryset�� ������ Ű���� �� �̾��ش�.
				int num = (int) (Math.random() * map.size());
				Object[] i = o.toArray();
				Object[] ii = oo.toArray();
				System.out.println(i[num] + "�� ��� �Է��ϼ���: ");
				String select6 = sc.next().trim();
				if (ii[num].equals(select6)) {
					System.out.println("����!!");
				} else {
					System.out.println("������ �ƴմϴ�.");
					System.out.println("������: " + ii[num] + "�Դϴ�");
				}

			}
		}
	}
}