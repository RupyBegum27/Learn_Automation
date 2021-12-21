package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class HomeWork {

    /*
    test case
1)  set up browser
2) navigate to url (www.ebay.com)
3) search for face mask
4)click search button
5) click on gender "woman"
6)click on "under $8.00"
7)click on "United States"
8)click on "color
9)close the browser

     */
    WebDriver DV;

    @BeforeMethod
    public void setUpBrowser() {
        String chromeDvPath = "BrowserDrivers\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDvPath);
        DV = new ChromeDriver();
        DV.manage().window().maximize();
        DV.get("https://www.ebay.com/");
    }

    @Test
    public void TestSearchBox() throws InterruptedException {
        // setUpBrowser();

        DV.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("face mask");
        DV.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        //verify expected result and actual result match
        String expectedResult = "face mask";
        String actualResult = DV.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div[2]/div[1]/div[1]/h1/span[2]")).getText();
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result:  " + actualResult);
        Assert.assertEquals(actualResult, expectedResult, "Test case fail");


        String expectedResult1 = "face mask | eBay";
        String actualResult1 = DV.getTitle();
        Assert.assertEquals(actualResult1, expectedResult1, "Test case 1 fail: comparing the page");

        //Test case 5: click on gender "woman".
        String expectResult2 = " Woman ";
        String actualResult2 = DV.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[5]/div/a/div")).getText();
        DV.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[5]/div")).click();

        System.out.println("ExpectedResult2: " + expectResult2);
        System.out.println("ActualResult2:  " + actualResult2);

        if (expectResult2.equalsIgnoreCase(actualResult2)) {
            System.out.println("test pass");
        } else {
            System.out.println("test fail");
        }

        Thread.sleep(5000);
        DV.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[2]/div/a/div")).click();
        String expectedResult3 = "Country/Region of Manufacture";
        String actualResult3 = DV.findElement(By.xpath("//*[@id=\"s0-14-11-0-1-2-6\"]/li[1]/ul/li[2]/ul/li[2]/div[1]/h3")).getText();
        System.out.println("ExpectedResult3:  " + expectedResult3);
        System.out.println("actualResult3: " + actualResult3);
        //Assert.assertEquals(actualResult3,expectedResult3,"Actual result3 fail");


        DV.findElement(By.xpath("//*[@id=\"x-refine__group_1__1\"]/ul/li[7]/div/a/div/div/span[1]")).click();


    }

    @AfterMethod
    public void closeBrowser() {
        DV.close();
    }


}

