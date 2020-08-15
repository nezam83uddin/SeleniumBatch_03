package Day_07;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_01_3 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Just we have taken data from table
		driver.get("file:///E:/SeleniumClass/SeleniumBatch_03_hw/Day_08/DynamicWebTable/DynamicWebTable.html");
		WebElement table = driver.findElement(By.id("dynamicTable"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		int count=0;
		ArrayList<DataClass> lists = new ArrayList<DataClass>();
		for (WebElement row : rows) {
			List<WebElement> col = row.findElements(By.tagName("td"));
			if (count!=0) {
				DataClass data = new DataClass();
				data.batchName=col.get(0).getText();
				data.studentName=col.get(1).getText();
				data.courseName=col.get(2).getText();
				lists.add(data);
			}
			count++;
		}
		
		// 2nd WebPage 
		for (DataClass myData : lists) {
			if (myData.studentName.equals("Ridoy")) {
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_03_hw/Day_08/DynamicWebTable/StudentData.html");
				driver.findElement(By.id("Student_Name")).sendKeys(myData.studentName);
				Thread.sleep(1000);
				driver.findElement(By.id("Course_Name")).sendKeys(myData.courseName);
				Thread.sleep(1000);
			}
			
		}
		
		
		// 3rd WebPage 
		for (DataClass verification : lists) {
			if (verification.studentName.equals("Ridoy")) {
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_03_hw/Day_08/DynamicWebTable/Element.html");
				driver.findElement(By.id("student_Name")).sendKeys(verification.studentName);
				Thread.sleep(1000);
			}
		}
		
		
	}
	
	
	
}
