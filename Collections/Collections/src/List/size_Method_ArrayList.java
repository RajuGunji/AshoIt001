package List;
import java.util.List;
import java.util.ArrayList;
public class size_Method_ArrayList 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(0);
		l.add('p');
		l.add("practice");
		l.add(null);
		System.out.println(l.size());
	}
}
