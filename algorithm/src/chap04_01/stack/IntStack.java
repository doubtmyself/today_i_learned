package chap04_01.stack;

public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;

	/**
	 * 스택이 빔
	 * 
	 * @author reg13
	 *
	 */
	@SuppressWarnings("serial")
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			 super("스택 빔");
		}
	}

	/**
	 * 스택 가득 참
	 * 
	 * @author reg13
	 *
	 */
	@SuppressWarnings("serial")
	public class OverflowIntStackException extends RuntimeException {

		public OverflowIntStackException() {
			super("스택꽉참");
		}
	}

	/**
	 * 생성자
	 * 
	 * @param capacity
	 */
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		}
		/**
		 * 원인 다양함 메모리 부족?
		 */
		catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	/**
	 * 푸시 메서드
	 * 
	 * @param x
	 * @return
	 * @throws OverflowIntStackException
	 */
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;

	}

	/**
	 * 팝 메서드
	 */
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	/**
	 * peek 메서드 스택 꼭대기 데이터를 '몰래 엿보는' 메서드 스택이 비어 있지 않으면 꼭대기 요소의 값을 반환한다. 스택 포인터는
	 * 변화 안함
	 * 
	 * @return
	 * @throws EmptyIntStackException
	 */
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스택에서 x를 찾아 인덱스를 반환 없으면 -1
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
		return -1;
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수 반환
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

	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}
}
