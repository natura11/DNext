package optiim.models.enums;

import lombok.Getter;

public enum VatandasYas {
    YAS18ALTI(0), YAS18USTU(1), YAS100USTU(2);

    @Getter
    private int value;

    private VatandasYas(int value){
        this.value = value;
    }
}
