package packge1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   // to be able to use Chrome browser

		   WebDriver driver = new ChromeDriver();         
				 
		   driver.get("http://cashforgold.to");

		   driver.manage().window().maximize();
		   // to maximize window size
		   
		   if (driver.getTitle().contains("Cash for gold Toronto – Toronto jewellery buyers")){
					  System.out.println("Welcome To Cash");
				  }
				  else {
					  System.out.println("wrong Url" + driver.getTitle());			  
				  }
		   // button testing home page
		 
		   // menu items
		   //driver.findElement(By.className("mobile_menu_control icon-menu-outline")).click();
		   //TimeUnit.SECONDS.sleep(2);
		   
		   // home menu items check if the link works
		   // what we buy 
		   driver.findElement(By.id("menu-item-2889")).click();
		   if (driver.getTitle().contains("What we buy at Cashforgold.TO – Cash for gold Toronto")){
			   System.out.println("What we buy at Cashforgold.TO – Cash for gold Toronto " + "Loaded");
		   }
		   else {
			   System.out.println(driver.getTitle() + "Loaded");
		   }
		   
		   driver.navigate().back();
		   // what we pay
		   driver.findElement(By.id("menu-item-2890")).click();
		   if (driver.getTitle().contains("What we pay for gold in Toronto – Cash for gold Toronto")){
			   System.out.println("What we pay for gold in Toronto – Cash for gold Toronto " + "Loaded");
		   }
		   else {
			   System.out.println(driver.getTitle() + "Loaded");
		   }
		   driver.navigate().back();
		   
		   // make money button
		   driver.findElement(By.id("menu-item-2892")).click();
		   if (driver.getTitle().contains("Gold party in Toronto – Cash for gold Toronto")){
			   System.out.println("Gold party in Toronto – Cash for gold Toronto " + "Loaded");
		   }
		   else {
			   System.out.println(driver.getTitle() + "Loaded");
		   }
		   driver.navigate().back();
		   
		   // gold purity button
		   driver.findElement(By.id("menu-item-2888")).click();
		   if (driver.getTitle().contains("Understanding Gold Karats – Purity of Gold – Cash for gold Toronto")){
			   System.out.println("Understanding Gold Karats – Purity of Gold – Cash for gold Toronto " + "Loaded");
		   }
		   else {
			   System.out.println(driver.getTitle() + "Loaded");
		   }
		   driver.navigate().back();
		   
	
		   
		// blog button
		   driver.findElement(By.id("menu-item-2893")).click();
		   if (driver.getTitle().contains("Cashforgold.TO Blog – Cash for gold Toronto")){
			   System.out.println("Cashforgold.TO Blog – Cash for gold Toronto " + "Loaded");
		   }
		   else {
			   System.out.println(driver.getTitle() + "Loaded");
		   }
		   driver.navigate().back();
		   
		// About us button
		   driver.findElement(By.id("menu-item-2891")).click();
		   if (driver.getTitle().contains("About Cashforgold.TO – Cash for gold Toronto")){
			   System.out.println("About Cashforgold.TO – Cash for gold Toronto " + "Loaded");
		   }
		   else {
			   System.out.println(driver.getTitle() + "Loaded");
		   }
		   driver.navigate().back();
		   
		   
		   //checks if the elements are enabled  on the webpage
		   WebElement element = driver.findElement(By.cssSelector("*"));
		   boolean status = element.isEnabled();
		   if(status) {
			   
			   ("Very nice!");
			   
		   }
		   
		   

		   /*driver.findElement(By.id("Email")).sendKeys("hello.world@gmail.com");
		   			  		  
		   driver.findElement(By.id("next")).click();
		   
		   TimeUnit.SECONDS.sleep(2);
		   
		   //driver.findElement(By.id("signIn")).click();
		   
		   driver.findElement(By.id("Passwd")).sendKeys("Happy");
		   TimeUnit.SECONDS.sleep(2);

		   
		   driver.findElement(By.id("signIn")).click();
		   TimeUnit.SECONDS.sleep(2);
		   
		   
		   //driver.findElement(By.xpath("//*[@id=gbw]/div/div/div[2]/div[4]/div[1]/a/span")).click();
		   //driver.findElement(By.id("gb_71")).click();

		  
		   
		   //if (driver.getCurrentUrl().contains("https://www.google.ca/?gfe_rd=cr&ei=c9pQWMOvIMiC8Qes9Yi4CA&gws_rd=ssl")){
		   //System.out.println(driver.getCurrentUrl());
		  
		   //signIn
		  
		   String actualUrl = driver.getCurrentUrl();
		   String title = driver.getTitle();
		   int titleLength = driver.getTitle().length();
		   String url = "www.google.com";
		   if (actualUrl.equals(url)){
				System.out.println("Verification Successful - The correct Url is opened.");
			}else{
				System.out.println("Verification Failed - An incorrect Url is opened.");
				System.out.println("Actual URL is : " + actualUrl);
				System.out.println("Expected URL is : " + url);
			}
		   
		   System.out.println("Title of the page is : " + title);
		   System.out.println("Length of the title is : "+ titleLength);
		   */
	
		  		   
		   driver.close();
		   
		
	}

}
