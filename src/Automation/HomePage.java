package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {


    public static void main(String[] args) throws InterruptedException {

        // set up browser
        // navigate to url
        // WebDriver driver;
      //  String chromeDriverPath="BrowserDrivers\\windows\\chromedriver.exe";
      //  System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("https://www.amazon.com/");
        //Thread.sleep(5000);
       // driver.get("https://yahoo.com/");
        //driver.navigate().back();



        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Hand Sanitizer");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();



        //verify expected result and actual result match
        String expectedResult="\"hand sanitizer\"";
        String actualResult=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();

        if (expectedResult.equalsIgnoreCase(actualResult)){
            System.out.println("test pass");

        }else{
            System.out.println("test fail");
        }

       String expectedResult1="Amazon.com : Hand Sanitizer";
        String actualResult1=driver.getTitle();
      if (expectedResult1.equalsIgnoreCase(actualResult1)){
          System.out.println("test title pass");
      }else{
          System.out.println("test title fail");
      }
     Thread.sleep(500);
      String expectedResult2="PURELL Advanced Hand Sanitizer Soothing Gel, Fresh scent, with Aloe and Vitamin E , 8 Fl Oz Pump Bottle (Pack of 4)";

      String actualResult2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/span/div/div/div[2]/div[1]/h2/a/span")).getText();
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/span/div/div/div[2]/div[1]/h2/a/span")).click();

        if (expectedResult2.equalsIgnoreCase(actualResult2)){
            System.out.println("second test pass");
        }else{
            System.out.println("second test fail");
        }



       //  driver.close();






    }

}
