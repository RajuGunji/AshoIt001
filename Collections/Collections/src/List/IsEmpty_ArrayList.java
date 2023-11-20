package List;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
import java.util.Arrays;
public class IsEmpty_ArrayList
{
	public static void main(String[] args)
	{
		List<Object> l=new ArrayList<>();
		System.out.println(l.isEmpty());
		l.add(1);
		l.add(2);
		l.add(3);
		if(l.isEmpty())
		{
			System.out.println("ArrayList is empty");
		}
		else
			System.out.println("ArrayList is not empty");
	}
}
