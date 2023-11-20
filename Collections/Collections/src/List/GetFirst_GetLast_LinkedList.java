package List;
import java.util.LinkedList;
public class GetFirst_GetLast_LinkedList
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add('c');
		l.add("Param");
		l.add(0);
		l.add(null);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	}
}
