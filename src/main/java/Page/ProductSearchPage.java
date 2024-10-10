package Page;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ProductSearchPage extends BaseTest {
    @Step("Arama butonuna ürün adı girme")
    public ProductSearchPage fillsearch(String Text){
        driver.findElement(By.id("search-input")).clear();
        driver.findElement(By.id("search-input")).sendKeys(Text);
        screenshot();
        return this;
    }
    @Step("Arama ikonuna tıklama")
    public ProductSearchPage clickMagnifyingGlassIcon(){
        driver.findElement(By.cssSelector("[class='common-sprite button-search']")).click();
        return this;
    }
    @Step("Veri ile uyumlu metin görünür")
    public String Statement(){
        String value = driver.findElement(By.xpath("//*[@id='product-649125']/div[1]/div[2]/a")).getText();
        screenshot();
        return value;
    }
    @Step("Arama sonuçları kontrol edilir")
    public boolean SearchControl(String value) {
        List<WebElement> kitaplar = driver.findElements(By.cssSelector(".product-list .product-title"));
        boolean uyumluSonucBulundu = false;
        for (WebElement kitap : kitaplar) {
            if (kitap.getText().toLowerCase().contains(value.toLowerCase())) {
                uyumluSonucBulundu = true;
                break;
            }
        }
        Assert.assertTrue(uyumluSonucBulundu, "Arama sonuçları beklenenden farklı.");
        screenshot();
        return uyumluSonucBulundu;
    }
    @Step("Uygun Sonuç Bulunamaması Durumu/Hata Mesajı")
    public String notsuitableresult (){

            WebElement notFoundElement = driver.findElement(By.cssSelector(".product-not-found"));
            String message = notFoundElement.getAttribute("innerHTML");
            screenshot();
            return message.trim(); // Trim ile baştaki ve sondaki boşlukları temizle
        }
}

