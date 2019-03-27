package chap04_01.stack;

import java.util.InputMismatchException;
import java.util.Scanner;

// ������ ��ü�� �����͸� ���� �� �ִ� ���׸� ���� Ŭ���� �ۼ�
public class Q2<E> {
	private int max; // ������ �뷮
	private int ptr; // ���� ������
	private E[] stk; // ���� ��ü

	// ������ �� ���ܣ������� ��� ����
	@SuppressWarnings("serial")
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// ������ �� ���ܣ������� ���� ��
	@SuppressWarnings("serial")
	// �ø��� ��ȣ�� ���� ������ default�� �ڵ� ����
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}

	// ������
	@SuppressWarnings("unchecked")
	public Q2(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; // ���� ��ü�� �迭�� ���� ��
		} catch (OutOfMemoryError e) { // ������ �� �����ϴ�.
			max = 0;
		}
	}

	// ���ÿ� x�� Ǫ��
	// ���� Ÿ�� E
	public E push(E x) throws OverflowGstackException {
		if (ptr >= max) // ������ ���� ��
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}

	// ���ÿ��� �����͸� �� (������� �����͸� ����)
	public E pop() throws EmptyGstackException {
		if (ptr <= 0) // ������ ��� ����
			throw new EmptyGstackException();
		return stk[--ptr];
	}

	// ���ÿ��� �����͸� ��ũ(������� �����͸� ���� ��)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0) // ������ ��� ����
			throw new EmptyGstackException();
		return stk[ptr - 1];
	}

	// ���ÿ��� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) // ������ʺ��� ���� �˻�
			if (stk[i].equals(x))
				return i; // �˻�����
		return -1; // �˻�����
	}

	// ������ ���
	public void clear() {
		ptr = 0;
	}

	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ���ÿ� �׿��ִ� ������ ���� ��ȯ
	public int size() {
		return ptr;
	}

	// ������ ��� �ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// ������ ���� á�°�?
	public boolean isFull() {
		return ptr >= max;
	}

	// ���� ���� �����͸� �ٴڡ������� ���ʷ� �����
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ������ϴ�.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

	// IntStack Ŭ������ ��� �޼ҵ� ��� ���α׷� �ۼ�
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����� ������ �� ����");

		int num = in.nextInt();
		Q2<Object> s = new Q2<Object>(num); // ���׸� <>�� ��� ���� ����

		while (true) {
			try {

				System.out.println("���� ������ ��: " + s.size() + " / " + s.capacity());
				System.out.println("(1)push (2)pop  (3)peek (4)dump (5)index" + "\n"
						+ "(6)clear (7)capacity (8)size (9)isEmpty (10)isFull \n(0)exit  : ");

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
						data = (int) s.pop();
						System.out.println("���� �����ʹ� " + data + "�Դϴ�.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println(e.getMessage());
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
				case 3:
					try {
						data = (int) s.peek();
						System.out.println("��ũ�� �����ʹ� " + data + "�Դϴ�.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("������ ��� �ֽ��ϴ�.");
					}
					break;
				case 4:
					s.dump();
					break;
				case 5:
					System.out.println("ã�� ���� �Է��ϼ���");
					int key = in.nextInt();
					System.out.println(
							(s.indexOf(key) < 0) ? "ã���ô� ���� �������� �ʽ��ϴ�." : key + "���� " + s.indexOf(key) + "������ �������ϴ�.");
					break;

				case 6:
					s.clear();
					System.out.println("Stack�� ���ϴ�.");
					break;
				case 7:
					System.out.println("Stack�� �뷮 :" + s.capacity());
					break;
				case 8:
					System.out.println("���� �׿��ִ� ������ :" + s.size());
					break;
				case 9:
					System.out.println(s.isEmpty() ? "Stack�� ����ֽ��ϴ�." : "Stack�� ����� �����Ͱ� �����մϴ�.");
					break;
				case 10:

					System.out.println(s.isFull() ? "���� á���ϴ�." : "���� ������ �����մϴ�.");
					break;
				}

			} catch (InputMismatchException e) {
				// Scanner�� �޸� ������ ���� �������� ������ ��� ������ �߻� �̹� int ���� �����ʴ� ����
				// ���⿡ ����κп��� ������ ��� ���� �ݺ��ϴ°ɷ� ����
				System.out.println("���� �߻� �ٽ� �Է��մϴ�.");
			}
		}

		in.close();
	}

}
