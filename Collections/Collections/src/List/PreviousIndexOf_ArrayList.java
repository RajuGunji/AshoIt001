package List;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class PreviousIndexOf_ArrayList 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Character> l=new ArrayList<>();
		l.add('R');
		l.add('E');
		l.add('A');
		l.add('L');
		ListIterator<Character> i=l.listIterator();
		int y=l.hashCode();
		System.out.println(y);
		for(int x=0;x<l.size();x++)
		{
				i.next();
				System.out.println(i.previousIndex());
		}
	}
}
