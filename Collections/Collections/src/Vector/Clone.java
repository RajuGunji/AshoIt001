package Vector;
import java.util.Vector;
public class Clone
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<>();
		v.add(0);
		v.add('v');
		v.add("Vector");
		v.add(null);
		Object vct=v.clone();
		System.out.println(vct);
	}
}
