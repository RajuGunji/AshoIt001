package HashTable;
import java.util.*;
public class Remove 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		m.put(500070, "Durgamcheruv");
		Set<Integer> Keys=m.keySet();
		for(Integer Key:Keys)
		{
			System.out.println(Key+"-->>"+m.get(Key));
		}
		System.out.println();
//		Remove value by passing Key
		m.remove(503307);
		Set<Integer> Keys1=m.keySet();
		for(Integer Key:Keys1)
		{
			System.out.println(Key+"-->>"+m.get(Key));
		}
	}
}
