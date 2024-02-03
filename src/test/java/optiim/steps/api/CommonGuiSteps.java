package optiim.steps.api;

import optiim.framework.helpers.WorldHelper;
import optiim.pages.dcase.CommonPage;
import io.cucumber.java.tr.Eğerki;
import io.cucumber.java.tr.Ozaman;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CommonGuiSteps {

    private final WorldHelper worldHelper;
    private CommonPage commonPage;

    @Ozaman("{string} uyarısı ile {string} mesajı alırım")
    public void mesaj_uyarısı_ile_mesaji_alırım(String popupMesTitle, String popupMesContent) throws InterruptedException {
        commonPage
                .popUpKontrol(popupMesTitle, popupMesContent)
                .ifNecessaryConfirmClick(popupMesContent);
    }

    @Eğerki("çıkan popupda evet tıklarsam")
    public void çıkan_popupda_evet_tıklarsam() throws InterruptedException {
        commonPage
                .popupEvetSec();
    }

    @Eğerki("çıkan popupda geri dön tıklarsam")
    public void çıkan_popupda_geri_dön_tıklarsam() throws InterruptedException {
        commonPage
                .popupGeriDon();
    }

    @Eğerki("çıkan popupda tamam tıklarsam")
    public void çıkan_popupda_tamam_tıklarsam() throws InterruptedException {
        commonPage
                .popupTamam();
    }

    @Eğerki("button gelene kadar bekle")
    public void mesaj_gelene_kadar_bekle() throws InterruptedException {
        commonPage
               .waitElementAppear();
    }

}
