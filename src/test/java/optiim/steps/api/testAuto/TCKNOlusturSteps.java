package optiim.steps.api.testAuto;

import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.TypeConversion;
import optiim.models.api.testauto.TcknOlusturRequest;
import optiim.models.data.api.ApiData;
import optiim.models.enums.*;
import io.cucumber.java.DataTableType;

import java.util.Map;

import static optiim.framework.utils.TypeConversion.getNullIfBooleanNull;

public class TCKNOlusturSteps {

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public TCKNOlusturSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public TcknOlusturRequest tcknOlusturRequest(Map<String, String> entry) {
        return new TcknOlusturRequest(
                1,
                Enum.valueOf(VatandasYas.class, entry.get("yas")).getValue(),
                Enum.valueOf(MusteriTipi.class, entry.get("musteri_tipi")).getValue(),
                Enum.valueOf(VatandasDurum.class, entry.get("durum")).getValue(),
                //getNullIfIntegerNull(entry.get("soyisim_indeks")),
                (entry.get("soyisim_indeks") == null) ? null : TypeConversion.valueOf(VatandasSoyIsimIndeks.class, entry.get("soyisim_indeks"), null).getValue(),
                (entry.get("izin_durumu") == null) ? null : TypeConversion.valueOf(VatandasIzinDurumu.class, entry.get("izin_durumu"), null).getValue(),
                (entry.get("adres_dogrulanabilir") == null ? true : getNullIfBooleanNull(entry.get("adres_dogrulanabilir"))),
                (entry.get("kimlik_seri_no") == null) ? null : TypeConversion.valueOf(KimlikSeriNo.class, entry.get("kimlik_seri_no"), null).getValue());
    }

//    @When("TC kimlik numarası oluşturursam")
//    public void tc_kimlik_numarası_oluşturursam(TcknOlusturRequest tcknOlusturRequest) {
////        worldHelper.setTcknOlusturResponse(TestAutoApi.tcknOlustur(tcknOlusturRequest));
//        log.info("TC kimlik numarası oluşturuldu. TCKN:" + worldHelper.getTcknOlusturResponse().getData());
//    }

//    @Ozaman("sorgulanan TC kimlik numarasını alabilirim")
//    public void sorgulanan_tc_kimlik_numarasını_alabilirim() {
//       // apiData.setOlusturulanIlkTCKN(worldHelper.getTcknOlusturResponse().getData());
//        worldHelper.setApiData(apiData);
//        log.info("tc: " + worldHelper.getTcknOlusturResponse().getData());
//    }

}
