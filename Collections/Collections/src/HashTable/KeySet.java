package HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class KeySet
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable();
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		m.put(500070, "Durgamcheruv");
//		retrieval of Keys using keySet().
//		m.keySet()-->>it returns set of Integer Keys
		Set<Integer> keys=m.keySet();
		for(Integer i:keys)
		{
			System.out.println(i);
		}
	}
}
