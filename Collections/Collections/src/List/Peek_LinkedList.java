package List;

import java.util.LinkedList;

public class Peek_LinkedList
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add(10);
		l.add(2);
		l.add(3);
		l.add(4);
			System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
	}
}
