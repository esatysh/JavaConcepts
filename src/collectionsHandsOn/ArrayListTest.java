package collectionsHandsOn;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arLi=new ArrayList();
		arLi.add("This is String");
		arLi.add('A');
		arLi.add(56489);
		arLi.add(78.89);
		arLi.add("This is String");
		arLi.add("This is String");
	
		//printing the arraylist object prints all the elements as given below
		System.out.println(arLi);
		for(Object obj:arLi)
		{
			System.out.println(obj);
		}
		
		Iterator itr=arLi.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println("Iterator "+itr.next());
			//itr.next();
		}
		
		
		
		
	}

}
