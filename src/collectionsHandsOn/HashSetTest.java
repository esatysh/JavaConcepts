package collectionsHandsOn;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet setVar=new HashSet();
setVar.add("test");
setVar.add(123);
setVar.add('D');
setVar.add(456.56);
setVar.add("test");

System.out.println(setVar);

//to convert a HashSet to ArrayList
ArrayList arLi=new ArrayList(setVar);
System.out.println(arLi);
}

}