package Vector;

import java.util.Vector;

public class AddAll
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<>();
		v.add(0);
		v.add(1);
		v.add(3);
		v.add(null);
		v.add(1);
		Vector<Object> v1=new Vector<>();
		v1.add(4);
		v1.add(5);
		v1.add(6);
		v.addAll(v1);
		System.out.print(v);
		System.out.println("");
		System.out.println(v1);
	}
}
