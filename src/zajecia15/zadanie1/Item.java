package zajecia15.zadanie1;

import java.math.BigDecimal;

public class Item {
    private final String name;
    private final BigDecimal netPrice;
    private final BigDecimal vat;

    public Item(String name, double netPrice, double vat) {
        this.name = name;
        this.netPrice = BigDecimal.valueOf(netPrice);
        this.vat = BigDecimal.valueOf(vat);
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public BigDecimal vatAmount() {
        return netPrice.multiply(vat);
    }

    public BigDecimal grossAmount() {
        return netPrice.multiply(vat);
    }
}
