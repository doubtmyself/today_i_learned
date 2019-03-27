package chap03_5Generic;

public class CenericClassTester {
	static class GenericClass<E>{
		private E xyz;
		GenericClass(E t){
			this.xyz = t;
		}
		/**
		 * �ڷ����� t�� xyz���� ����
		 * @return
		 */
		E getXyz(){
			return xyz;
		}
	}
	public static void main(String[] args){
		/**
		 * ���׸� Ŭ������ �ڷ����� �����Ӱ� ������ Ÿ���� ������ �ִ�.
		 */
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}

}
