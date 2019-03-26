package chap03_3BinaryMethod;

import java.util.Arrays;
import java.util.Scanner;
// ���ڿ��� �迭(Java�� Ű����)���� �˻�

class StringBinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Java���� ����ϴ� Ű�����Դϴ�.
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

		System.out.println("���ϴ� Ű���� �Է� : ");
		String key = in.next();
		int idx = Arrays.binarySearch(x, key);
		System.out.println("x["+idx+"] ="+x[idx]);
		in.close();
	}
}
