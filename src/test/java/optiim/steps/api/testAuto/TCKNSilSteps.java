package optiim.steps.api.testAuto;

import optiim.framework.helpers.WorldHelper;
import io.cucumber.java.tr.Eğerki;

public class TCKNSilSteps {
    private final WorldHelper worldHelper;

    public TCKNSilSteps(WorldHelper worldHelper){
        this.worldHelper = worldHelper;
    }

    @Eğerki("oluşturulan müşterinin TC kimliğini silersem")
    public void oluşturulan_müşterinin_TC_kimliğini_silersem() {
//        TestAutoApi.tcSil(
//                new TCKNSilRequest(1,
//                        worldHelper.getMusteriOlusturResponse().getData(),
//                        null));
    }
}
