package optiim.framework.utils;

import java.util.Random;

public class Utility {
    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
