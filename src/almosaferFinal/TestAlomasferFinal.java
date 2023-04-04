package almosaferFinal;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestAlomasferFinal extends prametersalomsaferFinal {

	@Test( priority = 4)
	public void test_site_EN_or_AR() {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

       
        driver = new ChromeDriver(option);
		String Url[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };

		Random rand_num = new Random();

		int Url_Num = rand_num.nextInt(0, 2);

		driver.get(Url[Url_Num]);

		String actule_result = driver.getTitle();

		if (Url_Num == 0) {
			myassertion.assertEquals(actule_result, "Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking");
		} else {
			myassertion.assertEquals(actule_result, "المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
		}

		myassertion.assertAll();
	}
//
//	@Test( priority = 3)
//	public void Test_currency_SAR() {
//		String Url[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//
//		Random rand_num = new Random();
//
//		int Url_Num = rand_num.nextInt(0, 2);
//
//		driver.get(Url[Url_Num]);
//
//		WebElement carrnecy_web_sit = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
//
//		String actule = carrnecy_web_sit.getText();
//
//		myassertion.assertEquals(actule, "SAR");
//		myassertion.assertAll();
//
//	}
//
//	@Test( priority = 2)
//	public void test_qitaf_logo() {
//		String Url[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//
//		Random rand_num = new Random();
//
//		int Url_Num = rand_num.nextInt(0, 2);
//
//		driver.get(Url[Url_Num]);
////وصلت الى ديف بعدها عملت ليست ل اي اشي داخل ديف 
//		WebElement div_qitaf_logo = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]"));
//
//		List<WebElement> my_div = div_qitaf_logo.findElements(By.tagName("svg"));
//
//		String Actule_qitaf = my_div.get(0).getAttribute("data-testid");
//		myassertion.assertEquals(Actule_qitaf, "Footer__QitafLogo");
//		myassertion.assertAll();
//	}
//
//	@Test(priority = 1)
//	public void Test_vis_logo() {
//		String Url[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//
//		Random rand_num = new Random();
//
//		int Url_Num = rand_num.nextInt(0, 2);
//
//		driver.get(Url[Url_Num]);
//
//		WebElement div_visa = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]"));
//		List<WebElement> visa_log = div_visa.findElements(By.tagName("svg"));
//		System.out.println(visa_log.size());
//		String expected_result_visa = "Footer__VisaCardLogo";
//		int actualIndex = -1;
//
//		for (int i = 0; i < visa_log.size(); i++) {
//			if (visa_log.get(i).getAttribute("data-testid").equalsIgnoreCase(expected_result_visa)) {
//
//				actualIndex = i;
//			}
//		}
//		System.out.println(actualIndex);
//
//		for (int i = 0; i < visa_log.size(); i++) {
//
//			System.out.println(visa_log.get(i).getAttribute("data-testid"));
//		}
//
//		myassertion.assertEquals(visa_log.get(actualIndex).getAttribute("data-testid"), expected_result_visa);
//		myassertion.assertAll();
//	}
//
//	@Test(priority = 1)
//	public void get_all_image() {
//		List<WebElement> src_image = driver.findElements(By.tagName("img"));
//		for (int i = 0; i < src_image.size(); i++) {
//
//			System.out.println("#" + (i + 1) + src_image.get(i).getAttribute("src"));
//
//		}
//	}
//
//	@Test(priority = 9)
//	public void hotel_tabe_is_not_selected() {
//		String Url[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//
//		Random rand_num = new Random();
//
//		int Url_Num = rand_num.nextInt(0, 2);
//
//		driver.get(Url[Url_Num]);
//		WebElement hotel_tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//
//		String is_selected = hotel_tab.getAttribute("aria-selected");
//
//		String ecpected_result = "false";
//
//		myassertion.assertEquals(is_selected, ecpected_result);
//
//		myassertion.assertAll();
//
//	}
//
//	@Test(priority = 50)
//	public void loction_falid() {
//		String Url[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//
//		String[] en_cities = { "Dubai", "Jeddah", "Riyadh" };
//
//		String[] ab_cities = { "دبي", "جدة"};
//
//		Random rand_num = new Random();
//
//		int Url_Num = rand_num.nextInt(2);
//		
//		int en_num =rand_num.nextInt(3);
//		
//		int ab_num =rand_num.nextInt(2);
//		driver.get(Url[Url_Num]);
//
//		if (Url_Num == 0) {
//		
//			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(en_cities[en_num]);
//
//		}else 
//		{
//			driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input")).sendKeys(ab_cities[ab_num]);
//		}
//
//	}
}

//
//switch (Expected_result_visa) {
//case "Footer__AmericanExpressCardLogo":
//myassertion.assertEquals(visa_log.get(2).getAttribute("data-testid"), Expected_result_visa);
//myassertion.assertAll();
//	break;
//
//case "Footer__MasterCardLogo":
//	myassertion.assertEquals(visa_log.get(2).getAttribute("data-testid"), Expected_result_visa);
//	myassertion.assertAll();
//	break;
//case "Footer__MadaCardLogo":
//	myassertion.assertEquals(visa_log.get(2).getAttribute("data-testid"), Expected_result_visa);
//	myassertion.assertAll();
//	break;
//	
//case "Footer__VisaCardLogo":
//	myassertion.assertEquals(visa_log.get(2).getAttribute("data-testid"), Expected_result_visa);
//	myassertion.assertAll();
//	break;
//	
//default:
//	break;
//}