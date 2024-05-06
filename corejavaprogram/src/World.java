import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class World {
	@Test
void display() {
	System.out.println("hello world");
}
	@RepeatedTest(3)
	void show() {
		System.out.println("welcome");
	}
}
