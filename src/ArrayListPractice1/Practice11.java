package ArrayListPractice1;

import java.util.ArrayList;
import java.util.Collections;

public class Practice11 {
	
	//Write a Java program to reverse elements in an array list.
	
	public static void main(String []args) {
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		Collections.reverse(Colors);
		System.out.println(Colors);

}
}
