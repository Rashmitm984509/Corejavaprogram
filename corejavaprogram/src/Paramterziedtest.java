import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Paramterziedtest {
@ParameterizedTest
@ValueSource(strings= {"call","bali","dali"})
void endswithI(String str) {
	assertTrue(str.endsWith("i"));
}
}
