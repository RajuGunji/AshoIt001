package Comparable;
import java.util.*;
public class Student implements Comparable<Student>
{
	int age;
	String name;
	@Override
	public int compareTo(Student o) 
	{
		return this.age-o.age;
	}
}
