package a1;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import a1.LinkedList;
import a1.LinkedList.Node;
import junit.framework.Assert;
public class LinkedListTest {
	LinkedList list = new LinkedList();
@Before
public void setup() {
	list.display();
	 	list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushBack(6);
		list.display();
}

	@Test
	public void testPushFront() {
		LinkedList list1=new LinkedList();
		list1.pushFront(0);
		assertEquals(0,list1.head.key);
		list.pushFront(10);
		assertEquals(10, list.head.key);
		
		list.pushFront(9);
		assertEquals(9, list.head.key);
		
		list.pushFront(8);
		assertEquals(8, list.head.key);
		
		list.pushFront(7);
		assertEquals(7, list.head.key);
		
		
	}

//---------------------------------------------------	
	
	int  printLast(LinkedList l)
    {
        int len = 0;
        Node temp = l.head;
  
        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        temp = l.head;
        for (int i = 1; i < len ; i++)
            temp = temp.next;
  
return temp.key;
    }
//---------------------------------------------------	
	@Test
	public void testPushBack() {
		list.pushBack(7);
		assertEquals(7,printLast(list));
		
	}

	@Test
	public void testPopFront() {
		
		list.popFront();	
		assertEquals(2,list.head.key);
		list.popFront();
		assertEquals(3,list.head.key);
		LinkedList list1=new LinkedList();
			list1.popFront();
			
	}

	@Test
	public void testPopBack() {
		//assertNull(list1.head.next);
		list.popBack();
		assertEquals(5,printLast(list));
		list.popBack();
		assertEquals(4,printLast(list));
				
		LinkedList list1=new LinkedList();
		list1.popBack();
		list1.pushFront(2);
		list1.popBack();
	}

	@Test
	public void testPop() {
		int[] expected= {1,2,4,5,6};
		int[] expected2= {2,4,5,6};
		int[] expected3= {2,4,5};
		int[] expected4= {};
		list.pop(2);
		Node temp=list.head;
		int i=0;
		while(temp!=null){
			
			assertEquals(expected[i],temp.key);
			temp=temp.next;
			i++;
		}
		list.pop(0);
		 temp=list.head;
		 i=0;
		while(temp!=null){
			
			assertEquals(expected2[i],temp.key);
			temp=temp.next;
			i++;
		}
		list.pop(3);
		 temp=list.head;
		 i=0;
		
		while(temp!=null){
			
			assertEquals(expected3[i],temp.key);
			temp=temp.next;
			i++;
		}
		LinkedList list1=new LinkedList();
		list1.pop(1);

		
	}

}
