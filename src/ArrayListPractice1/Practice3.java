package ArrayListPractice1;

import java.util.ArrayList;

public class Practice3 {
   // Write a Java program to insert an element into the
	//array list at the first position.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		Colors.add(0,"voilate");
		System.out.println(Colors);
	}

}
