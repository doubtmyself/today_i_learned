package chap04_01.stack;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntStack s = new IntStack(4);

		while (true) {
			System.out.println("���� ������ ��: " + s.size() + " / " + s.capacity());
			System.out.println("(1)Ǫ�� (2)��  (3)��ũ" + "\n" + "(4)����  (0)����  : ");

			int menu = in.nextInt();
			if (menu == 0)
				break;

			int data;
			switch (menu) {
			case 1:
				System.out.println("������ : ");
				data = in.nextInt();
				try {
					s.push(data);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println(e.getMessage());
					System.out.println("������ ���� á���ϴ�.");
				}
				break;

			case 2:
				try {
					data = s.pop();
					System.out.println("���� �����ʹ� " + data + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println(e.getMessage());
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 3:
				try {
					data = s.peek();
					System.out.println("��ũ�� �����ʹ� " + data + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
		in.close();
	}

}
