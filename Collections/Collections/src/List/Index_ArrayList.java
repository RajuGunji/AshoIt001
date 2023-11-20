package List;
import java.util.List;
import java.util.ArrayList;
public class Index_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		int a=(int)l.get(2);
		System.out.println(a);
	}
}
