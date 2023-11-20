package List;
import java.util.*;
public class AsList_Vector {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Integer[] arr=new Integer[] {1,2,3,4,5};
		Vector<Object> l=new Vector<>(Arrays.asList(arr));
		System.out.println(l.capacity());
		/*ListIterator<Object> li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println();
		}*/
		l.forEach(x->
		{
				System.out.print(x+" ");
		});
//		System.out.println();
//		System.out.println(l.size());
//		System.out.println(l.capacity());
//		System.out.println(l.get(0));
		l.set(0, 10);
		l.removeAllElements();
		System.out.println(l.capacity());
	}
}
