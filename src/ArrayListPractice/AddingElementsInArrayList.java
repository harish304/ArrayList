package ArrayListPractice;

import java.util.ArrayList;

public class AddingElementsInArrayList {
 public static void main(String[]args) {
	 
	 
	 //Syntax
	 //ArrayList<Data-Type> ListNAme = new ArrayList<>();
	 ArrayList<String> animals = new ArrayList<>();
	 
	 //To add elements into array list
	 //ListName.add("name of the element to add");
	 
	 animals.add("Lion");
	 animals.add("Elephant");
	 animals.add("Rat");
	 System.out.println(animals);
	 
	 
	 //Adding element by using index 
	 
	 animals.add(2,"Tiger");
	 System.out.println(animals);
	 
	 
 }
}
