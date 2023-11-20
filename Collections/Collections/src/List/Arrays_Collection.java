package List;
import java.util.*;
public class Arrays_Collection
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] arr=new String[] {"SDAS","wewd","lkjle","DCZS"};
//		int[] arr=new int[] {1,2,3,4,5};
		List<Object> l=new ArrayList<>();
		int i=0;
		for(;i<arr.length;i++)
		{
			l.add(arr[i]);
		}
//		for(Object x:l)
//		{
//			System.out.println(x);
//		}
		System.out.println(l.size());
		i=0;
		while(i<l.size())
		{
			while(!l.isEmpty()) 
			{
				System.out.println(l.get(i));
				l.remove(i);
			}
			i++;
		}
	}
}
