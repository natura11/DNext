package optiim.models.enums;
import lombok.Getter;
public enum vknDurum {
    NORMAL(1),TERK(2),KARSILIKSIZ(3);
    @Getter
    private int value;
    private vknDurum(int value) {
        this.value = value;
    }

}

