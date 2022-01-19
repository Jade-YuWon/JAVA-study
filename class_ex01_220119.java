package sec06;

public class class_ex01_220119 { // 소스파일 이름과 public 클래스 이름은 일치해야 함
	public static void main(String[] args) {
		Labtop l1 = new Labtop();
		Labtop l2 = new Labtop();

		l1.price = 100;
		l2.price = 200;

		System.out.println("l1의 price값은 " + l1.price + " 입니다.");
		System.out.println("l2의 price값은 " + l2.price + " 입니다.");

		l1.time();
		l2.time();

		System.out.println("l1의 price값은 " + l1.price + " 입니다.");
		System.out.println("l2의 price값은 " + l2.price + " 입니다.");

		l2 = l1;

		System.out.println("l1의 price값은 " + l1.price + " 입니다.");
		System.out.println("l2의 price값은 " + l2.price + " 입니다.");

	}
} // 한 소스파일 당 하나의 클래스만 작성하는 것이 바람직

class Hello4 {
} 
// 여러 개의 클래스 생성 가능
// public 클래스는 하나만 있어야 함

class Labtop {
	String model;
	boolean power;
	int year;
	int price;
	int volume;

	void power() {
		power = !power;
	}

	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}

	void time() {
		year++;
		price -= 10;
	}
} 

