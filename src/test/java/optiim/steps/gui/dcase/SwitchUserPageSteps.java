package optiim.steps.gui.dcase;

import optiim.framework.helpers.WorldHelper;
import optiim.models.data.api.ApiData;
import optiim.pages.dcase.SwitchUserPage;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class SwitchUserPageSteps {
    private WorldHelper worldHelper;
    private SwitchUserPage switchUserPage;
    private ApiData apiData;

//    @Then("kullanıcıyı değiştirebilirim")
//    public void kullanıcıyı_değiştirebilirim() throws InterruptedException {
//        menuPage
//                .openMenu(Menu.kullanici, Menu.Kullanici.suAktifKullanici);
//        //.menuToggle();
//
//        switchUserPage
//                .kullaniciBul(worldHelper.getSorgulaYetkiyeGoreKullaniciResponse().getData().get(0))
//                .kullaniciSec();
//    }
//
//    @When("kullanıcıyı değiştirirsem")
//    public void kullanıcıyı_değiştirirsem() throws InterruptedException {
//        menuPage
//                .openMenu(Menu.kullanici, Menu.Kullanici.suAktifKullanici);
//        //.menuToggle();
//
//        switchUserPage
//                .kullaniciBul2(worldHelper.getSorgulaYeniStokResponses().get(0).getData().getKullaniciId() + " " +
//                        worldHelper.getSorgulaYeniStokResponses().get(0).getData().getAd() + " " +
//                        worldHelper.getSorgulaYeniStokResponses().get(0).getData().getSoyad()
//                )
//                .kullaniciSec();
//    }

//    @Then("stoğu sorgulayan kullanıcıya geçebilirim")
//    public void stogu_sorgulayan_kullanıcıya_geçebilirim() throws InterruptedException {
//        menuPage
//                .openMenu(Menu.kullanici, Menu.Kullanici.suAktifKullanici);
//        //.menuToggle();
//
//        switchUserPage
//                .kullaniciBul2(apiData.getKullaniciID()+ " " +
//                        apiData.getKullaniciAdi()+ " " +
//                        apiData.getKullaniciSoyadi()
//                )
//                .kullaniciSec();
//    }
}
