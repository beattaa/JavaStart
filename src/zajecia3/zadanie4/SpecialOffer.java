package zajecia3.zadanie4;

import java.time.LocalDate;

public class SpecialOffer {
    private Product product;
    private String description;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private double discount;

    public SpecialOffer(Product product, String description, double discount) {
        this.product = product;
        this.description = description;
        this.discount = discount;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public String toString() {
        return "SpecialOffer{" +
                "product=" + product +
                ", description='" + description + '\'' +
                '}';
    }
}
