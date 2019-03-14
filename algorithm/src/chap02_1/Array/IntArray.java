package chap02_1.Array;
/**
 * 배열의 구성요소의 갯수 -> 요솟수
 * + ctrl + alt + z for문에 사용 생활화 하자
 * @author reg13
 *
 */
public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
	}

}
