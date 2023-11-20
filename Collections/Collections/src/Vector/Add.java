package Vector;

import java.util.ListIterator;
import java.util.Vector;

public class Add 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<>();
		System.out.println(v.capacity());
		v.add(1);
		v.add('v');
		v.add("VCT");
		v.add(null);
		v.add(1);
		v.add(1);
		v.add('v');
		v.add("VCT");
		v.add(null);
		v.add(1);
		v.add(0);
		System.out.println(v.capacity());
		ListIterator<Object> l=v.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}
}
