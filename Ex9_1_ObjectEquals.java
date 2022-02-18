package ch08_09;

public class Ex9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}

	public boolean equals(Object obj) {
		System.out.println("(주소)");
		return (this == obj);
	}

}
