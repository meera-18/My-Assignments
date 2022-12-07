package week2.day1;

import org.apache.poi.ss.formula.functions.Code;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meera");
       driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kanagaraj");
       driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mira");
       driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");       
       driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Automation Testing");   
       driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("meerakanagaraj@gmail.com");
       driver.findElement(By.className("smallSubmit")).click();
       String title = driver.getTitle();
       System.out.println(title);
       driver.findElement(By.className("subMenuButton")).click();
       
      
    WebElement code = driver.findElement(By.id("createLeadForm_companyName"));
       
       code.clear();
       code.sendKeys("javaSelenium");
       
       WebElement code1  = driver.findElement(By.id("createLeadForm_firstName"));
       
       code1.clear();
       code1.sendKeys("Maaya");
       
       driver.findElement(By.className("smallSubmit")).click();
       
       String title2 = driver.getTitle();
       System.out.println(title);
	}

}
