package HashTable;
import java.util.*;
public class Get
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		m.put(500070, "Durgamcheruv");
//		Retrieval of Value by passing Key using get().
		System.out.println(m.get(503306));
	}
}
