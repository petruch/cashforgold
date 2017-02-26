import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test1 {
  @Test
  if (driver.getTitle().contains("Cash for gold Toronto – Toronto jewellery buyers")){
	  System.out.println("Welcome To Cash");
  }
  else {
	  System.out.println("wrong Url" + driver.getTitle());			  
  }


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

WebElement element1 = driver.findElement(By.id("menu-item-2891"));
org.openqa.selenium.Dimension dimensions = element1.getSize();
System.out.println("Height :" + dimensions.height + " Width : "+ dimensions.width);

  
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://cashforgold.to");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit()
  }

}
