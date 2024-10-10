package Page;

import Base.BaseTest;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

@Feature("Kitapyurdu.com Giriş İşlemleri")
public class LoginPage extends BaseTest {
    @Step("Giriş Yap Butonuna Tıklanır")
    public void LoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='header-top']/div/div[1]/div[1]/a")).click();
        sleep(3000);
    }
    @Step("E-Posta Alanı Doldurulur")
    public LoginPage email(String text){
        driver.findElement(By.id("login-email")).sendKeys(text);
        return this;
    }
    @Step("Şifre Alanı Doldurulur")
    public LoginPage Password(String text)throws InterruptedException{
        driver.findElement(By.id("login-password")).sendKeys(text);
        return this;
    }
    @Step("Giriş Yap(Anasayfa) Butonuna tıklanır")
    public void buttonLogin(){
        driver.findElement(By.cssSelector("[class='ky-btn ky-btn-orange w-100 ky-login-btn']")).click();

    }

    @Step("Merhaba yazısı görünür")
    public String getHello() {
        // Doğru CSS veya XPath seçicisi kullanarak metni al
        String value = driver.findElement(By.xpath("//a[contains(text(), 'Merhaba')]")).getText();
        return value.trim(); // Başındaki ve sonundaki boşlukları kaldır
    }

    @Step("E-Posta ya da Şifreniz yanlış uyarısı")
    public String getWrongMessage(){
        String value = driver.findElement(By.xpath("driver.findElement(By.xpath(//div[text()='E-Posta Adresi ya da şifreniz yanlış. Şifrenizi girerken büyük küçük harf ayrımına dikkat ediniz.']));")).getText();
        return value.trim();
    }




}
