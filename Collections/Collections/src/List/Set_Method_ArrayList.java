package List;
import java.util.List;
import java.util.ArrayList;
public class Set_Method_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(1);
		l.add('l');
		l.add("oops");
		l.add(null);
		l.set(3, 'o');
		for(Object o:l)
		{
			System.out.println(o);
		}
	}
}
