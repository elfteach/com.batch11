package day02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Practise01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\elif\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");
        String actualResult = driver.getTitle();
        String expectedResult = "Youtube";

        if (actualResult.contains(expectedResult)){
            System.out.println("Page Title Testi PASS");
        }else{
            System.out.println("Page Title Testi FAILED");
            System.out.println("Actual Page Title: " + actualResult );
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualAmazonTitle = driver.getTitle();
        String arananAmazonKelime = "Amazon";

        if (actualAmazonTitle.contains(arananAmazonKelime)){
            System.out.println("Amazon baslik testi PASS");
        }else{
            System.out.println("FAILED");
        }

        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";

        if (actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("Amazon URL PASS");
        }else{
            System.out.println("Amazon URL FAILED");
        }
         

        driver.close();
    }
}
