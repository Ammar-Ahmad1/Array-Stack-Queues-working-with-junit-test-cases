package a1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class StackTest {

	Stack stack = new Stack();
	
	@Before
	public void setup() {
		stack.display();
		stack.push(10);            
		stack.push(20);            
		stack.push(30); 
		stack.display();

	}
	@Test
	public void testPush() {
		 stack.push( -17 );
	     assertEquals( -17,stack.top() );        
	}

	@Test
	public void testTop() {
		 stack.push( 70 );
	     assertEquals( 70,stack.top() );        
		 stack.push( 80 );
	     assertEquals( 80,stack.top() );
	     Stack stack1=new Stack();
	     assertEquals(-1,stack1.top());
	}

	@Test
	public void testPop() {
		 stack.push( 1 );
	        assertEquals( 1, stack.pop() );
		     Stack stack1=new Stack();
		     assertEquals(-1,stack1.pop());

	}

	@Test
	public void testGetSize() {
		assertEquals(3,stack.getSize());
	}

}
