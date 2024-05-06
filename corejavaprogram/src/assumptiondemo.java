import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class assumptiondemo {
	@Test
	void testonassum() {
		int a=5, s=25;
		
		Assumptions.assumeTrue(s==a*a);
		System.out.println("it will display");
	}
	@Test
	void testonassumption() {
		int a=5, b=5;
		Assumptions.assumingThat(a==b , ()->{System.out.println("testing a==b");});
	}

}
