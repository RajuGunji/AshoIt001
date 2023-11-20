package List;

import java.util.ArrayList;
import java.util.*;
public class RetainAll_ArrayList
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<>();
		l.add(3432);
		l.add(5243);
		l.add(7453);
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(5243);
		s.add(20);
		s.retainAll(l);
		System.out.println(s);
	}
}
