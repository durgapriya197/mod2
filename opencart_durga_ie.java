package opencart_durga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class opencart_durga_ie {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.ie.driver","D:/ieDriverserver.exe");
			
			WebDriver driver=new InternetExplorerDriver();
			
			String baseurl="http://demo.opencart.com";
			
			driver.get(baseurl);
			
			 if(driver.getTitle().contentEquals("Your Store"))
			    {
			    	System.out.println("Title Verified");
			    }
			    else
			    {
			    	System.out.println("Title Not Verified");
			    }
			    
			    Thread.sleep(1000);
			   			    
			    driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/span[2]")).click();
			    driver.findElement(By.linkText("Register")).click();
			    
			    driver.findElement(By.id("input-email")).sendKeys("durga@gmail.com");
			    driver.findElement(By.id("input-telephone")).clear();
			    driver.findElement(By.id("input-telephone")).sendKeys("9988775544");

			    Thread.sleep(2000);
			    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			    

			    

			    
			    if(driver.findElement(By.cssSelector("div.text-danger")).getText().contentEquals("First Name must be between 1 and 32 characters!"))
			    {
			    	System.out.println("First Name Verified");
			    }
			    else
			    {
			    	System.out.println("'First Name not verified");
			    }
			    
			    if(driver.findElement(By.xpath("//fieldset[@id='account']/div[3]/div/div")).getText().contentEquals("Last Name must be between 1 and 32 characters!"))
			    {
			    	System.out.println("'Last Name is Verified");
			    }
			    else
			    {
			    	System.out.println("'Last Name not verified");
			    }
			    
			    driver.findElement(By.id("input-password")).clear();
			    driver.findElement(By.id("input-password")).sendKeys("durga123");
			    driver.findElement(By.id("input-confirm")).clear();
			    driver.findElement(By.id("input-confirm")).sendKeys("durga");
			    Thread.sleep(2000);
			    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			    
			    if(driver.findElement(By.xpath("//div[@id='content']/form/fieldset[2]/div[2]/div/div")).getText().contentEquals("Password confirmation does not match password!"))
			    {
			    	System.out.println("'Passwords' Verified");
			    }
			    else
			    {
			    	System.out.println("'Passwords' Not Verified");
			    }
			    
			    driver.findElement(By.id("input-firstname")).clear();
			    driver.findElement(By.id("input-firstname")).sendKeys("Durga");
			    driver.findElement(By.id("input-lastname")).clear();
			    driver.findElement(By.id("input-lastname")).sendKeys("Priya");
			    driver.findElement(By.id("input-confirm")).clear();
			    driver.findElement(By.id("input-confirm")).sendKeys("durga123");
			    
			    driver.findElement(By.name("newsletter")).click();
			    driver.findElement(By.xpath("(//input[@name='newsletter'])[2]")).click();
			    driver.findElement(By.name("agree")).click();
			    
			    Thread.sleep(2000);
			    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			    
			    Thread.sleep(2500);
			    
			    if(driver.findElement(By.cssSelector("#content > h1")).getText().contentEquals("Your Account Has Been Created!"))
			    {
			    	System.out.println("Email Verified");
			    	System.out.println("Message verified");
			    }
			    else
			    {
			    	System.out.println("Message not verified");
			    }
			    
			    driver.findElement(By.linkText("Phones & PDAs")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.cssSelector("div.image > a > img.img-responsive")).click();

			    if(driver.findElement(By.cssSelector("div.col-sm-4 > h1")).getText().contentEquals("HTC Touch HD"))
			    {
			    	System.out.println("Text Verified");
			    }
			    else
			    {
			    	System.out.println("Text not Verified");
			    }
			    Thread.sleep(1000);
			    driver.navigate().back();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
			    
			    Thread.sleep(3000);
			    if(driver.findElement(By.xpath("//div[@id='product-category']/div")).getText().contentEquals("Success: You have added HTC Touch HD to your shopping cart!\n×"))
			    {
			    	System.out.println("Text Verified");
			    }
			    else
			    {
			    	System.out.println("Text not Verified");
			    }
			    	    
			    driver.findElement(By.linkText("Brands")).click();
			    if(driver.getTitle().contentEquals("Find Your Favorite Brand"))
			    {
			    	System.out.println("Title Verified");
			    }
			    else
			    {
			    	System.out.println("Title not Verified");
			    }
			    
			    
			    driver.findElement(By.linkText("Canon")).click();
			    if(driver.findElement(By.cssSelector("h2")).getText().contentEquals("Canon"))
			    {
			    	System.out.println("Heading Verified");
			    }
			    else
			    {
			    	System.out.println("Heading Not Verified");
			    }

			    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
			    
			    if(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText().contentEquals("Success: You have added Canon EOS 5D to your wish list!\n×"))
			    {
			    	System.out.println("Text Verified");
			    }
			    else if(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText().contentEquals("You must login or create an account to save Canon EOS 5D to your wish list!\n×"))
			    {
			    	System.out.println("Text Verified");
			    }
			    else
			    {
			    	System.out.println("Text not Verified");
			    }
			    
			    driver.findElement(By.linkText("Wish List")).click(); 
			    WebDriverWait wait = new WebDriverWait(driver, 10);
			    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Continue")));
			    driver.findElement(By.linkText("Continue")).click();
			    driver.close();
			    System.out.println("Browser Closed.");
		}

	}


