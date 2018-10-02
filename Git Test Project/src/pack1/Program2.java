package pack1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		//driver.getWindowHandles();
		driver.switchTo().window("");
		driver.switchTo().frame("");
		driver.switchTo().alert();
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		
		
		
		driver.close();
		//driver.quit();
	}

}
