import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		String result = App.test();
		assertEquals("ok", result);
	}

}
