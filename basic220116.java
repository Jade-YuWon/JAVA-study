package sec06;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("안녕 세상!");
		System.out.print("또 안녕!"); // sysout[Templete] ctrl+sapce: 자동완성 Preferences-Java-Editor-Templates
		System.out.print("또 안녕!"); // ctrl+alt+down: 줄단위 복사
		System.out.print("또 안녕!"); // ctrl+alt+down: 줄단위 복사
		System.out.print("또 안녕!"); // ctrl+alt+down: 줄단위 복사
		// alt+shift+a: 컬럼 편집 모드(토글)
		System.out.println("또 안녕!"); // println(): 출력 후 줄바꿈
		System.out.println(3 + 5 * 3 + 5); // println(): 출력 후 줄바꿈
		System.out.println(4 + 6);
		System.out.println(4 - 6);
		System.out.println(4 * 6);
		System.out.println(4 / 6);
		System.out.println(4 / 6.0);
		System.out.println('\n'); // 개행문자

		// 기본형 변수 (Primitive Type)
		char ch = 'A';
		byte a = -128, b = 127; // byte: -128~ 127
		short c = -32768, d = 32767; // byte: -32768~ 32767
		int e = -2147483648, f = 2147483647;
		long g = -9_223_372_036_854_775_808L, h = 9_223_372_036_854_775_807L;
		float num1 = 3.14f;
		double num2 = 161.0;
		boolean True = true, False = false;
		System.out.println(ch);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(True);
		System.out.println(False);
		// 참조형 변수(Reference type: 다음 시간에): C언어와 달리 값을 바꾸는 연산 불가능.

		// 지역 변수는 사용(읽기) 전 초기화 필수!
//		int uninit;
//		System.out.println(uninit);
//
//		-> The local variable uninit may not have been initialized

		// 상수, 리터럴
		// 상수(constant): final 키워드를 사용. (static도 따로 있음)
		final int const1 = 1004;
		System.out.println(const1);
//		const1 = 1; ERROR
		// 리터럴: 그 외 모든 상수.

		String str = "Hello"; // ?
		System.out.println(str);

	}

}
