package PriorityQueue;
import java.util.*;
public class Peek_null 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<>();
		System.out.println(q.peek());
		/* for empty queue if we try to print values then it will gives null value. Because by default Priority Queue 
		 * uses Array to store Elements That Array is Object type of Array.
		 * Default Elements of Array is null, so if we print empty Priority Queue indirectly it will print empty Object
		 * Array hence null Values Prints
		 */
	}
}
