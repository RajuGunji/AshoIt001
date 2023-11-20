package List;

import java.util.LinkedList;

public class OfferFirstOfferLast_LinkedList 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList<Object> l=new LinkedList<>();
		l.add(null);
		l.add(0);
		l.add(1);
		l.add('x');
		l.add("Amma");
		l.add(1);
		l.offerFirst("Nanna");
		l.offerLast("Gunji");
		System.out.println(l);
	}
}
