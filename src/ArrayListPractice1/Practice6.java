package ArrayListPractice1;

import java.util.ArrayList;

public class Practice6 {

	public static void main(String[] args) {
//Write a Java program to remove the third element from an array list.
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		Colors.remove(3);
		System.out.println(Colors);

	}

}
