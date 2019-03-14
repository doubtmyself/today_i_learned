package chap02_1.Array;
// 배열 이름.clone(); 배열을 복제 -> 배열 주소값이 다른 배열
// => c=a -> 배열 a를 c에 집어 넣음 
// => c=a.clone 배열 a를 복제한 새로운 배열 a.clone 을 c에 집어 넣음
// 왜 이렇게 넣을까?
// 객체에도 이용 가능 -> 참조형 변수(new로 선언되는 변수)를 복사하는 메소드
public class CloneArray {
	public static void main(String[] args) {
		// int[] a= new int[]{1,2,3,4,5};
		int[] a = { 1, 2, 3, 4, 5 };// 축약 가능
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
