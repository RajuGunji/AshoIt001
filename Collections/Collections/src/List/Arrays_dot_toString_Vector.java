package List;
import java.util.*;
public class Arrays_dot_toString_Vector
{
	public static void main(String[] args)
	{
		List<String> l=new Vector<>();
		l.add("Sree");
		l.add("Ram");
		l.add("Jai");
		l.add("Hanuman");
		Object[] arr= l.toArray();
		System.out.println(Arrays.toString(arr));
	}

}
