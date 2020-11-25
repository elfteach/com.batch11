package day02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariTechPreviewDriverInfo;

public class VerifyTitleAndURL {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\elif\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");         //google ana sayfasina gidelim
        String actualResult = driver.getTitle();       //sayfa basliginin(title) 'google' oldugunu dogrulayin
        String expectedResult = "google";

        if (actualResult.equals(expectedResult)){
            System.out.println("Page Title testi PASS");
        }else{
            System.out.println("Page Title testi FAILED");
            System.out.println("Actual Page Title: " + actualResult );
        }

        driver.navigate().to("https://www.youtube.com/");
        String actualURL = driver.getCurrentUrl();

        String expectedURL = "www.youtube.com";

        if(actualResult.equals(expectedResult)){
            System.out.println("URL testi PASS");
        }else{
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL: " + actualURL );
        }





        driver.close();

    }
}
