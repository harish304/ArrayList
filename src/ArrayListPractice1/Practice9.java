package ArrayListPractice1;

import java.util.ArrayList;
import java.util.Collections;

public class Practice9 {

	public static void main(String[] args) {
//Write a Java program to copy one array list into another.
		
		ArrayList<String>Colors = new ArrayList<>();
		Colors.add("red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Green");
		Colors.add("White");
		
		System.out.println(Colors);
		ArrayList<String> NewColors = new ArrayList<>();
		Colors.add("Black");
		Colors.add("Pale");
		Colors.add("Yellow");
		System.out.println(NewColors);
		Collections.copy(Colors, NewColors);
		System.out.println(Colors);
		System.out.println(NewColors);

	}

}
