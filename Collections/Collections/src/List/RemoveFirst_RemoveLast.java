package List;
import java.util.LinkedList;
public class RemoveFirst_RemoveLast
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		l.remove();
		System.out.println(l);
	}
}
