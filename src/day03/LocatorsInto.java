package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsInto {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\elif\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");
        //sign in butonuna bas
        //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>

        WebElement signInLinki = driver.findElement(By.id("sign-in"));  //id kullanarak sign in yapmak
        signInLinki.click();                                           //test basarili sign in tusuna basti



       // WebElement signInLinki2 = driver.findElement(By.className("nav-item nav-link")); // class ismiyle sign in yapmak
       // signInLinki2.click();                       //ayni class ismiyle baska bir class da oldugu icin ilkine(anasayfa) girdi

       // WebElement signInLinki3 = driver.findElement(By.linkText("Sign-in"));  //Link text kullanarak sign in yapmak
       // signInLinki3.click();                          // bu test de calismadi

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButonu = driver.findElement(By.name("commit"));

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        WebElement kullaniciAdi = driver.findElement(By.className("navbar-text"));
        if (kullaniciAdi.isDisplayed()){
            System.out.println("kullanici adi testtechproed@gmail.com PASS");
        }else{
            System.out.println("kullanici adi testtechproed@gmail.com FAILED");
        }

        WebElement adresLinki = driver.findElement(By.linkText("Addresses"));
        if (adresLinki.isDisplayed()){
            System.out.println("Adres linki gorundu testi PASS");
        }else{
            System.out.println("Ardes linki gorundu testi FAILED");
        }

        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (signOut.isDisplayed()){
            System.out.println("Sign out gorundu testi PASS");
        }else{
            System.out.println("Sign out gorundu testi FAILED");
        }

        //3. Sayfadaki tum linkleri bulma
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfada "+ linkListesi.size() + " tane link var. ");

        driver.close();
    }
}
