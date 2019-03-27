package AS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * <국가 관리 프로그램>
 * 1.Nation
 * 필드: 국가명(nation),수도(capital),인구수(population)
 * 메서드: 생성자 여러개
 *        toString() 오버라이드(마음대로)
 * 
 * 2.Quiz01
 * 메뉴>
 * 1.국가 등록
 * 2.모든 국가 보기
 * (3.국가 검색- 국가명 입력 받고 해당 국가의 모든 정보 출력)
 * 0.종료
 * 
 */
class Nation {
	String nation;
	String capital;
	String population;

	public Nation(String name, String capital, String population) {
		nation = name;
		this.capital = capital;
		this.population = population;
	}

	public String toString() {
		return nation;
		// fomat이 앞에 붙은 형식대로 출력하라는 말임
	}

	public void prints() {
		System.out.println("국가명: " + nation);
		System.out.println("수도명: " + capital);
		System.out.println("인구수:" + population);
		System.out.println();
	}
	

}

public class Quiz01 {
	public static void main(String[] args) {
		ArrayList<Nation> list = new ArrayList<Nation>();

		Scanner in = new Scanner(System.in);
		String menu = "1.국가등록\n" + "2.모든국가보기\n" + "3.국가검색\n" + "0.종료";
		System.out.println(menu);
		int count = 0;
		Nation na[] = new Nation[10];
		while (true) {
			System.out.println("항목중 하나를 선택하세요!");
			int select = in.nextInt();

			switch (select) {
			case 1:
				System.out.println("등록할 국가 명을 쓰세요: ");
				String select2 = in.next();
				System.out.println("국가에 따른 수도를 쓰세요: ");
				String select3 = in.next();
				System.out.println("국가에 따른 인구수를 쓰세요: ");
				String select4 = in.next();
				System.out.println("국가등록이 완료되었습니다.");
				System.out.println(menu);

				na[count] = new Nation(select2, select3, select4);
				list.add(na[count]);
				count++;
				System.out.println("등록한 국가를 보여드립니다.");

				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {

					list.get(i).prints();
				}
				break;
			case 3:
				System.out.println("문자입력");
				String a = in.next();
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).nation.equals(a)) {
						System.out.println(list.get(i));
					}
				}
				int idx = Arrays.binarySearch(na, new Nation(a,"",""));
				System.out.println(idx);
			
			}

		}
	}
}