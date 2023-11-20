package HashTable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class PutIfAbsent 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		m.put(500070, "Durgamcheruv");
		Set<Integer> keys=m.keySet();
		for(Integer key:keys)
		{
			System.out.println(key+"-->"+m.get(key));
		}
		System.out.println();
//		Update value by re-Inserting
		m.putIfAbsent(503307, "Ramanagaram");
		Set<Integer> i=m.keySet();
		for(Integer k:i)
		{
			System.out.println(k+"-->>"+m.get(k));
		}
	}
}
