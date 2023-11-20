package List;
import java.util.*;
public class AddElements_Vector_to_Vector 
{
	public static void main(String[] args)
	{
		Vector<String> v=new Vector<>();
		v.add("Book");
		v.add("Pen");
		v.add("Laptop");
		v.add("Chocos");
		Vector<String> x=new Vector<>();
		x.add("Printer");
		x.add("Chair");
		v.addAll(0,x);
		System.out.println(v);
		
//		v.removeAll(x);
//		System.out.println(v);
		
		Vector<String> y=new Vector<>();
		y.add("Printer");
		y.add("Pen");
		System.out.println(v.containsAll(y));
	}
}
