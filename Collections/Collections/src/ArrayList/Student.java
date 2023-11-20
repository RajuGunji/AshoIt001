package ArrayList;

public class Student 
{
	String Name;
	int age;
	long Mobile;
	
	public Student(String n,int a,long m)
	{
		Name=n;
		age=a;
		Mobile=m;
	}
	public String toString()
	{
		return Name+"->>"+age+"->>"+Mobile;
		
	}
}
