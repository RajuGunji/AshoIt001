package List;
import java.util.*;
public class Collection_Array_Vector
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();
		v.add("Water");
		v.add("Cooker");
		v.add("Rice");
		v.add("Salt");
		Object[] a=v.toArray();
		System.out.println(Arrays.toString(a));
	}
}
