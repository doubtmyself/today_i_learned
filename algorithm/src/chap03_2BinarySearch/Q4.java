package chap03_2BinarySearch;
import java.util.Scanner;


class Q4 {
	// 배열 a의 앞쪽 n개 요소에서 key와 같은 요소를 선형 검색 (보초법)
	static int binSearchEx(int[] array, int range, int key) {
		System.out.print("   |");
		for (int k = 0; k < range; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * range + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // 검색범위 맨 앞의 index
		int pr = range - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < range; k++)
				System.out.printf("%4d", array[k]);
			System.out.println("\n   |");
			if (array[pc] == key)
				return pc; // 검색성공
			else if (array[pc] < key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		return -1; // 검색실패
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("요솟수：");
		int range = in.nextInt();
		int[] array = new int[range]; // 요솟수 num인 배열

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]："); // 맨 앞 요소를 읽어 들임
		array[0] = in.nextInt();

		for (int i = 1; i < range; i++) {
			do {
				System.out.print("x[" + i + "]：");
				array[i] = in.nextInt();
			} while (array[i] < array[i - 1]); // 하나 앞의 요소보다 작으면 다시 입력
		}

		System.out.print("찾는 값："); // 키 값을 입력 받음
		int key = in.nextInt();

		int idx = binSearchEx(array, range, key); // 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은 x[" + idx + "]에 있습니다.");
		in.close();
	}
}
