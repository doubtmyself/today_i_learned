package chap02_8.ForSum;

public class ArraySumForIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]={1.0,2.0,3.0,4.0,5.0};
		double sum =0;
		
		for (int i = 0; i < a.length; i++) 
			System.out.println("a["+i+"]"+a[i]);
		for(double i :a) //:~�ȿ��ִ°��� i �̰� �ѷ��δ� ���� a�̴�.  in�̶�� �д´�.
			sum += i;//  i�� �ѷ��δ� ���� a��� ���� -> a[i]�� �ȴ�.
		
		System.out.println("��� ����� ����"+sum +"�Դϴ�.");
		

	}

}
