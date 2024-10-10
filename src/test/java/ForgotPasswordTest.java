import Base.BaseTest;
import Page.ForgotPasswordPage;
import Page.LoginPage;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Kitapyurdu.com Şifre Yenileme")
public class ForgotPasswordTest extends BaseTest {
    ForgotPasswordPage forgotten =new ForgotPasswordPage();
    LoginPage login =new LoginPage();

    @Test(description = " Başarılı Şifre Gönderim İşlemi")
    public void successfulforgotten() throws InterruptedException {
        login.LoginButton();
        forgotten.forgotPassword();
        forgotten.eposta(loginEmail);
        forgotten.sendRenewalLink();
        sleep(3000);
        String actualMessage = forgotten.getPasswordResetSuccessMessage();
        String expectedMessage = "Şifre değiştirme bağlantısı eurhancinar@gmail.com adresine başarıyla gönderildi. Lütfen e-postanızı kontrol ediniz.";
        Assert.assertEquals(actualMessage, expectedMessage, "Başarı mesajı beklenenden farklı!");

    }
    @Test(description = "Kayıtlı Olmayan E-Posta ile Şifre Yenileme")
    public void unsuccessfulforgotten() throws InterruptedException {
        login.LoginButton();
        forgotten.forgotPassword();
        forgotten.eposta("e@ao.c");
        forgotten.sendRenewalLink();
        sleep(3000);
        String actualMessage = forgotten.getEmailNotFoundWarningMessage();
        String expectedMessage = "E-Posta adresi bulunamadı. Lütfen tekrar deneyiniz!";
        Assert.assertEquals(actualMessage, expectedMessage, "Uyarı mesajı beklenenden farklı!");




    }


}
