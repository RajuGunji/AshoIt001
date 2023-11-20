package Vector;
import java.util.Vector;
public class ContainsAll
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<>();
		v.addElement(4);
		v.addElement('v');
		v.addElement("Extreme");
		Vector<Object> y=new Vector<>();
		y.add(4);
		y.add('v');
		y.add("Extreme");
		y.add(null);	
		System.out.println(y.containsAll(v));
	}
}
