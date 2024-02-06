package ArrayListPractice1;

import java.util.ArrayList;

public class Practice7 {

	public static void main(String[] args) {
	//Write a Java program to search for an element in an array list.
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		if(Colors.contains("black")){
			System.out.println("Yes,The color is found in List");	
		}
		else {
			System.out.println("No,The color is found in List");
		}

	}

}
