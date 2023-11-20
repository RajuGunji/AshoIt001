package Vector;

import java.util.Vector;

public class Capacity 
{
	public static void main(String[] args)
	{
		Vector<Object> v=new Vector<>();
		System.out.println(v.capacity());
		v.add(1);
		v.add('v');
		v.add("VCT");
		v.add(null);
		v.add(1);
		v.add(1);
		v.add('v');
		v.add("VCT");
		v.add(null);
		v.add(1);
		v.add(0);
		System.out.println(v.capacity());
	}
}
