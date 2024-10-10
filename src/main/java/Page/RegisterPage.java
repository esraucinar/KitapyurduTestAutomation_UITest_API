package Page;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("'Ad' alanı doldurulur")
    public RegisterPage fillname(String text){
        driver.findElement(By.id("register-name")).clear();
        driver.findElement(By.id("register-name")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("'Soyad' Alanı Doldurulur")
    public RegisterPage fillLastname(String text){
        driver.findElement(By.id("register-lastname")).clear();
        driver.findElement(By.id("register-lastname")).sendKeys(text);
        return this;

    }

    @Step("'E-Posta' Alanı Doldurulur")
    public RegisterPage fillEmail(String text) {
        driver.findElement(By.id("register-email")).clear();
        driver.findElement(By.id("register-email")).sendKeys(text);
        return this;
    }

    @Step("'Şifre' Alanı Doldurulur")
    public RegisterPage fillPassword(String text) {
        driver.findElement(By.id("register-password")).clear();
        driver.findElement(By.id("register-password")).sendKeys(text);
        return this;
    }

    @Step("'Şifre Kontrol' Alanında şifre tekrar doldurulur")
    public RegisterPage fillControlPassword(String text){
        driver.findElement(By.id("register-password-confirm")).clear();
        driver.findElement(By.id("register-password-confirm")).sendKeys(text);
        return this;
    }

    @Step("'Kişisel verilerin korunması' Alanına onay verilir")
    public RegisterPage ClickConfirmationButton(){
        driver.findElement(By.cssSelector(".ky-form-action:nth-child(7) .ky-checkbox-input")).click();
        return this;
    }

    @Step("'Üye Ol' Butonu tıklanır")
    public RegisterPage clickAccount(){
        driver.findElement(By.cssSelector("[class='ky-btn ky-btn-orange w-100 ky-register-btn']")).click();
        return this;
    }

    @Step("'Hesabınız oluşturuldu!'mesajı alınır")
    public String getCreatAccount(){

        String value = driver.findElement(By.xpath("//*[@id='register-success']/main/header/h1")).getText();
        screenshot();
        return value;
    }
}

