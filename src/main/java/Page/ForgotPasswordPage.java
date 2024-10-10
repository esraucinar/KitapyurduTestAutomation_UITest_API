package Page;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends BaseTest {
    @Step("Şifremi unuttum bölümüne tıklanır")
    public void forgotPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("[class='forgot-password']")).click();
        sleep(3000);
    }
    @Step("şifremi unuttum alanında eposta gönderimi")
    public ForgotPasswordPage eposta(String text){
        driver.findElement(By.id("forgotten-email")).sendKeys(text);
        return this;
    }
    @Step("Yenileme Bağlantısı Gönder, butonuna tıkla")
    public void sendRenewalLink(){
        driver.findElement(By.id("js-btn-send-reset-link")).click();
    }
    @Step("Başarılı şifre gönderim mesajını görüntüleme")
    public String getPasswordResetSuccessMessage() {
        String successMessage = driver.findElement(By.cssSelector(".success")).getText().trim();
        return successMessage;
    }
    @Step("E-Posta adresi bulunamadı uyarı mesajını görüntüleme")
    public String getEmailNotFoundWarningMessage() {

        String warningMessage = driver.findElement(By.cssSelector(".warning")).getText().trim();
        return warningMessage;
    }


}
