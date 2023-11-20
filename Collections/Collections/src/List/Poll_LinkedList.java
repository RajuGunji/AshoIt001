package List;
import java.util.LinkedList;
import java.util.ListIterator;
public class Poll_LinkedList
{
	public static void main(String[] args) 
	{
		LinkedList<Object> l=new LinkedList<>();
		l.add(10);
		l.add('c');
		l.add("Fs");
		l.add(null);
		System.out.println(l.poll());
		System.out.println("Hey cool");
		ListIterator i=l.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
