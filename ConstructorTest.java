class Car {
  String color;
  String gearType;
  int door;
  
  Car() {}
  Car(String c, String g, int d) {
    color = c;
    gearType = g;
    door = d;
  }
}

public class ConstructorTest {
  public static void main(String[] args) {
    Car c1 = new Car("white", "auto", 2);
    Car c = new Car();
    c.color = "white";
    c.gearType = "auto";
    c.door = 2;
  }
}
