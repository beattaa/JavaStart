package zajecia15.zadanie1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

public class Shop {
    public static void main(String[] args) {
        List<Item> shoplist = new ArrayList<>();
        Item tv = new Item("TV LG", 1000, 0.23);
        Item monitor = new Item("Monitor dell", 700, 0.17);
        Item mouse = new Item("Computer mouse", 50, 0.23);
        shoplist.add(tv);
        shoplist.add(monitor);
        shoplist.add(mouse);
        BigDecimal netSum = BigDecimal.ZERO;
        BigDecimal vatSum = BigDecimal.ZERO;
        BigDecimal grossSum = BigDecimal.ZERO;

        for (Item item : shoplist) {
            netSum = netSum.add(item.getNetPrice());
            vatSum = netSum.add(item.vatAmount());
            grossSum = netSum.add(item.grossAmount());
        }
        DecimalFormat df = new DecimalFormat("#,###.00");
        df.setCurrency(Currency.getInstance(Locale.getDefault()));

        System.out.println("Sprzedaż Netto: " + df.format(netSum));
        System.out.println("Suma podatku VAT ze sprzedaży: " + df.format(vatSum));
        System.out.println("Suma sprzedaży Brutto: " + df.format(grossSum));

    }
}
