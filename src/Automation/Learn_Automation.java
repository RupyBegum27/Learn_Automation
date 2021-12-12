package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Automation {


    public class HomeWork {

    /*
    test case
1) navigate to url (www.ebay.com)
2) search for face mask
3)click search button
4) click on gender "woman"
5)click on color
6)click on "under $8.00"

9) check box [] black
10) select a mask
11)  click on the link
12) click on ship it button
13 click on continue shopping

     */

//
//        public static  void main(String[]args) throws InterruptedException {
//
//            String chromeDvPath= "BrowserDrivers\\windows\\chromedriver.exe";
//            System.setProperty("webdriver.chrome.driver",chromeDvPath);
//            WebDriver DV= new ChromeDriver();
//            DV.manage().window().maximize();
//            DV.get("https://www.ebay.com/");
//
//            DV.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("face mask");
//            DV.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//
//            //verify expected result and actual result match
//            String expectedResult="face mask";
//            String actualResult=DV.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div[2]/div[1]/div[1]/h1/span[2]")).getText();
//            System.out.println("Expected result: "+expectedResult);
//            System.out.println("Actual result: "+actualResult);
//            if (expectedResult.equalsIgnoreCase(actualResult)){
//                System.out.println("Test  pass");
//            }else{
//                System.out.println("Test fail");
//            }
//            String expectedResult1="face mask | eBay";
//            String actualResult1=DV.getTitle();
//            if (expectedResult1.equalsIgnoreCase(actualResult1)){
//                System.out.println("Test case title pass");
//            }else{
//                System.out.println("test case title fail");
//            }
//            //Test case 5: click on gender "woman".
//            //DV.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[5]/div/a/div")).click();
//            String expectResult2= "Woman";
//            String actualResult2=DV.findElement(By.xpath("//*[@id=\\\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\\\"]/li[5]/div/a/div\"")).getText();
//            if (expectResult2.equalsIgnoreCase(actualResult2)){
//                System.out.println("test pass");
//            }else{
//                System.out.println("test fail");
//            }
//            DV.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[5]/div/a/div")).click();
//
////        //Test case 6: click on "Black" color
////        Thread.sleep(5000);
////        DV.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[6]/div")).click();
////        //Test case click on "under $8.00"
////         Thread.sleep(5000);
////        DV.findElement(By.xpath("//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]/li[2]/div/a")).click();
//
//        }

    }




















}
