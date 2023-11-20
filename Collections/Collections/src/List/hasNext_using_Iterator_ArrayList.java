package List;
import java.util.List;

import java.util.Iterator;

import java.util.ArrayList;
public class hasNext_using_Iterator_ArrayList 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add("Mangaraju");
		l.add('M');
		Iterator<Object> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
