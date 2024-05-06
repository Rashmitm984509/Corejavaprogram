import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Numberdemo {
@Test
	void factorialTest() {
		int exp=129;
		int act= Numberfunction.getfactorial(5);
		assertEquals(exp, act);
	}
}
