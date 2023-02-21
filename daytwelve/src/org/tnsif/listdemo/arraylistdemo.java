package org.tnsif.listdemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class arraylistdemo {

	public static void main(String[] args) {
		//collwction is an interface we cant create an oject for a collection
		//Collection obj=new Collection<>();
		
		//list1
		Collection<Object> obj=new ArrayList<>();
		obj.add(101);
		obj.add(30.8f );
		obj.add('z');
		System.out.println("first list is: "+obj);

		//list2 
		List<Object> obj1=new ArrayList<>();
		/*obj.add(101);
		obj.add(30.8f);
		obj.add('z');*/
		obj1.addAll(obj);
		obj1.add(30.8);
		System.out.println("second list is: "+obj);
		System.out.println("size of list1 "+obj.size());
		System.out.println("list 2 is empty? "+obj.isEmpty() );
		obj.remove(101);
		System.out.println("first list is: "+obj);
		System.out.println(obj1.contains(101));
		System.out.println("element at location at: "+obj1.get(1));
		System.out.println("index of z: "+obj1.indexOf('z') );
		System.out.println("last index of 30.8f is : "+obj1.indexOf(30.8) );
		obj.clear();
		System.out.println(obj);
		
		
		List<Integer>obj2=new ArrayList<>();
		obj2.add(76);
		obj2.add(16);
		obj2.add(45);
		System.out.println("List 3 is: "+obj2);
		Collections.sort(obj2);
		System.out.println("ascending order: " +obj2);
		Collections.reverse(obj2);
		System.out.println("decending order: " +obj2);
	}

}
