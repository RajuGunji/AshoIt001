package List;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class Previous_HasPrevious_ArrayList
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add('c');
		l.add("Char");
		l.add(null);
		ListIterator<Object> i=l.listIterator();
		while(i.hasNext())
		{
			i.next();
		}
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		System.out.println();
	}
}
