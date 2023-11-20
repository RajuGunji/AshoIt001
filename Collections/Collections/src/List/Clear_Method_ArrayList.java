package List;
import java.util.List;
import java.util.ArrayList;
public class Clear_Method_ArrayList
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Object> l=new ArrayList<>();
		l.add('l');
		l.add("Proceed");
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(null);
		l.clear();
		System.out.println(l);
	}
}
