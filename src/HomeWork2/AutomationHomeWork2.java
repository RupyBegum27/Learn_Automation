package HomeWork2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AutomationHomeWork2 {

    WebDriver driver;

    @BeforeMethod
//1) setting the browser
    public void SetBrowser() {
        String chromeDriverPath = "BrowserDrivers\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com");
    }

   @Test
    //2) Verify  HomePage title
    public void testCase2() throws InterruptedException {
        String expectedResult = "jQuery UI";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "the test fail");
    }


    @Test
    //3)click on Demos,
    //4) click on Button
    //5)verify the text on button
    public void testCast3() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[3]/a")).click();
       String expectedResult2= "Want to learn more about the button widget? Check out the API documentation.";
       String actualResult2=driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).getText();
       Assert.assertEquals(actualResult2,expectedResult2,"test button case fail");
                Thread.sleep(6000);

   }

    @Test
    //6) checking for multi Element on button
    public void testCase4() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]")).click();

        List<String> list = new ArrayList<>();
        List<WebElement> itemList = driver.findElements(By.xpath("/html/body/div"));
        System.out.println("number of elements: " + itemList);
        System.out.println("Number of elements: " + itemList.size());
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(" Items are: " + itemList.get(i).getText());

        }
        Thread.sleep(5000);
        //7)navigate back
        driver.navigate().back();
        //8) click on radioButton
        //9) verify the radio check box
      driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[4]/a")).click();
      String expectedResult2="Checkboxradio";
      String actualResult2=driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
      Assert.assertEquals(actualResult2,expectedResult2,"test fail on check box radio");
       //10) navigate back
      driver.navigate().back();
        //11 click on "API Documentation"
      driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[3]/a")).click();
      //12) click on the methods link
       //13) verify the method link is clicked.
      driver.findElement(By.xpath("//a[@href='//api.jqueryui.com/category/methods/']")).click();
       Thread.sleep(3000);
       String expectedResult3="Getter/setter for an object version of the CSS clip property.";
       String actualResult3=driver.findElement(By.xpath("//*[@id=\"post-1333\"]/div/p")).getText();
       Assert.assertEquals(actualResult3,expectedResult3,"test fail");
        //14) click on the interactions link
        //15) verify the interactions link is click
       driver.findElement(By.xpath("//a[@href='//api.jqueryui.com/category/interactions/']")).click();
       String expectedResult4="Allow elements to be moved using the mouse.";
        String actualResult4=driver.findElement(By.xpath("//*[@id=\"post-27\"]/div/p")).getText();
        Assert.assertEquals(actualResult4,expectedResult4,"test fail");
       //16) Click on Utilities link
       // user should be able to see the utilities category related information
      //17) verify utilities information is display
        driver.findElement(By.xpath("//*[@id=\"categories\"]/ul/li[9]")).click();
       String expectedResult5="Getter/setter for an object version of the CSS clip property.";
       String actualResult5= driver.findElement(By.xpath("//*[@id=\"post-1333\"]/div/p")).getText();
       Assert.assertEquals(actualResult5,expectedResult5,"test case fail");
       //18 click on .labels()
       driver.findElement(By.xpath("//a[@href='//api.jqueryui.com/labels/']")).click();
       //19)navigate back to main page
        driver.navigate().back();


    }
  @AfterTest
    public void takeScreenShotOnFail() throws IOException {

        String path="screenShot/auto.jpg";
      String timestamp= new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
      File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screenShot, new File(path+"_"+timestamp+".jpg"),true);

  }

  @AfterMethod
  public void closeBrowser() {
  driver.close();
  if(driver !=null){
  driver.quit();
    }
  }

}
