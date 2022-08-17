package assignmentfb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Padmashini");
		driver.findElement(By.name("lastname")).sendKeys("kanan");
		driver.findElement(By.name("reg_email__")).sendKeys("padma1234@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("padma1234@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("66666666");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(day);
		dd1.selectByVisibleText("17");
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(month);
		dd2.selectByVisibleText("Aug");
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(year);
		dd3.selectByVisibleText("2000");
		driver.findElement(By.name("sex")).click();
	}
}
