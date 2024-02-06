package ArrayListPractice1;

import java.util.ArrayList;
import java.util.Collections;

public class Practice10 {
	
	// Write a Java program to shuffle elements in an array list.
	
	
	public static void main(String []args) {
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		Collections.shuffle(Colors);
		System.out.println(Colors);
}
}