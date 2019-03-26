package chap04_01.stack;

public class IntStack {
	private int max;
	private int ptr;
	private int[] stk;

	/**
	 * ������ ��
	 * 
	 * @author reg13
	 *
	 */
	@SuppressWarnings("serial")
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			 super("���� ��");
		}
	}

	/**
	 * ���� ���� ��
	 * 
	 * @author reg13
	 *
	 */
	@SuppressWarnings("serial")
	public class OverflowIntStackException extends RuntimeException {

		public OverflowIntStackException() {
			super("���ò���");
		}
	}

	/**
	 * ������
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
		 * ���� �پ��� �޸� ����?
		 */
		catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	/**
	 * Ǫ�� �޼���
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
	 * �� �޼���
	 */
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	/**
	 * peek �޼��� ���� ����� �����͸� '���� ������' �޼��� ������ ��� ���� ������ ����� ����� ���� ��ȯ�Ѵ�. ���� �����ʹ�
	 * ��ȭ ����
	 * 
	 * @return
	 * @throws EmptyIntStackException
	 */
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// ���ÿ��� x�� ã�� �ε����� ��ȯ ������ -1
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
		return -1;
	}

	// ������ ���
	public void clear() {
		ptr = 0;
	}

	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ���ÿ� �׿� �ִ� ������ �� ��ȯ
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

	// ���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}
}
