package List;
import java.util.List;
import java.util.ArrayList;
public class AddAll_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		List<Object> a=new ArrayList<>();
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		l.addAll(a);
		System.out.println(l);
	}
}
