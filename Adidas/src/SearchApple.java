import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchApple {

	public static void main(String[] args) {
		String vExp = "A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.";
		String vAct = "";
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wiktionary.org/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("bodySearchInput0.801879694845")).sendKeys("pear");
		driver.findElement(By.name("go")).click();
		
		//vAct = driver.findElement(By.xpath("//div[@id='mw-content-text']//ol/li[1]")).getText().trim();
		
		
		System.out.println(vAct);
		if(vAct.contains(vExp)){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}

}
