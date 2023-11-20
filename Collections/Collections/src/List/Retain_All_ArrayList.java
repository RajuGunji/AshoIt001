package List;
import java.util.ArrayList;
import java.util.List;
public class Retain_All_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		List<Object> l1=new ArrayList<>();
		l1.add("Box");
		l1.add("Pencil");
		l1.add(2);
		l1.add(0);
		l.retainAll(l1);
		System.out.println(l);
		System.out.println(l1);
		
	}
}
