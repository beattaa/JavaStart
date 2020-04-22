package zajecia6.zadanie2;

import java.text.DecimalFormat;

public class Numbers {
    public static void main(String[] args) {
        double number = 0;
        while (number != 3.10) {
            System.out.println(number);
            DecimalFormat df = new DecimalFormat("####0.00");
            number = Double.valueOf(df.format(number + 0.1));
        }

        number = 0;
        do {
            System.out.println(number);
            DecimalFormat df = new DecimalFormat("####0.00");
            number = Double.valueOf(df.format(number + 0.1));
        }
        while (number != 3.10);
    }
}
