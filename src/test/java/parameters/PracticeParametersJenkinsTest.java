package parameters;

import org.testng.annotations.Test;

public class PracticeParametersJenkinsTest {
	@Test
	public void practiceParametersJenkinsTest()
	{
		String Browser = System.getProperty("browser");
		System.out.println(Browser);
	}

}
