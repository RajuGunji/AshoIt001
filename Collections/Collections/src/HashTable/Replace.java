package HashTable;
import java.util.*;
public class Replace
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(500070, "Durgamcheruv");
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		Set<Integer> i=m.keySet();
		for(Integer keys:i)
		{
			System.out.println(keys+"-->>"+m.get(keys));
		}
		System.out.println();
		m.replace(503307, "Ramanagaram");
		Set<Integer> keys=m.keySet();
		for(Integer key:keys)
		{
			System.out.println(key+"-->>"+m.get(key));
		}
	}
}
