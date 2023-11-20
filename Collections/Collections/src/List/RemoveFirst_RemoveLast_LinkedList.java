package List;
import java.util.LinkedList;
import java.util.List;
public class RemoveFirst_RemoveLast_LinkedList
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add(1);
		l.add('n');
		l.add("nulls");
		l.add(null);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
	}
}
