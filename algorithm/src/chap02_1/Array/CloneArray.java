package chap02_1.Array;
// �迭 �̸�.clone(); �迭�� ���� -> �迭 �ּҰ��� �ٸ� �迭
// => c=a -> �迭 a�� c�� ���� ���� 
// => c=a.clone �迭 a�� ������ ���ο� �迭 a.clone �� c�� ���� ����
// �� �̷��� ������?
// ��ü���� �̿� ���� -> ������ ����(new�� ����Ǵ� ����)�� �����ϴ� �޼ҵ�
public class CloneArray {
	public static void main(String[] args) {
		// int[] a= new int[]{1,2,3,4,5};
		int[] a = { 1, 2, 3, 4, 5 };// ��� ����
		int[] b = a.clone();
		int[] c = a;
		System.out.print("a = ");
		for (int i = 0; i < a.length; i++) 
			System.out.print(" "+ a[i]);
		System.out.print("\nb = ");
		for(int i =0; i<b.length; i++){
			System.out.print(" "+b[i]);
		}
		System.out.print("\nc = ");
		for(int i =0; i<c.length; i++){
			System.out.print(" "+c[i]);
		}
		System.out.println(a+"\n"+b);
		System.out.println(a.clone()+"\n"+b.clone());

			
		
		
	}
}
