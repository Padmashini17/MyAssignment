package assignmentlead;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Padmashini");
		driver.findElement(By.id("lastNameField")).sendKeys("K");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Padmashini");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Software testing class is very useeful");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("padma123@gmail.com");
		WebElement createContactForm_generalStateProvinceGeoId= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(createContactForm_generalStateProvinceGeoId);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("yyyy");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
}
}
