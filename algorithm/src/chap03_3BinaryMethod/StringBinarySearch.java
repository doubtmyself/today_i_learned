package chap03_3BinaryMethod;

import java.util.Arrays;
import java.util.Scanner;
// 문자열의 배열(Java의 키워드)에서 검색

class StringBinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Java에서 사용하는 키워드입니다.
		String[] x = {
			"abstract",   "assert",       "boolean",   "break",      "byte",
			"case",       "catch",        "char",      "class",      "const",
			"continue",   "default",      "do",        "double",     "else",
			"enum",       "extends",      "final",     "finally",    "float",
			"for",        "goto",         "if",        "implements", "import",
			"instanceof", "int",          "interface", "long",       "native",
			"new",        "package",      "private",   "protected",  "public",
			"return",     "short",        "static",    "strictfp",   "super",
			"switch",     "synchronized", "this",      "throw",      "throws",
			"transient",  "try",          "void",      "volatile",   "while"
		};

		System.out.println("원하는 키워드 입력 : ");
		String key = in.next();
		int idx = Arrays.binarySearch(x, key);
		System.out.println("x["+idx+"] ="+x[idx]);
		in.close();
	}
}
