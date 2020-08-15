package Day_07;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_01_1 {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		ArrayList<ArrayList<String>> r3 = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> r0 = new ArrayList<String>();
		r0.add("Batch");
		r0.add("Student");
		r0.add("Course");
		ArrayList<String> r1 = new ArrayList<String>();
		r1.add("SB_01");
		r1.add("Shohel");
		r1.add("Selenium");
		ArrayList<String> r2 = new ArrayList<String>();
		r2.add("SB_03");
		r2.add("Fahim");
		r2.add("Java");
		
		r3.add(r0);
		r3.add(r1);
		r3.add(r2);
		
		ArrayList<DataClass> lists = new ArrayList<DataClass>();
		for (ArrayList<String> row : r3) {
			row.get(0);
			DataClass data = new DataClass();
			data.batchName=row.get(0);
			data.studentName=row.get(1);
			data.courseName=row.get(2);
			lists.add(data);
			
		}
		
		int count=0;
		for (DataClass dataClass : lists) {
			if (count!=0) {
				driver.get("file:///E:/SeleniumClass/SeleniumBatch_03_hw/Day_08/DynamicWebTable/Element.html");
				driver.findElement(By.id("student_Name")).sendKeys(dataClass.studentName);
				Thread.sleep(2000);
			}
			
			count++;
		}
		
		
		
	}
}
