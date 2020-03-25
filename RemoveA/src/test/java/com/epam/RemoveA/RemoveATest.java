package com.epam.RemoveA;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class RemoveATest {
	/*TODO list for my feature
	 * 1.  ABCD   :  BCD
	 * 2.  AACD   :  CD
	 * 3.  BACD   :  BCD
	 * 4.  BBAA   :  BBAA
	 * 5.  AABAA  :  BAA
	 */
	@Test
	void test1() {
		RemoveA remove_2_A=new RemoveA(); 
		String actual = remove_2_A.remove("ABCD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test2() {
		RemoveA remove_2_A=new RemoveA(); 
		String actual = remove_2_A.remove("AACD");
		assertEquals("CD",actual);		
	}
	@Test
	void test3() {
		RemoveA remove_2_A=new RemoveA(); 
		String actual = remove_2_A.remove("BACD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test4() {
		RemoveA remove_2_A=new RemoveA(); 
		String actual = remove_2_A.remove("BBAA");
		assertEquals("BBAA",actual);		
	}

	@Test
	void test5() {
		RemoveA remove_2_A=new RemoveA(); 
		String actual = remove_2_A.remove("AABAA");
		assertEquals("BAA",actual);		
	}
}
