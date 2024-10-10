import Base.BaseTest;
import Page.CartPage;
import Page.LoginPage;
import Page.ProductSearchPage;
import io.qameta.allure.Feature;
import net.bytebuddy.matcher.ElementMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static net.bytebuddy.matcher.ElementMatchers.is;

@Feature("Kitapyurdu.com Sepete Ürün Ekleme")
public class CartTest extends BaseTest {
    CartPage cart = new CartPage();
    ProductSearchPage searchPage = new ProductSearchPage();
    LoginPage login = new LoginPage();

    @Test(description = "Başarılı Ürün Ekleme İşlemi")
    public void successfulladdtocart() throws InterruptedException {
        searchPage.fillsearch(searchValidWord)
                .clickMagnifyingGlassIcon();
        sleep(3000);
        cart.BookSelect()
                .AddToCart();
        sleep(3000);
        cart.AddToCart();
    }
    @Test(description = "Eklenen Ürünü Çıkarma İşlemi")
    public void productRemoval() throws InterruptedException {
        searchPage.fillsearch(searchValidWord)
                .clickMagnifyingGlassIcon();
        cart.BookSelect()
                .AddToCart();
        cart.cartButton();
        cart.crossClick();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));
        String actualMessage = cart.messageExitCart();
        String expectedMessage = "Sepetinizden çıkarılıyor!";
        Assert.assertEquals(actualMessage, expectedMessage, "Uyarı mesajı beklenenden farklı!");
    }
    @Test(description = "Limit Uyarısı")
    public void limit() throws InterruptedException {
        login.LoginButton();
        sleep(3000);
        login.email(loginEmail)
                .Password(password);
        sleep(3000);
        login.buttonLogin();
        sleep(30000);
        searchPage.fillsearch(searchValidWord)
                .clickMagnifyingGlassIcon();
        sleep(3000);
        cart.BookSelect()
                .AddToCart();
        sleep(3000);
        cart.cartButton();
        sleep(3000);
        String actualAlertMessage = driver.findElement(By.cssSelector(".alert.dismissable.warning")).getText().trim();
        String expectedAlertMessage = "Sipariş verebilmeniz için sepet tutarı en az 100,00 olmalıdır.";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Uyarı mesajı beklenenden farklı!");
    }

}
