package HashTable;
import java.util.*;
public class Key_Value_Pair
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
	}
}
