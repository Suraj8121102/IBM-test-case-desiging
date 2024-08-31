package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://ui.vision/demo/webtest/frames/");
driver.manage().window().maximize();

//frame1
WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
driver.switchTo().frame(frame1);

driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Welcome");

driver.switchTo().defaultContent();

//frame2
WebElement frame2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
driver.switchTo().frame(frame2);

driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Selenium");
driver.switchTo().defaultContent();

//frame3
WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
driver.switchTo().frame(frame3);
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Java");
//driver.switchTo().defaultContent(); //iframe present in 3 frame

//iframe
//WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true\"]"));
driver.switchTo().frame(0);// one iframe present
driver.findElement(By.xpath("(//div[@class=\"AB7Lab Id5V1\"])[2]")).click();
//driver.findElement(By.xpath("//input[@type=\\\"text\\\"]")).sendKeys("Suraj");
driver.switchTo().defaultContent();

//frame4
WebElement frame4 = driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
driver.switchTo().frame(frame4);
driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Suraj Sneha");
	}

	
}
