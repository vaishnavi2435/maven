package my_pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Arraylist_demo1 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> p1=new ArrayList<Integer>();
		
		//System.out.println(p1.add(100));
		p1.add(200);
		p1.add(400);
		p1.add(88);
		p1.add(87);
		p1.add(250);
		p1.add(150);
		
		for(int a:p1)
		{
			System.out.println(a);
		}
		
		System.out.println("**************************");
		
		Iterator<Integer>c2=p1.iterator();
		
		while(c2.hasNext())
		{
			System.out.println(c2.next());
		}
		Collections.sort(p1);
		System.out.println(p1);
		
		System.out.println(Collections.min(p1));
		System.out.println(Collections.max(p1));
		
		
		System.out.println("**************************");
		System.out.println("**************************");
		
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(30);
		l1.add(20);
		l1.add(20);
		l1.add(150);
		l1.add(200);
		l1.add(150);
		
		Iterator<Integer> c=l1.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
		System.out.println("**************************");
		Collections.sort(l1);
		System.out.println(l1);
		
		System.out.println("**************************");
		
		Set<Integer> s=new HashSet<Integer>(p1);
		s.addAll(l1);
		
		Iterator<Integer >x=s.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		System.out.println("**************************");
		String s1="aaabbbxxxddddeeekkklll";
		
		Set<String>z=new HashSet<String>();
		z.add(s1);
		System.out.println(z);
		
		for(String a:z)
		{
			System.out.println(a.charAt(2));
		}
		
		
			
		
		
		
		

	}

}
