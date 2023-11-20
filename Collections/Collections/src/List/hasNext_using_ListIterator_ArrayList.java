package List;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class hasNext_using_ListIterator_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		ListIterator<Object> i=l.listIterator();
		while(i.hasNext()) 
		{
			System.out.print(i.next()+" ");
		}
	}
}
