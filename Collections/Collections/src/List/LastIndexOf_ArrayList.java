package List;
import java.util.List;
import java.util.ArrayList;
public class LastIndexOf_ArrayList
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(1);
		l.add(4);
		l.add(0);
		l.add(null);
		l.add('*');
		l.add("Code");
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		int a=l.indexOf(4);
		int b=l.lastIndexOf(4);
		System.out.println(a);
		System.out.println(b);
	}
}
