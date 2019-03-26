package chap04_01.stack;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntStack s = new IntStack(4);

		while (true) {
			System.out.println("���� ������ ��: " + s.size() + " / " + s.capacity());
			System.out.println("(1)push (2)pop  (3)peek (4)dump (5)index" + "\n" + "(6)clear (7)capacity (8)size (9)isEmpty (10)isFull \n(0)exit  : ");

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
			case 5:
				int key = in.nextInt();
				System.out.println((s.indexOf(key)<0) ? "ã���ô� ���� �������� �ʽ��ϴ�." : key + "���� " + s.indexOf(key) + "������ �������ϴ�.");
				break;

			case 6:
				s.clear();
				System.out.println("Stack�� ���ϴ�.");
				break;
			case 7:
				System.out.println("Stack�� �뷮 :"+ s.capacity());
				break;
			case 8:
				System.out.println("���� �׿��ִ� ������ :"+s.size());
				break;
			case 9:
				System.out.println(s.isEmpty() ? "Stack�� ����ֽ��ϴ�." : "Stack�� ����� �����Ͱ� �����մϴ�.");
				break;
			case 10:
				
				System.out.println(s.isFull() ? "���� á���ϴ�.":"���� ������ �����մϴ�.");
				break;
			}

		}
		in.close();
	}

}
