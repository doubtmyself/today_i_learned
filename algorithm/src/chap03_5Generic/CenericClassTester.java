package chap03_5Generic;

public class CenericClassTester {
	static class GenericClass<T>{
		private T xyz;
		GenericClass(T t){
			this.xyz = t;
		}
		/**
		 * 자료형이 t인 xyz변수 리턴
		 * @return
		 */
		T getXyz(){
			return xyz;
		}
	}
	public static void main(String[] args){
		/**
		 * 제네릭 클래스는 자료형에 자유롭게 데이터 타입을 받을수 있다.
		 */
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}

}
