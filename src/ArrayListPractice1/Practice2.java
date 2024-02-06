package ArrayListPractice1;

import java.util.ArrayList;

public class Practice2 {
	public static void main(String[]args) {
		//Write a Java program to iterate through all elements in an array list.
		
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		
		for(String Elements:Colors) {
			System.out.println(Elements);
		}
	}

}
