package chap03_1LineSerch;

import java.util.Scanner;

/**
 * break를 통한 탈출 -> 종료 조건 2번째를 없애줌
 * @author reg13
 *
 */
public class SeqSearchSen {

	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key; 
		// 보초 추가 마지막값이 key값과 같게 해 따로 마지막인지 확인하지 않고 자연스럽게 배열검색 
		// 마지막까지 검색해서 i 값이 마지막 값(키값)과 같으면 true 다르면 false 검색

		while (true) {
			if (a[i] == key)//if 한번만 사용
				
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = in.nextInt();
		int[] x = new int[num+1];
		
		for(int i =0; i<num; i++){
			System.out.print("x["+i+"] :");
			x[i] = in.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int key = in.nextInt();
		
		int idx = seqSearchSen(x,num,key);
		
		if(idx == -1)
			System.out.println("그 값은 요소가 없습니다.");
		else 
			System.out.println(key+"은 x["+idx+"]에 있습니다.");
		in.close();
	}
}
