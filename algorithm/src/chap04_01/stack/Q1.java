package chap04_01.stack;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		IntStack s = new IntStack(4);

		while (true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			System.out.println("(1)push (2)pop  (3)peek (4)dump (5)index" + "\n" + "(6)clear (7)capacity (8)size (9)isEmpty (10)isFull \n(0)exit  : ");

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
			case 5:
				int key = in.nextInt();
				System.out.println((s.indexOf(key)<0) ? "찾으시는 값이 존재하지 않습니다." : key + "값은 " + s.indexOf(key) + "번쨰로 저장됬습니다.");
				break;

			case 6:
				s.clear();
				System.out.println("Stack를 비웁니다.");
				break;
			case 7:
				System.out.println("Stack의 용량 :"+ s.capacity());
				break;
			case 8:
				System.out.println("현재 쌓여있는 데이터 :"+s.size());
				break;
			case 9:
				System.out.println(s.isEmpty() ? "Stack은 비어있습니다." : "Stack에 저장된 데이터가 존재합니다.");
				break;
			case 10:
				
				System.out.println(s.isFull() ? "가득 찼습니다.":"남은 공간이 존재합니다.");
				break;
			}

		}
		in.close();
	}

}
