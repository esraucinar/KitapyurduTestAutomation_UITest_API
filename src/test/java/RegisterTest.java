import Base.BaseTest;
import Page.RegisterPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Kitapyurdu.com 'Üye Ol' Bölümü ")
public class RegisterTest extends BaseTest {
    RegisterPage register = new RegisterPage();


    @Test(description = "Geçerli Bilgilerle Hesap Oluşturma")
    public void ValidAccount() throws InterruptedException {

        register.fillname(name)
                .fillLastname(surname)
                .fillEmail(mail)
                .fillPassword(password)
                .fillControlPassword(controlPassword);
        sleep(5000);
        register.ClickConfirmationButton();
        register.ScrollDown(100);
        sleep(2000);
        register.clickAccount();
        sleep(2000);
        String value = register.getCreatAccount();
        assertEquals("Hesabınız Oluşturuldu!", value);
    }
    @Test(description = "Geçersiz E-posta Adresi")
    public void invalidEmail() throws InterruptedException{
        register.fillname(name)
                .fillLastname(surname)
                .fillEmail("uomse@r.c")
                .fillPassword(password)
                .fillControlPassword(controlPassword);
        sleep(3000);
        register.ClickConfirmationButton();
        register.ScrollDown(100);
        sleep(2000);
        register.clickAccount();
        sleep(2000);
        String value = register.getCreatAccount();
        assertEquals("Hesabınız Oluşturuldu!", value);
    }
}



