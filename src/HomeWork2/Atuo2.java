package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Atuo2 {


    WebDriver driver;

    @BeforeMethod
// setting the browser
    public void SetBrowser() {
        String chromeDriverPath = "BrowserDrivers\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com");
    }

    @Test
    //  Verify log on HomePage
    public void testCase2() throws InterruptedException {
        String expectedResult = "jQuery UI";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "the test fail");

    //click on Demos, then click on Button
        driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a")).click();

       driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[3]/a")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//input[@type='submit'][@value='A submit button'][@class='ui-button ui-corner-all ui-widget']")).click();

        //driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[3]")).click();
      //  Thread.sleep(6000);
//
//            List<String> list = new ArrayList<>();
//            List<WebElement> itemList = driver.findElements(By.xpath("/html/body/div"));
//            System.out.println("number of elements: " + itemList);
//            System.out.println("Number of elements: " + itemList.size());
//            for (int i = 0; i < itemList.size(); i++) {
//                System.out.println(" Items are: " + itemList.get(i).getText());
//            }
        // driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a")).click();

      //  driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[4]/a")).click();

//            //  driver.findElement(By.id("//*[@id='radio-1']")).click();
//            String radioButton = "Checkboxradio | jQuery UI";
//            String radioButtonActualResult = driver.findElement(By.xpath("//*[@class='entry-title']")).getText();
//            System.out.println("radioButton  did display");
//            Thread.sleep(6000);
//            driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[4]")).click();
//
//            driver.navigate().back();
    }



}


































