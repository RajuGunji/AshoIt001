package Comparator;
import java.util.*;
public class Comparatorz 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.roll=1;
		s1.name="Sireesh";
		Student s2=new Student();
		s2.roll=34;
		s2.name="Rinku";
		Student s3=new Student();
		s3.roll=19;
		s3.name="Arjun";
		Student s4=new Student();
		s4.roll=27;
		s4.name="Kittu";
		List<Student> l=new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.forEach(x->
		{
			System.out.println(x.roll+"-->"+x.name);
		});
		AgeComparator c=new AgeComparator();
		Collections.sort(l, c);
		System.out.println();
		l.forEach(x->
		{
			System.out.println(x.roll+"-->"+x.name);
		});
	}
}
