import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Hello {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Anil\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, 400, 10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='jriTop_signin9']")).click();
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("Anil.Shirole.jy@gmail.com");
		driver.findElement(By.xpath(".//*[@id='txtPasswd']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='imgbtnSignin']")).click();
		
		driver.findElement(By.xpath("//*[@id='listingtable_ImgRecharge_1']")).click();
		String parentWin= driver.getWindowHandle();
		driver.findElement(By.linkText("View Popular Recharges")).click();
		
		for(String win : driver.getWindowHandles()){
			driver.switchTo().window(win);
			if(driver.getCurrentUrl().contains("JRIPopularRecharges.aspx")){
				driver.findElement(By.linkText("296")).click();
			}
		}
		driver.switchTo().window(parentWin);
		
		driver.findElement(By.xpath("//*[@id='btnProceedtoPay']")).click();
		
	}
}
