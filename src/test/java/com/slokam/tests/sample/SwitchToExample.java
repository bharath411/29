package com.slokam.tests.sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToExample {

	
	
	public void test1() {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_classes\\jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String titleOfmain = driver.getTitle();
		System.out.println(titleOfmain);
		
		String mainHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		for (String handle : handles) {
			if(!mainHandle.equals(handle)) {
				driver.switchTo().window(handle);
				String titleOfChild = driver.getTitle();
				System.out.println(titleOfChild);
				driver.close();
			}
		}
		
		
		driver.switchTo().window(mainHandle);
	}
	
	
	public void jquery() {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_classes\\jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination  = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		
	}
	
	public void setEx() {
		HashSet<String> set = new HashSet<String>();
		set.add("Bharath");
		set.add("Kumar");
		set.add("asdasd");
		set.add("zdfr");
		System.out.println(set.size());
		
		// Foreach 
		 for(String st : set) {
			 System.out.println(st);
		 }
		 
		 Iterator<String> it = set.iterator();
		
		 while(it.hasNext()) {
			 String  st  = it.next();
			 System.out.println(st);
		 }
		 
		 
	}
	
	public static void main(String[] args) {
		SwitchToExample sw = new SwitchToExample();
		sw.jquery();
	}
}
