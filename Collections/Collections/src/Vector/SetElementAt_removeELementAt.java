package Vector;
import java.util.ListIterator;
import java.util.Vector;
public class SetElementAt_removeELementAt
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<>();
		v.add(0);
		v.add(2);
		v.add('b');
		v.add("Mom");
		v.add(null);
		v.add(0);
		v.add(2);
		v.add('b');
		v.add("Mom");
		v.add(null);
		v.setElementAt("Sorry",5);
		System.out.println(v.get(5));
		v.removeElementAt(6);
		ListIterator<Object> l=v.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}
}
