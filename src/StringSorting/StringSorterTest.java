package StringSorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringSorterTest {

	@Test
	void testSortStrings() {
		ArrayList<String> original = new ArrayList<String>();
		original.add("one");
		original.add("two");
		original.add("three");
		original.add("seven");
		original.add("oop");
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("fib");
		add.add("one");
		add.add("two");
		add.add("add");
		add.add("five");
		add.add("six");
		
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("two");
		remove.add("five");
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> immutTest = new ArrayList<String>();
		immutTest.add("one");
		immutTest.add("two");
		immutTest.add("three");
		immutTest.add("seven");
		immutTest.add("oop");
		
		ArrayList<String> resultTest = new ArrayList<String>();
		resultTest.add("three");
		resultTest.add("seven");
		resultTest.add("six");
		resultTest.add("oop");
		resultTest.add("one");
		resultTest.add("fib");
		resultTest.add("add");
		
		assertEquals(immutTest, original);
		assertEquals(resultTest, (ArrayList<String>) result);
	}

}
