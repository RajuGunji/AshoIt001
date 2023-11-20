package List;
import java.util.List;
import java.util.ArrayList;

public class RemoveAll_ArrayList
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add("Mangaraju");
		l.add('M');
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(null);
		List<Object> l1=new ArrayList<>();
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l.removeAll(l1);
		System.out.println(l);
	}
}
