package optiim.steps.gui.dcase;

import optiim.framework.helpers.WebDriverHelper;
import optiim.pages.dcase.CommonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ozaman;
import io.cucumber.java.tr.Ve;

public class CommonPageSteps {

    private final CommonPage commonPage;
    private final WebDriverHelper webDriverHelper;

    public CommonPageSteps(WebDriverHelper webDriverHelper,CommonPage commonPage){
        this.commonPage = commonPage;
        this.webDriverHelper = webDriverHelper;
    }
    @Ozaman("Pop up hatası olarak {string} hatası ve {string} içeriği ile alırım")
    public void pop_up_hatası_olarak_hatası_alırım(String beklenenPopupMesaji, String beklenenPopupMesajiContent) throws InterruptedException{
        commonPage.popUpKontrol(beklenenPopupMesaji,beklenenPopupMesajiContent);
    }
    @Ve("{string} mesajı alırım")
    public void mesajı_alırım(String beklenenPopupMesaji) throws InterruptedException {
        commonPage
                .popupKontrol(beklenenPopupMesaji)
                .confirmClick(beklenenPopupMesaji);
    }
    @Ve("işlemi onaylarsam")
    public void islemi_onaylarsam() throws InterruptedException {
        commonPage
                .confirmClick("");
    }
    @Ozaman("onayle ve iptal butonlarının geldiğini görürüm")
    public void onayle_ve_iptal_butonlarının_geldiğini_görürüm() throws InterruptedException {
        commonPage
                .onaylaIptalButonKontrolu();
    }
    @Ve("{string} mesajını görürüm")
    public void mesajını_görürüm(String beklenenPopupMesaji) throws InterruptedException {
        commonPage
                .popupKontrol2(beklenenPopupMesaji);
    }
    @Ve("{string} uyarı mesajını kapatırsam")
    public void uyarı_mesajını_kapatırsam(String uyarıMesaji) throws InterruptedException {
        commonPage
                .popupAnladimTamam(uyarıMesaji);
    }
    @Ve("musteri detay ekranını kapatırım")
    public void musteri_detay_ekranını_kapatırım(){
        commonPage
                .musteriDetayPageKapat();
    }
    @Ve("sayfayı yenilersem")
    public void sayfayı_yenilersem() throws InterruptedException {
        commonPage
                .sayfaYenile();
    }

    @When("I click on related customer from task list")
    public void ıClickOnRelatedCustomerFromTaskList() throws Throwable {
        commonPage
                .clickRelatedTask();
    }


    @And("I wait {string} millisecond to process")
    public void ıWaitMillisecondToProcess(String millisecond) throws Throwable {
        commonPage
                .waitToProcess(millisecond);
    }
}
