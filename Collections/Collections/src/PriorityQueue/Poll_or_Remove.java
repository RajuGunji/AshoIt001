package PriorityQueue;
import java.util.*;
public class Poll_or_Remove 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Queue<Object> q=new PriorityQueue<>();
		q.offer(1);
		q.offer(6);
		q.offer(9);
		q.offer(3);
		q.offer(7);
		q.offer(2);
			System.out.println(q);
			System.out.println(q.peek());
			q.poll();			
			System.out.println(q);
			System.out.println(q.peek());
			q.remove();
			System.out.println(q);	
/*			Diff B/W poll() and remove()
  
*			if poll() is used on empty Queue then it will prints null values
*			if remove is used on empty Queue then it will thrown an Exception i.e, NoSuchElementException
			 */
			Queue<Object> pq=new PriorityQueue<>();
			pq.remove();
			System.out.println(pq);
			/*Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.AbstractQueue.remove(AbstractQueue.java:117)
	at PriorityQueue.Poll_or_Remove.main(Poll_or_Remove.java:28)*/
	}
}
