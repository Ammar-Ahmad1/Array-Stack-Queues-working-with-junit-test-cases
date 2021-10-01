package a1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import a1.Array;

public class TestArray {
	Array  obj=new Array();
	@Before
	public void setUp() {
		
	//	obj=new Array();
		obj.insert(3, 0);
		obj.insert(1, 1);
		obj.insert(7, 2);
		obj.insert(5, 3);
		obj.insert(9, 4);
		
		}
	
	@Test
	public void testInsert() {
		Array obj1=new Array();
		obj1.insert(1, 0);
		obj1.insert(2, 1);
		obj1.insert(3, 2);
		//check insert function
		obj1.insert(4, 1);
		
		int[] expected= {1,4,2,3};
		for(int i=0;i<expected.length;i++) {
		assertEquals(expected[i],obj1.array[i]);
		}
	}

	@Test
	public void testDelete() {
		Array obj1=new Array();
		obj1.insert(1, 0);
		obj1.insert(2, 1);
		obj1.insert(3, 2);
		obj1.delete(1);
		int[] expected= {1,3};
		for(int i=0;i<expected.length;i++) {
			assertEquals(expected[i],obj1.array[i]);
			}
	}
	
	

@Test

public void testBubbleSort() {
	Array obj1=new Array();
	obj1.insert(3, 0);
	obj1.insert(1, 1);
	obj1.insert(5, 2);
	obj1.insert(9, 3);
	obj1.insert(7, 4);
	
	obj1.bubbleSort();
	
	int[] expected= {1,3,5,7,9};
	for(int i=0;i<expected.length;i++) {
		assertEquals(expected[i],obj1.array[i]);
		}
}
@Test
public void testdisplay() {
	obj.display();
}
	@Test
	public void testLinearSearch() {
		 Assert.assertNotEquals(true,obj.linearSearch(4));
		 Assert.assertTrue(obj.linearSearch(3));
	}
	@Test
	public void testBinarySearch() {
		  Assert.assertEquals(true,obj.binarySearch(9, 0, 5));
		  Assert.assertEquals(true,obj.binarySearch(3, 0, 5));

		  Assert.assertFalse(obj.binarySearch(9, 5, 0));
	}
	

}
