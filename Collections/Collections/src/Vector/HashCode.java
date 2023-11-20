package Vector;
import java.util.Vector;
public class HashCode
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vector<Object> o=new Vector<>();
		o.addElement(0);
		o.addElement(1);
		o.addElement(2);
		o.addElement(3);;
		o.addElement(null);
		System.out.println(o.hashCode());
	}
}
