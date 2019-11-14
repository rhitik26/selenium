package Main;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class One {
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter browser code:");
	String browser=sc.next();
	if(browser.equalsIgnoreCase("ff")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	driver.get("https://www.google.com/");
	String title;
	title=driver.getTitle();
	if(title.equalsIgnoreCase("google")) {
		System.out.println("Pass");
	}
	else
		System.out.println("Fail");
//	System.out.println(title);
	driver.close();}
	else if(browser.equalsIgnoreCase("gc")){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium/chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("http://www.youcandealwithit.com/");
//		List<WebElement>l= driver2.findElements(By.tagName("a"));
//		for(int i=0;i<l.size();i++) {
//			if(l.get(i).getText().equalsIgnoreCase("gmail")) {
////				System.out.println(l.get(i).getText()+"---->"+l.get(i).getAttribute("href"));
//				l.get(i).click();
//				break;
//			}
//		}
//		driver2.close();
//		driver2.findElement(By.id("search")).sendKeys("Shahrukh");
//		driver2.findElement(By.id("search-icon-legacy")).click();
//		Thread.sleep(2000);
//		driver2.findElement(By.id("video-title")).click();
//		Thread.sleep(4000);
//		String title;
//		title=driver2.getTitle();
//		driver2.findElement(By.xpath("//nav[@id='site-nav']/ul/li[4]/a")).click();
//		driver2.findElement(By.linkText("Certifications")).click();
//		driver2.findElement(By.xpath("//ul[@class='sub-menu']/li[3]/a")).click();
		Actions act=new Actions(driver2);
		act.moveToElement(driver2.findElement(By.linkText("BORROWERS"))).build().perform();
		driver2.findElement(By.xpath("//ul[@id='siteNav']/li[1]/ul/li[5]/a")).click();
		Thread.sleep(2000);
	driver2.findElement(By.linkText("Calculators")).click();
		Thread.sleep(2000);
		driver2.findElement(By.linkText("Budget Calculator")).click();
		Thread.sleep(2000);
		driver2.findElement(By.id("food")).sendKeys("2000");
		driver2.findElement(By.id("clothing")).sendKeys("1000");
		driver2.findElement(By.id("shelter")).sendKeys("3000");
		driver2.findElement(By.id("monthlyPay")).sendKeys("30000");
		WebElement t=driver2.findElement(By.id("underOverBudget"));
////		String txt=t.getText();
		Thread.sleep(5000);
		System.out.println("Printing " + t.getAttribute("value"));
//		driver2.get("https://www.google.com");
//		driver2.findElement(By.name("q")).sendKeys("Bigil");
//	Thread.sleep(2000);
//		driver2.findElement(By.className("gNO89b")).click();
//		driver2.findElement(By.cssSelector(".q.qs")).click();
//		driver2.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a")).click();
//		Thread.sleep(2000);
//////		System.out.println(title);
//	driver2.findElement(By.xpath("//a[@class='gb_ce gb_3 gb_rb']")).click();
//		Thread.sleep(2000);
		driver2.close();
//	    System.out.println("Result:"+txt2);	
	}
	
}
}
