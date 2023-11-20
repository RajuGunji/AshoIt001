package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class ContainsValue
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		m.put(500070, "Durgamcheruv");
//		Verify Values in Map usinge containsValue().
		System.out.println(m.containsValue("KPHB"));
	}
}
