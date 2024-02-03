package optiim.models.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum MusteriTipi {
    GERCEK(1), TUZEL(2), YABANCI(3), RESMIKURUM(4), MAVIKARTLI(5), KARSILIKSIZ(97);

    @Getter
    private int value;

    private MusteriTipi(int value) {
        this.value = value;
    }

    public static List<Integer> getValuesByStringArray(String strArr){
        List<Integer> result = new ArrayList<Integer>();
        List<String> stringList;
        if(strArr != null){
            stringList = Arrays.stream(strArr.replaceAll("\\s", "").split(",")).collect(Collectors.toList());
            for (String str:stringList) {
                MusteriTipi ht  = Enum.valueOf(MusteriTipi.class, str);
                //Integer a = e;
                result.add((Integer) ht.getValue());
            }
        }
        return result;
    }
}
