## Kitapyurdu UI Testi  
**Kullanılan Teknolojiler:**  
- **Programlama Dili:** Java  
- **Otomasyon Aracı:** Selenium  
- **Test Çerçevesi:** TestNG  
- **Raporlama Aracı:** Allure Report  
- **Tasarım Deseni:** Page Object Model (POM) ve Page Factory  

### Test Senaryoları

[kitapyurdu test scenario.xlsx](https://github.com/user-attachments/files/17335174/kitapyurdu.test.scenario.xlsx)

**Kullanıcı Kaydı**
- Geçerli ve geçersiz kayıt senaryoları oluşturdum.
- E-posta formatları ve zorunlu alanlar için doğrulama kontrolleri yaptım.
- Boş alanlar ve hatalı veriler için hata mesajlarını kontrol ettim.

**Ürün Arama**
- Ürün arama işlevselliğini test ettim.
- Sonuç vermeyen ve geçersiz girdiler için kenar durumlarını inceledim.

**Alışveriş Sepeti İşlemleri**
- Ürün ekleme işlemlerinin başarı mesajlarını kontrol ettim.
- Sepetten ürün çıkarma işlemlerini test ettim ve doğru bildirimlerin geldiğinden emin oldum.

**Kullanıcı Girişi**
- Geçerli ve geçersiz giriş senaryoları oluşturup uygun hata yönetimini sağladım.

**Şifre Yenileme**
- Şifre yenileme işlevselliğini test etmek için hazırlık yaptım.

### Test Senaryolarının Detaylandırılması

1. **Kullanıcı Kaydı**
   - **Test Senaryosu 1:** Geçerli Veri Gönderimi
   - **Test Senaryosu 2:** Geçersiz E-posta Formatı
   - **Test Senaryosu 3:** Boş Alan Gönderimi
   - **Geliştirmeler:**
     - Maksimum alan uzunlukları ve ek kısıtlamalar (örneğin, şifre gücü) için kontroller eklemeyi planlıyorum.
     - Kayıtlı bir e-posta ile kayıt olma durumunu test etmek için bir senaryo eklemeyi düşünüyorum.

2. **Ürün Arama**
   - **Test Senaryosu 1:** Geçerli Arama Terimi
   - **Test Senaryosu 2:** Sonuç Vermeyen Arama
   - **Test Senaryosu 3:** Geçersiz Arama Girdisi
   
3. **Alışveriş Sepeti İşlemleri**
   - **Test Senaryosu 1:** Başarılı Ürün Ekleme
   - **Test Senaryosu 2:** Ürün Çıkarma
   - **Test Senaryosu 3:** Ödeme İçin Limit Uyarısı
   
4. **Kullanıcı Girişi**
   - **Test Senaryosu 1:** Başarılı Giriş
   - **Test Senaryosu 2:** Hatalı Kimlik Bilgileri ile Başarısız Giriş

5. **Şifre Yenileme**
   - Şifre yenileme sürecini test etmek için:
     - Kayıtlı olmayan bir e-posta girişi ile başlamak.
     - Yenileme bağlantısını takip ederek şifre güçlendirme kriterlerini sağlamaya çalışmak.

### Test Sonuçları
![Ekran Resmi 2024-10-10 23 59 37](https://github.com/user-attachments/assets/c870533b-f73d-4afb-a3ef-b1578f68c3d2)
![Ekran Resmi 2024-10-11 00 04 47](https://github.com/user-attachments/assets/7c71a680-b911-4aa0-a631-f3b0ed804d01)
![Ekran Resmi 2024-10-11 00 06 07](https://github.com/user-attachments/assets/a9937bf4-8169-4db7-b12f-57f552eca208)
![Ekran Resmi 2024-10-11 00 07 25](https://github.com/user-attachments/assets/7532ea41-c958-49d9-a2ca-8c44b4595686)



Test sonuçlarım şu şekildedir:
- **Toplam Test Senaryosu:** 13
- **Başarılı Test:** 10
- **Başarısız Test:** 1 (Test Senaryosu 2: Sonuç Vermeyen Arama)
- **Kırık Test:** 1 (OpenBrowser ile ilgili bir sorun)
- **Başarı Oranı:** %84.61

**Başarısız Test Açıklaması:**
- **Test Senaryosu 2:** Sonuç vermeyen arama senaryosunda, arama kısmına yazılan ifadenin arama sonucunda beklenenden tamamen farklı sonuçlar döndürdüğü görüldü.

**Kırık Test Açıklaması:**
- **Kırık Test:** OpenBrowser ile ilgili sorun, tarayıcının açılmaması veya istenen sayfaya erişim sağlanamaması gibi bir durumu ifade eder. Bu durum, testlerin düzgün bir şekilde çalışmasını engelledi.

**Bug Raporu**
![Ekran Resmi bug-10-11 01 53 19](https://github.com/user-attachments/assets/74b7e2d3-0ff4-40cd-85dc-baa497f56077)


### Sonuç
Proje planım, Kitapyurdu platformunun kapsamlı testleri için sağlam bir temel oluşturuyor. Raporlama araçlarını kullanarak test sonuçlarımı görselleştirdim ve bu sayede süreç boyunca elde ettiğim bulguları daha iyi analiz edebildim. 
