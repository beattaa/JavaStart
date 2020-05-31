package zajecia16.zadanie1;

import java.util.Arrays;
import java.util.List;

public enum Season {
    SPRING("Wiosna", Arrays.asList("mar", "kwi", "maj")),
    SUMMER("Lato", Arrays.asList("cze", "lip", "sie")),
    AUTUMN("Jesień", Arrays.asList("wrz", "paz", "lis")),
    WINTER("Zima", Arrays.asList("gru", "sty", "lut"));

    private final String name;
    private final List<String> months;

    Season(String name, List<String> months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public List<String> getMonths() {
        return months;
    }
}
