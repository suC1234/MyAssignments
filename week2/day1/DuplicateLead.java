package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/login");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Biggboss");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Biggboss Kamalahasan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Biggboss Kamalahasan Nayagan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Biggboss Kamalahasan Nayagan Ulaganayagan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Biggboss Kamalahasan Nayagan Ulaganayagan Vijaytv");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("It is the vijay Tv Program and it's entertainment program");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("susitharanj@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println("Title 1:"+title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Biggboss Season 6");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Biggboss Kamalahasan and susitharan");
		driver.findElement(By.name("submitButton")).click();
		
		String title1 = driver.getTitle();
		System.out.println("Title 2:"+title1);

		
		

		
		
		
		

	}

}
