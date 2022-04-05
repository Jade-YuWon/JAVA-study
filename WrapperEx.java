public class WrapperEx{

     public static void main(String []args){
        
        String myname = new String("Slim Shady");
		System.out.println("My name is: " + myname.toLowerCase());
		System.out.println("My name is: " + myname);
		System.out.println("My name is: " + myname.toUpperCase());
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace('\n'));
		
		int primitiveInt = 13;
		Integer intObj1 = new Integer(primitiveInt);
		Integer intObj2 = new Integer(42); // Boxing
		int wrapperToPrim = intObj2.intValue(); // Unboxing
		Integer autoNum = 67; // Autoboxing (Automatic boxing)
		System.out.println(primitiveInt);
		System.out.println(intObj1);
		System.out.println(intObj2);
		System.out.println(wrapperToPrim);
		
     }
}
