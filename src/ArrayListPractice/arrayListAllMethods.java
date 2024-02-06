package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class arrayListAllMethods {
	@SuppressWarnings("unchecked")
	public static void main(String []args) {
	//Ways of declaring ArrayList
	
	//For heterogeneous data elements and objects 
	//ArrayList al = new ArrayList();
	
	//For specific type of data 
	//ArrayList <String> al = new <String> ArrayList();
	
	//By using List Implementation
	//List l = new ArrayList();
	
	ArrayList al = new ArrayList();
	
	//Adding Elements into arraylist
	   al.add("harish");
	   al.add(1);
	   al.add("Pkp");
	   al.add(true);
	   al.add("c");
	   System.out.println(al);
	   
	   
	   ArrayList al_dup = new ArrayList();
	   al_dup.addAll(al);
	   System.out.println(al_dup);
	   
	   System.out.println(al.equals(al_dup));
	   
	   
	   
	   
	   
	   //Size() to find size of a arraylist
	   int size = al.size();
	   System.out.println("Size: "+ size);
	   
	   //Remove() to remove element from arraylist
	  System.out.println("Removeing element 2 from alist: " + al.remove(1)+
			  " after removed arraylist is: " + al);
	  
	  //insert a new element 
	  //add(index, object);
	  al.add(1, "Naidu");
	  System.out.println("After Insertion :" + al);
	  
	  //Get(index);
	  //Retrive Specific element
	  System.out.println("Retreving element 0 :" + al.get(0));
	  
	  //Set(Index, element);
	  //To replace or change existing value
	  
	  System.out.println("Replaceing element 3 from al : " + al.set(2, "PTP") );
	  System.out.println("After Replacing : " + al );
	  
	  //Contains(Elements or object);
	  //to search required element or objects if presents true else false
	  
	  System.out.println("To search a value from Al " + al.contains("harish"));
	  
	  //isEmpty();
	  System.out.println("to find arraylist is empty or not " + al.isEmpty());
	  
	  // To read the data in arrayList
	  
	  // 1) for loop
	  
	  System.out.println("Reading arraylist usin for loop");
	  
	  for(int i = 0;i<al.size();i++) {
		  System.out.println(al.get(i));
	  }
	  
	  // 2) for each loop
	  System.out.println("Reading arraylist using for loop");
	  
	  for(Object e:al)
	  {
		  System.out.println(e);
	  }
	  

	Collections.sort(al);
	  System.out.println(al);
	
	}
}
