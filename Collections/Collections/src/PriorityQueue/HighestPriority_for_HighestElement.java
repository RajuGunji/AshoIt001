package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HighestPriority_for_HighestElement
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
		q.offer(1);
		q.offer(6);
		q.offer(9);
		q.offer(3);
		q.offer(7);
		q.offer(2);
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
