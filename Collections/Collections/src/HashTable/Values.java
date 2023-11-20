package HashTable;
import java.util.*;
public class Values 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Integer, String> m=new Hashtable<>();
		m.put(503306, "Nacharam");
		m.put(503307, "Sathupally");
		m.put(500082, "KPHB");
		m.put(500070, "Durgamcheruv");
//		Retrieval of values using value().
		Collection<String> Values=m.values();
		for(String Value:Values)
		{
			System.out.println(Value);
		}
	}
}
