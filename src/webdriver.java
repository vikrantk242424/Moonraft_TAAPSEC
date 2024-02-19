import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webdriver {

	public static void main(String[] args) throws InterruptedException {

		// Chrome Launch Chormedriver

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// print the links count in the Page

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		int linkCountOnPage1 = driver.findElements(By.tagName("a")).size();

		int linkCountOnPage2 = driver.findElements(By.xpath("//a")).size();

		System.out.println(linkCountOnPage1);

		System.out.println(linkCountOnPage2);

		// limiting scope of webdriver

		// print the links count in footer

		WebElement footer_Driver = driver.findElement(By.xpath("//footer[@id='footer-part']")); // save footer
																								// webelement
																								// in footerdriver
																								// variable

		int link_Count_Footer = footer_Driver.findElements(By.xpath("//a")).size(); // limiting webdriver scope to
																					// footer
																					// only

		System.out.println(link_Count_Footer);

		// print link in discount section of footer

		WebElement section1_Footer_Driver = footer_Driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul "));

		int link_Count_Section1_Footer_Driver = section1_Footer_Driver.findElements(By.xpath("//a")).size();

		System.out.println(link_Count_Section1_Footer_Driver);

		// clcik on each link of section1 and verify pages are opening
		//To open each link in seperate tab/window

		for (int i = 1; i <= link_Count_Section1_Footer_Driver; i++) {

			String click_To_Open_Link_IN_New_Tab = Keys.chord(Keys.CONTROL, Keys.ENTER);    // to open link in new tab
																							// press ctrl + click(enter)

			section1_Footer_Driver.findElements(By.xpath("//a")).get(i).sendKeys(click_To_Open_Link_IN_New_Tab);

		}

		// To get tiltle of all open window/tab     

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> index = windows.iterator();

		while (index.hasNext()) {

			String requiredWindow = index.next();

			driver.switchTo().window(requiredWindow);

			String requiredTitle = driver.getTitle();

			System.out.println(requiredTitle);

		}
		
	
	
		
		//Handling calendar UI in Travel websites
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		// Frames

		// driver.get("https://jqueryui.com/droppable/");

		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		// System.out.println(driver.findElements(By.tagName("iframe")).size());

		// System.out.println(driver.findElements(By.xpath("//iframe")).size());

		// driver.switchTo().frame(0);

		// Actions act = new Actions(driver);

		// WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

		// WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		// act.dragAndDrop(source, target).build().perform();

		// driver.switchTo().defaultContent();

		// driver.switchTo().frame(0);

		// driver.switchTo().frame("id");

		// windows handle

		// Set<String> windows = driver.getWindowHandles(); // get open windows id
		// parent,child

		// Iterator<String> id = windows.iterator(); // use iterator method to get ids
		// of windows

		// String parentId = id.next(); // 1st next() will give 0th index window id i.e
		// parent, save it in a variable

		// String childId = id.next(); // 2nd next() will give 1st index window id i.e
		// child

		// driver.switchTo().window(childId); //switchTo window

		// String emailId =
		// driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("
		// ")[0];

		// driver.switchTo().window(parentId);

		// Please email us at mentor@rahulshettyacademy.com with below template to
		// receive response

		// To get emailId from this text and send it to username tab on parent window

		// driver.findElement(By.xpath("")).sendKeys(emailId);

		// WebElement userName =
		// driver.findElement(By.xpath("//input[@id='username']"));

		// userName.sendKeys(emailId);

		// implicitWait

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 1st way

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // 2nd way

		// explicitWait

		// WebDriverWait w =new WebDriverWait(driver,5);

		// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		// Actions Class

		// driver.get("https://www.amazon.in/");

		// Actions act = new Actions(driver);

		// act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2
		// ']"))).build().perform();

		// WebElement move = driver.findElement(By.xpath("//span[@class='nav-line-2
		// ']"));

		// act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

		// act.moveToElement(move).contextClick().build().perform();

		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// String productName = driver.findElement(By.xpath("//h4[text()='Cucumber - 1
		// Kg']")).getText();

		// System.out.println(productName);

		// driver.findElement(By.xpath("(//a[@class='increment'])[3]")).click();

		// driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[3]")).click();

		// div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']

		// driver.get("https://www.spicejet.com/");

		// driver.findElement(By.xpath("(//div[@class='css-1dbjc4n
		// r-zso239'])[2]")).click(); // click round trip radio button

		// Thread.sleep(3000);

		// driver.findElement(By.xpath("(//div[@class='css-1dbjc4n
		// r-zso239'])[1]")).click(); // // click oneway trip radio button

		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// driver.findElement(By.xpath("//button[@type='button'][1]")).click();

		// Thread.sleep(2000);

		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

		// driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		// driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected();

		// Thread.sleep(2000);

		// Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		// driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		// Thread.sleep(2000);

		// Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		// to get count of checkbox

		// System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),
		// 3);

		// driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-hover"));

		// String s1 = driver.getTitle();

		// System.out.println(driver.getTitle());

		// System.out.println(s1);

		// driver.close();

		// driver.quit();

		// firefox Launch GeckoDriver

		// WebDriver driver1 = new FirefoxDriver();

		// driver1.get("https://www.amazon.in/");

		// WebDriver driver = new EdgeDriver();

		// driver.get("https://www.amazon.in/");

		// int R = 80;

		// System.out.println("resutlt = " +R);

		// int[] arr1 = new int[3];

		// arr1[0]=10;
		// arr1[1]=20;
		// arr1[2]=30;

		// int[] arr2 = {100,200,300,400,500};

		// System.out.println("from array 1 "+arr1[0]);

		// System.out.println("from array 2 "+ arr2[4]);

		// for(int i=0;i<arr2.length;i++)
		//
		// {
		// System.out.println(arr2[i]);
		// }

		// String[] name = {"nidhubai", "priyanka","kasle","kotwade"};

		// String[] city =new String[2];

		// city[0]="latur";
		// city[1]="Pune";

		// System.out.println(name[0]);

		// System.out.println(city[1]);
		//
		// for(int i=0;i<name.length;i++) {

		// System.out.println(name[i]);
		// }

		// alternate way to define for loop

		// for(String s:name) {

		// System.out.println(s);
		// }

		// for(int no:arr2) {

		// System.out.println(no);
//}

		// int[] ar = {1,2,3,4,5,6,7,8,9,10};

		// to find array has a multile of 2

		// for(int i=0;i<ar.length;i++) {

		// if(ar[i]%2 ==0) {

		// System.out.println("no.multiple of 2 is = "+ar[i]);

		// break; // use when we want to exit for loop , after condtion is satisfied for
		// the 1st time

		// }

		// else {

		// System.out.println("no. is not multiple of 2 = "+ar[i]);
		// }

		// }

//		ArrayList<String> al = new ArrayList<>();

//		al.add("Nidhubai");
//		al.add("Priyanka");
//		al.add("Vikrant");
//		al.add("abcd");

//		al.get(0);
		// al.remove(3);

		// System.out.println(al.get(0));

		// for(int i=0; i<al.size();i++) {

		// System.out.println(al.get(i));

		// }

		// System.out.println("****************");

		// for(String a:al) {

		// System.out.println(a);

		// }

		// System.out.println(al.contains("Nidhubai"));

		// to convert normal Array to ArrayList

		// String[] name1 = new String[3];

		// name1[0]="nidhi";
		// name1[1]="priyanka";
		// name1[2]="Kasle";

		// List<String> newarraylist = Arrays.asList(name1);

		// System.out.println(newarraylist.contains("nidhi"));

		// String[] splitedstring= s.split("satish");

		// splitedstring[1].trim();

		// System.out.println(splitedstring[1].trim());

		// for(int i=0; i<splitedstring.length;i++) {

		// System.out.println(splitedstring[i]);
		// }

		// String s = "Priyanka satish Kasle";

		// for(int i=0; i<s.length();i++) {

		// System.out.println(s.charAt(i));

		// }

		// String s = "PriyankasatishKasle";

//	for(int i=s.length();i<s.length()-1;i--) {

		// System.out.println(s.charAt(i));

		// }

		// for(int i=s.length()-1;i>=0;i--) {

		// System.out.println(s.charAt(i));

//	}		

		// String s1 = "vikrant janardhan kotwade";

		// for(int i=0;i<s1.length();i++) {

		// System.out.println(s1.charAt(i));

		// }

		// for(int i=s1.length()-1;i>=0;i--) {

		// System.out.println(s1.charAt(i));
		// }

		// webdriver d = new webdriver();

		// String name = d.getdata();

		// System.out.println(name);

//}

		// public String getdata() {

		// System.out.println("hello world");
		// return "vikrant";

		// WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// driver.get("https://www.amazon.in/");
		// driver.findElement(By.id("inputUsername")).sendKeys("Priyanka");
		// driver.findElement(By.name("inputPassword")).sendKeys("kasle");

		// driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("rahul");

		// driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");

		// driver.findElement(By.xpath("//div/from/h1")).getText();

		// driver.findElement(By.linkText("Forgot your password?")).click();

		// Thread.sleep(1000);

		// driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

		// String actualtext = "vikrant";

		// String s1 = "username";

		// String expectedtext ="vikrant"+s1+",";

		// Assert.assertEquals(actualtext, expectedtext);

	

}
	
}
