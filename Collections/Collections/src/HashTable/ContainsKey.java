package HashTable;
import java.util.*;
public class ContainsKey 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		m.put(500070, "Durgamcheruv");
//		Verification of Key in a Map
		System.out.println(m.containsKey(503306));
	}
}
