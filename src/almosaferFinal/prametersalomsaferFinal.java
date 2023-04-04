package almosaferFinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class prametersalomsaferFinal {
		WebDriver driver =new ChromeDriver();
		SoftAssert myassertion =new SoftAssert();

		@BeforeTest 
		public void open_site(){
			
	
			
		}
		
		@AfterTest
		public void close_browser() {
		//	driver.close();
		}



}
