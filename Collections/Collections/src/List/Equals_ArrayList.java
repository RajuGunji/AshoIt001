package List;
import java.util.List;
import java.util.ArrayList;
public class Equals_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		List<Object> l1=new ArrayList<>();
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		if(l.equals(l1))
		{
			System.out.println("Same");
		}
		else 
			System.out.println("Not Same");
	}
}
