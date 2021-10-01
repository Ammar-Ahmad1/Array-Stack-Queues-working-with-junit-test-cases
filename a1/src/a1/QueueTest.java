package a1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
public class QueueTest {
	Queue queue;
	@Before
	public void setup() throws Exception {
	 queue = new Queue(6); //create queue of size=5.
	 queue.display();
	 queue.enqueue(10);
	queue.enqueue(12);
	queue.enqueue(14);
	queue.enqueue(16);
	queue.enqueue(18);
	queue.display();
	
}
	@Test
	public void testEnqueue() throws Exception {
		queue.enqueue(20);
		int[] expected= {10,12,14,16,18,20};
		
		assertEquals(expected[0],queue.array[0]);
		
		}
	@Test(expected=java.lang.Exception.class)
	public void testEnqueue2() throws Exception {
		Queue q1=new Queue(0);
		q1.enqueue(10);

		}

	@Test(expected=java.lang.Exception.class)
	public void testDequeue() throws Exception {
		//queue.display();
		assertEquals(10,queue.dequeue());
		Queue q1=new Queue(0);
		   q1.dequeue();
	}

	@Test
	public void testEmpty() throws Exception {
		Queue queue1 = new Queue(6); //create queue of size=5.

		assertTrue(queue1.empty());
		queue1.enqueue(1);
		assertFalse(queue1.empty());
	}

	@Test
	public void testSize() {
		assertEquals(5,queue.size());
	}

}
