package Vector;

import java.util.ListIterator;
import java.util.Vector;

public class Clear
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<>();
		v.add(0);
		v.add('v');
		v.add("Vector");
		v.add(null);
		v.clear();
		ListIterator<Object> l=v.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println(v.isEmpty());
	}
}
