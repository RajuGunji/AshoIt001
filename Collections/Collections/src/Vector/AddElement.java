package Vector;
import java.util.ListIterator;
import java.util.Vector;
public class AddElement 
{
	public static void main(String[] args)
	{
		Vector<Object> v=new Vector();
		v.add("@");
		v.addElement(0);
		v.addElement(null);
		v.addElement('v');
		v.addElement("Vector");
		v.addElement(1);
		ListIterator<Object> l=v.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
	}
}
