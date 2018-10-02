package san2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("file:///D:/Sujyont/My%20Docs/GyanS/My%20testing.html");
	driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[1]")).click();
	
	Alert a1 = driver.switchTo().alert();
	System.out.println(a1.getText());
	Thread.sleep(10000);
	a1.accept();
	
	driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/button[2]")).click();
	Alert a2 = driver.switchTo().alert();
	Thread.sleep(10000);
	a2.sendKeys("This is Sujyont");
	Thread.sleep(10000);
	a2.accept();
	
	
	
	
	

	}

}
