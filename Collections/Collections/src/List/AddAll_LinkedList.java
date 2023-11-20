package List;

import java.util.LinkedList;

public class AddAll_LinkedList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add(3);
		l.add(0);
		l.add(null);
		LinkedList<Object> l1=new LinkedList<>();
		l1.add("Winfo");
		l1.add('w');
		l1.add('%');
		l.addAll(l1);
	   System.out.println(l);
	}
}
