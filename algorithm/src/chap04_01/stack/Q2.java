package chap04_01.stack;

import java.util.InputMismatchException;
import java.util.Scanner;

// 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 작성
public class Q2<E> {
	private int max; // 스택의 용량
	private int ptr; // 스택 포인터
	private E[] stk; // 스택 본체

	// 실행할 때 예외：스택이 비어 있음
	@SuppressWarnings("serial")
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {
		}
	}

	// 실행할 때 예외：스택이 가득 참
	@SuppressWarnings("serial")
	// 시리얼 번호가 없음 없으면 default로 자동 생성
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {
		}
	}

	// 생성자
	@SuppressWarnings("unchecked")
	public Q2(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; // 스택 본체용 배열을 생성 왜
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다.
			max = 0;
		}
	}

	// 스택에 x를 푸시
	// 리턴 타입 E
	public E push(E x) throws OverflowGstackException {
		if (ptr >= max) // 스택이 가득 참
			throw new OverflowGstackException();
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝 (꼭대기의 데이터를 꺼냄)
	public E pop() throws EmptyGstackException {
		if (ptr <= 0) // 스택이 비어 있음
			throw new EmptyGstackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크(꼭대기의 데이터를 살펴 봄)
	public E peek() throws EmptyGstackException {
		if (ptr <= 0) // 스택이 비어 있음
			throw new EmptyGstackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) // 꼭대기쪽부터 선형 검색
			if (stk[i].equals(x))
				return i; // 검색성공
		return -1; // 검색실패
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 데이터를 바닥→꼭대기의 차례로 출력함
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비었습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

	// IntStack 클래스의 모든 메소드 사용 프로그램 작성
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("저장될 데이터 양 선택");

		int num = in.nextInt();
		Q2<Object> s = new Q2<Object>(num); // 제네릭 <>로 명시 잊지 말것

		while (true) {
			try {

				System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
				System.out.println("(1)push (2)pop  (3)peek (4)dump (5)index" + "\n"
						+ "(6)clear (7)capacity (8)size (9)isEmpty (10)isFull \n(0)exit  : ");

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
						data = (int) s.pop();
						System.out.println("팝한 데이터는 " + data + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println(e.getMessage());
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 3:
					try {
						data = (int) s.peek();
						System.out.println("피크한 데이터는 " + data + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어 있습니다.");
					}
					break;
				case 4:
					s.dump();
					break;
				case 5:
					System.out.println("찾는 값을 입력하세요");
					int key = in.nextInt();
					System.out.println(
							(s.indexOf(key) < 0) ? "찾으시는 값이 존재하지 않습니다." : key + "값은 " + s.indexOf(key) + "번쨰로 저장됬습니다.");
					break;

				case 6:
					s.clear();
					System.out.println("Stack를 비웁니다.");
					break;
				case 7:
					System.out.println("Stack의 용량 :" + s.capacity());
					break;
				case 8:
					System.out.println("현재 쌓여있는 데이터 :" + s.size());
					break;
				case 9:
					System.out.println(s.isEmpty() ? "Stack은 비어있습니다." : "Stack에 저장된 데이터가 존재합니다.");
					break;
				case 10:

					System.out.println(s.isFull() ? "가득 찼습니다." : "남은 공간이 존재합니다.");
					break;
				}

			} catch (InputMismatchException e) {
				// Scanner의 메모리 공간을 새로 생성하지 않으면 계속 오류문 발생 이미 int 값에 맞지않는 값이
				// 들어갔기에 선언부분에서 오류가 계속 떠서 반복하는걸로 추측
				System.out.println("오류 발생 다시 입력합니다.");
			}
		}

		in.close();
	}

}
