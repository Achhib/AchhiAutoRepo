package nit.AchhigitHub;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.calculation.Addition;

public class AchhiTest {
private static Addition adt1;
	
	@Test
	public static void addPositive(int a, int b) {
		System.out.println("AchhiTest.addPositive()");
		int expected = 50;
		int actual = adt1.sum(25, 25);
		System.out.println("value is: "+actual);
		//assertTrue(expected, actual);
	}

	
}
