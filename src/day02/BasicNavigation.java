package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\elif\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");     //Youtube ana sayfasina gidelim

        driver.navigate().to("https://www.amazon.com/");      //Amazon sayfasina gidelim

        driver.navigate().back();                                 //Bir onceki sayfaya geri donmek icin back()

        driver.navigate().forward();                              //Yeniden amazona gidelim

        driver.navigate().refresh();                              //ssayfayi yenile

        driver.manage().window().maximize();                     //sayfayi tam ekran yapalim

        Thread.sleep(5000);                                //oldugu sayfada 5 sn bekleyelim



        driver.close();
    }
}
