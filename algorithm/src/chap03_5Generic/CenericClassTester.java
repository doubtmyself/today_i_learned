package chap03_5Generic;

public class CenericClassTester {
	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){
			this.xyz = t;
		}
		/**
		 * �ڷ����� t�� xyz���� ����
		 * @return
		 */
		T getXyz(){
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
