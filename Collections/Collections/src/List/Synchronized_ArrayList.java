package List;
import java.util.*;
public class Synchronized_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(3);
		l.add(null);
		l.add(1);
		Collections.synchronizedList(l);
	/*	ByDefault ArrayList is Non-synchronized but by using synchronizedList() in Collections Class we will make
		arrayList as synchronized*/
	}
}
