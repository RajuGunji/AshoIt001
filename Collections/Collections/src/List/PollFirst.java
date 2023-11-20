package List;
import java.util.LinkedList;
import java.util.ListIterator;
public class PollFirst
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add(43);
		l.add(4);
		l.add("babri");
		l.add(null);
		l.add(84);
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		ListIterator<Object> i=l.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
