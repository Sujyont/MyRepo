package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldtimezone.com/time/wtzstandard.php?listsw=capitals&sorttb=CountryID&forma=24h");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement table = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr/td[1]/center/table"));
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	
	for(int r=0;r<rows.size();r++) {
		List<WebElement> cols = rows.get(r).findElements(By.tagName("td"));
		for(int c=0;c<cols.size();c++) {
			String data = cols.get(c).getText();
			System.out.println(data);
		}
	}
	driver.close();
	}

}
