package PriorityQueue;
import java.util.*;
public class Queue_Iteration
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<>();
		q.offer(1);
		q.offer(6);
		q.offer(9);
		q.offer(3);
		q.offer(7);
		q.offer(2);
		System.out.println(q);
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
