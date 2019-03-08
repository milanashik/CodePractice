package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import java.util.*;

import main.DSA.LinkedListStack;

public class LinkedListStackTest {
	@Test
	public void testPushAndPop() {
	    LinkedListStack<Integer> st = new LinkedListStack<>();
	    st.push(50);
	    st.push(70);
	    st.push(190);
	    assertEquals("190 70 50 ", st.toString());
	    assertEquals(190, (int) st.pop());
	    assertEquals("70 50 ", st.toString());
	}

	@Test
	public void testPopUntilEmpty() {
	    List<Integer> values = Arrays.asList(50, 70, 190, 20);
	    LinkedListStack<Integer> st = new LinkedListStack<>();
	    assertTrue(st.isEmpty());
	    for (Integer value : values) {
	        st.push(value);
	    }
	    assertFalse(st.isEmpty());
	    for (int i = values.size(); i > 0; --i) {
	        assertEquals(values.get(i - 1), st.pop());
	    }
	    assertTrue(st.isEmpty());
	}
}
