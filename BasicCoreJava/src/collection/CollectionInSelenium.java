package collection;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionInSelenium 
{
	public static void main(String[] args)
	{
		ChromeDriver dr=new ChromeDriver();
		List<WebElement> elements=dr.findElements(By.xpath(""));
		Set<String> wins=dr.getWindowHandles();
	}

}
