package StringSorting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringSorterTest {

	@Test
	void testSortStrings0() {
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
	
	@Test
	void testSortStrings1() {
		ArrayList<String> original = new ArrayList<String>();
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("hello");
		add.add("");
		add.add("blah blah blah");
		add.add("test");
		add.add("Test two");
		add.add("test again");
		add.add("test");
		add.add("Good Morning!");
		add.add("Taco");
		
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("test again");
		remove.add("one");
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> resultTest = new ArrayList<String>();
		resultTest.add("blah blah blah");
		resultTest.add("Good Morning!");
		resultTest.add("Test two");
		resultTest.add("hello");
		resultTest.add("test");
		resultTest.add("Taco");
		resultTest.add("");
		
		assertEquals(resultTest, (ArrayList<String>) result);
	}
	
	@Test
	void testSortStrings2() {
		ArrayList<String> original = new ArrayList<String>();
		original.add("kjalsd;");
		original.add("hfjdk");
		
		ArrayList<String> add = new ArrayList<String>();
		
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("kjalsd;");
		remove.add("hfjdk");
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> resultTest = new ArrayList<String>();
		
		assertEquals(resultTest, (ArrayList<String>) result);
	}
	
	@Test
	void testSortStrings3() {
		ArrayList<String> original = new ArrayList<String>();
		original.add("fhjdk");
		original.add("y839b");
		original.add("two");
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("4792932343");
		
		ArrayList<String> remove = new ArrayList<String>();
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> resultTest = new ArrayList<String>();
		resultTest.add("4792932343");
		resultTest.add("y839b");
		resultTest.add("fhjdk");
		resultTest.add("two");
		
		assertEquals(resultTest, (ArrayList<String>) result);
	}
	
	@Test
	void testSortStrings4() {
		ArrayList<String> original = new ArrayList<String>();
		original.add("three");
		original.add("six");
		original.add("one");
		
		ArrayList<String> add = new ArrayList<String>();
		
		ArrayList<String> remove = new ArrayList<String>();
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> resultTest = new ArrayList<String>();
		resultTest.add("three");
		resultTest.add("six");
		resultTest.add("one");
		
		assertEquals(resultTest, (ArrayList<String>) result);
	}
	
	@Test
	void testSortStrings5() {
		ArrayList<String> original = new ArrayList<String>();
		original.add("ok");
		original.add("Short");
		original.add("ThisIsAVeryLongString,Yes,MuchLongerThanUsual.WillItStillWork??????");
		original.add("e");
		original.add("d");
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("kdslajfkdlsjeifoweiowvjku8439phsu");
		add.add("ok");
		
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("d");
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> resultTest = new ArrayList<String>();
		resultTest.add("ThisIsAVeryLongString,Yes,MuchLongerThanUsual.WillItStillWork??????");
		resultTest.add("kdslajfkdlsjeifoweiowvjku8439phsu");
		resultTest.add("Short");
		resultTest.add("ok");
		resultTest.add("e");
		
		assertEquals(resultTest, (ArrayList<String>) result);
	}
	
	@Test
	void testSortStrings6() {
		ArrayList<String> original = new ArrayList<String>();
		original.add("e");
		original.add("ee");
		original.add("eeee");
		original.add("eee");
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("eeeee");
		
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("ee");
		remove.add("e");
		remove.add("eeeee");
		remove.add("eeee");
		remove.add("eee");
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> resultTest = new ArrayList<String>();
		
		assertEquals(resultTest, (ArrayList<String>) result);
	}
	
	@Test
	void testSortStrings7() {
		ArrayList<String> original = new ArrayList<String>();
		original.add("whoCares");
		original.add("bee");
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("add");
		add.add("and");
		
		ArrayList<String> remove = new ArrayList<String>();
		remove.add("whocares");
		
		StringSorter ob = new StringSorter();
		List<String> result = ob.sortStrings(original, add, remove);
		
		ArrayList<String> resultTest = new ArrayList<String>();
		resultTest.add("whoCares");
		resultTest.add("bee");
		resultTest.add("and");
		resultTest.add("add");
		
		assertEquals(resultTest, (ArrayList<String>) result);
	}

}
