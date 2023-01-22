package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static void main(String[] args) {
		
		//Open Chrome browser
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/main");
		//maximize browser 
		driver.manage().window().maximize();
		//Enter the user name
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kekran Magron");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Trump");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Donald");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("testing");
		
		driver.findElement(By.name("submitButton")).click();
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		
		if(firstName.equalsIgnoreCase("Trumputu"))
		{
			System.out.println("First name is correct");
		
		}
		else {
			System.out.println("First name is Incorrect");
			
			
		}
		
		
	}

}
