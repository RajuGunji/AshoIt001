package List;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
public class AddFirst_AddLast_LinkedList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add(0);
		l.add('c');
		l.add(null);
		l.add(1);
		l.addLast('#');
		l.addFirst("Barbique");
		ListIterator<Object> i=l.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
