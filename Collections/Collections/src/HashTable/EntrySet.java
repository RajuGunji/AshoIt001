package HashTable;
import java.util.*;
import java.util.Map.Entry;
public class EntrySet
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(500070, "Durgamcheruv");
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		Set<Entry<Integer,String>> entries=m.entrySet();
		for(Entry<Integer, String> entry:entries)
		{
			System.out.println(entry.getKey()+"-->>"+entry.getValue());
		}
	}
}
