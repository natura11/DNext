package optiim.models.enums;

import lombok.Getter;

public enum KimlikSeriNo {

    YOK(1),
    VAR(0)
    ;
    @Getter
    private int value;

    private KimlikSeriNo(int value) {
        this.value = value;
    }
}
