package chap02_8.ForSum;

public class ArraySumForIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]={1.0,2.0,3.0,4.0,5.0};
		double sum =0;
		
		for (int i = 0; i < a.length; i++) 
			System.out.println("a["+i+"]"+a[i]);
		for(double i :a) //:~안에있는것은 i 이고 둘러싸는 것은 a이다.  in이라고도 읽는다.
			sum += i;//  i를 둘러싸는 것은 a라고 정의 -> a[i]가 된다.
		
		System.out.println("모든 요소의 합은"+sum +"입니다.");
		

	}

}
