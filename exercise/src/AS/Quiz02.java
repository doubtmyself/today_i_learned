package AS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * <단어장 만들기>
 * -키:영단어
 *  값: 뜻
 *  
 *  <메뉴>
 *  1.단어 등록
 *  2.모든 단어 보기
 *  3.단어 검색
 *  4.퀴즈
 *  ==> '뜻'을 문제로 내고, 영단어를 입력 받아 "정답!" 혹은 "땡!"
 *  예)'집'을 영어로? ==>입력: home 
 *  0.종료하기
 */
class TestBook {
	String english;
	String korea;

	TestBook(String e, String k) {
		english = e;
		korea = k;
	}

	public String toString() {
		return "영단어: \n" + english + "한국어: " + korea;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		TreeMap<String, Object> map = new TreeMap<String, Object>();
		ArrayList<TestBook> list = new ArrayList<TestBook>();
		String menu = "1.단어등록\n" + "2.모든 단어보기\n" + "3.단어 검색\n" + "4.퀴즈\n" + "0.종료하기";
		while (true) {
			System.out.println(menu);
			Scanner sc = new Scanner(System.in);
			System.out.println("항목 중 하나를 선택: ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("등록할 영단어를 입력하세요:");
				String select2 = sc.next() + "\n".trim();
				System.out.println("등록할 한국어를 입력하세요: ");
				String select3 = sc.next().trim();

				TestBook b = new TestBook(select2, select3);
				list.add(b);
				map.put(select2, select3);
				System.out.println(map);
				break;
			case 2:
				System.out.println("등록한 단어 보여드려요");
				System.out.println(list);
				break;

			case 3:
				System.out.println("등록한 단어중 하나를 검색하세요: ");
				String select4 = sc.next().trim();
				if (map.containsKey(select4)) {
					System.out.println(map.get(select4) + "의 뜻을 가진 단어입니다.");
				} else {
					System.out.println("미등록 단어입니다.");
				}
				break;

			case 4:
				System.out.println("문제가 출력됩니다. 뜻에 따른 영어를 입력하세요: ");
				Collection<Object> o = map.values();
				// map은 index가 없음으로 배열화를 해줘야 한다.
				// 여기서 배열화를 진행하고 있는것은 아니고 map에서 벨류값만 따로 빼는 작업
				// 이 과정에서 Collection을 사용한다.
				Collection<String> oo = map.keySet();
				// keyset은 key값을 뽑아준다.
				Object s = map.entrySet();
				// entryset은 벨류와 키값을 다 뽑아준다.
				int num = (int) (Math.random() * map.size());
				Object[] i = o.toArray();
				Object[] ii = oo.toArray();
				System.out.println(i[num] + "의 영어를 입력하세요: ");
				String select6 = sc.next().trim();
				if (ii[num].equals(select6)) {
					System.out.println("정답!!");
				} else {
					System.out.println("정답이 아닙니다.");
					System.out.println("정답은: " + ii[num] + "입니다");
				}

			}
		}
	}
}