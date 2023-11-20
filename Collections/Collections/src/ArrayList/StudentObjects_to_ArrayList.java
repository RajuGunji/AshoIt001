package ArrayList;
import java.util.*;
public class StudentObjects_to_ArrayList 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Student> l=new ArrayList<>();
		l.add(new Student("Ashok",38, 950528042));
		l.add(new Student("Murali",32,703668899));
		l.add(new Student("Pavan",35,984827750));
//		System.out.println(l.toString());
//		for (Student s : l) 
//		{
//			System.out.println(s.toString());
//		}
		ListIterator li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("======Backward Iteration======");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		System.out.println("======================");
		
		
	}
	
}
