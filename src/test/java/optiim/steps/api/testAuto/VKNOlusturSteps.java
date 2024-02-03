package optiim.steps.api.testAuto;

import optiim.framework.helpers.WorldHelper;

public class VKNOlusturSteps {

    private final WorldHelper worldHelper;

    public VKNOlusturSteps(WorldHelper worldHelper){
        this.worldHelper = worldHelper;
    }

//    @DataTableType
//    public VknOlusturRequest vknOlusturRequest (Map<String, String> entry){
//        return  new VknOlusturRequest(
//                1,
//                Enum.valueOf(vknDurum.class,entry.get("durum")).getValue(),
//                Enum.valueOf(TuzelKisi.class,entry.get("tuzel_kisi")).getValue()
//        );
//    }
//
//
//    @Eğerki("vergi no oluşturursam")
//    public void verginoOluşturulursa(VknOlusturRequest vknOlusturRequest) {
//        worldHelper.setVknOlusturResponse(TestAutoApi.vknOlustur(vknOlusturRequest));
//        log.info("VKN oluşturuldu. VKN:" + worldHelper.getVknOlusturResponse().getData());
//    }
//
//    @Eğerki("vergi numarası olarak {string} seçersem")
//    public void vergi_numarasi_olarak_secersem(String vkn){
//        VknOlusturResponse vknSorgulaResponse = new VknOlusturResponse();
//        vknSorgulaResponse.setData(vkn);
//        worldHelper.setVknOlusturResponse(vknSorgulaResponse);
//    }
}
