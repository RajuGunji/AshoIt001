package Vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Collection_To_Array_Using_ToArray_nd_ToString 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] a=new String[] {"Raju","Rajesh","Lakshmi","Siri"};
		List<String> l=new Vector<>();
		for(int i=0;i<a.length;i++)
		{
			l.add(a[i]);
		}
		Object[] s= l.toArray();
		System.out.println(Arrays.toString(s));
	}
}
