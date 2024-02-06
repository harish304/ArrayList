package ArrayListPractice1;

import java.util.ArrayList;

public class Practice5 {

	public static void main(String[] args) {
// Write a Java program to update an array element by the given element.
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		Colors.set(3,"Pink");
		System.out.println(Colors);
	}

}
