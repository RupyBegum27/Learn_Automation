package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class FaceBook {


    public static void main(String[] args) throws InterruptedException {


        String chromeDvPath = "BrowserDrivers\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDvPath);
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://www.facebook.com/");


      Driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("rubyautomation2021@yahoo.com");
       Thread.sleep(5000);
      Driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ruby12345$");
      Thread.sleep(5000);
      Driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
      Thread.sleep(500);

//      String expectedRe=("Ruby");
//      String actualRe=Driver.findElement(By.xpath("//*[@id=\"mount_0_0_KI\"]/div/div[1]/div/div[2]/div[4]/div[1]/div[4]/a/span/span")).getText();
//       if (expectedRe.equalsIgnoreCase(actualRe)){
//           System.out.println("FaceBook log display");
//       }else{
//           System.out.println("FaceBook log didn't display");
//       }
//
      Driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("Marketplace");
    //  Driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).click();
      //Driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/span/h1/span")).sendKeys("Face Mask");
     // Driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div/div/div/div/span/h1/span")).click();


    }



}
