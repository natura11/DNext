package optiim.steps.api;

import optiim.framework.helpers.WorldHelper;
import io.cucumber.java.en.Then;

public class CommonApiSteps {
    private final WorldHelper worldHelper;

    public CommonApiSteps(WorldHelper worldHelper) {
        this.worldHelper = worldHelper;
    }

    @Then("I set GET service api endpoint")
    public void i_set_GET_service_api_endpoint() {

    }

    @Then("işlem başarılıdır")
    public void işlem_başarılıdır() {
        worldHelper.AssertApiSuccess();
    }

    @Then("işlem başarısızdır")
    public void işlem_başarısızdır() {
        worldHelper.AssertApiFail();
    }

    @Then("mesaj olarak {string} alırım")
    public void mesaj_olarak_alırım(String message) {
        worldHelper.AssertApiMessage(message);
    }

//    @Eğerki("müşterinin tüm hizmetlerine geçici tesis onayı verirsem")
//    public void müşterinin_tüm_hizmetlerine_geçici_tesis_onayı_verirsem() {
//        worldHelper.setMusteriHizmetlerResponse(MusteriApi.hizmetler(new MusteriHizmetlerRequest("" + worldHelper.getMusteriOlusturResponse().getData(), 20, "1")));
//
//        for (MusteriHizmetlerData hizmet : worldHelper.getMusteriHizmetlerResponse().getData()
//        ) {
//            TestAutoApi.isEmriOnayla(new IsEmriOnaylaRequest((Integer) hizmet.getHizmetId(), 1));
//        }
//    }



}
