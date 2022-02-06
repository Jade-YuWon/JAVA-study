package ch07;

// Before Abstract Class 

class Marine {
	int x, y;

	void move(int x, int y) {

	}

	void stop() {

	}
}

class Tank {
	int x, y;

	void move(int x, int y) {

	}

	void stop() {

	}
}

class DropShip {
	int x, y;

	void move(int x, int y) {

	}

	void stop() {

	}
}

public class UnitTest {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Tank t1 = new Tank();
		DropShip d1 = new DropShip();

		m1.move(100, 200);
		t1.move(100, 200);
		d1.move(100, 200);

	}
}
