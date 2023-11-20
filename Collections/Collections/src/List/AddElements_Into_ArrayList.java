package List;
import java.util.List;
import java.util.ArrayList;
public class AddElements_Into_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add("Guru");
		l.add('g');
		l.add(null);
		l.add(1);
		l.add(2);
		l.add(1);
		for(Object o:l)
		{
			System.out.println(o);
		}
	}
}
