package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        return String.valueOf(Colors.values()[new Random().nextInt(Colors.values().length)]);
    }
}
