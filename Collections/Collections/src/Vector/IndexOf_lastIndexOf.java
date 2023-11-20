package Vector;
import java.util.Vector;
public class IndexOf_lastIndexOf
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
		System.out.println(v.lastIndexOf(2));
		System.out.println(v.indexOf('b'));
		
	}
}
