package A04_TraverseTree;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class W�rterbuchWordsPrefixTest {

	private W�rterbuch wb;
	
	@Before
	public void setUp() throws Exception {
		wb = new W�rterbuch();
		wb.add("Homer");
		wb.add("Flanders");
		wb.add("Maggie");
		wb.add("Marge");
		wb.add("Lisa");
		wb.add("Burns");
		wb.add("Crusty");
		wb.add("Bart");
		wb.add("Manjula");
		wb.add("Marty");
	}

	@Test
	public void emptyPrefix() {
		Set<String> sl = wb.getWordsWithPrefix("");
		assertEquals(10, sl.size());
	}
	
	@Test
	public void noMatch() {
		Set<String> sl = wb.getWordsWithPrefix("zz");
		assertEquals(0, sl.size());
	}
	
	@Test
	public void matchSingleChar() {
		Set<String> sl = wb.getWordsWithPrefix("B");
		assertEquals(2, sl.size());
		assertTrue(sl.contains("Bart"));
		assertTrue(sl.contains("Burns"));
	}

	@Test
	public void matchMultiChar() {
		Set<String> sl = wb.getWordsWithPrefix("Ma");
		assertEquals(4, sl.size());
		assertTrue(sl.contains("Maggie"));
		assertTrue(sl.contains("Manjula"));
		assertTrue(sl.contains("Marge"));
		assertTrue(sl.contains("Marty"));
	}
	
	@Test
	public void matchMultiChar2() {
		Set<String> sl = wb.getWordsWithPrefix("Mar");
		assertEquals(2, sl.size());
		assertTrue(sl.contains("Marge"));
		assertTrue(sl.contains("Marty"));
	}

	@Test
	public void matchMultiChar3() {
		Set<String> sl = wb.getWordsWithPrefix("Hom");
		assertEquals(1, sl.size());
		assertTrue(sl.contains("Homer"));
	}
}
