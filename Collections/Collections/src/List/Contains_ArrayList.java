package List;

import java.util.List;
import java.util.ArrayList;
public class Contains_ArrayList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add("Book");
		l.add("Pencil");
		l.add("Eraser");
		l.add('P');
		l.add(null);
		System.out.println(l.contains("Book"));
		System.out.print(l.contains(null));
		
	}
}
