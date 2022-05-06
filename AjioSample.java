package week3.day2.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//div[@id='verticalsizegroupformat']")).click();
		driver.findElement(By.xpath("//label[@for='modal-Men - Fashion Bags']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		String totalCount = driver.findElement(By.xpath("//div[@class='filter']/div[@class='length']")).getText();
		System.out.println(totalCount);
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println("Size :" + bagBrandList.size());
		
		for(WebElement element:bagBrandList)
		{
			String text = element.getText();
			System.out.println(text);
		}
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		for(WebElement element:bagNameList)
		{
			String text = element.getText();
			System.out.println(text);
		}

	}

}
