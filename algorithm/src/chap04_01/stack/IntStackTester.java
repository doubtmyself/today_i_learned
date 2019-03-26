package chap04_01.stack;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntStack s = new IntStack(4);

		while (true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			System.out.println("(1)푸시 (2)팝  (3)피크" + "\n" + "(4)덤프  (0)종료  : ");

			int menu = in.nextInt();
			if (menu == 0)
				break;

			int data;
			switch (menu) {
			case 1:
				System.out.println("데이터 : ");
				data = in.nextInt();
				try {
					s.push(data);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println(e.getMessage());
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2:
				try {
					data = s.pop();
					System.out.println("팝한 데이터는 " + data + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println(e.getMessage());
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					data = s.peek();
					System.out.println("피크한 데이터는 " + data + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
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
