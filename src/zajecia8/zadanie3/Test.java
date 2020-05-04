package zajecia8.zadanie3;

import zajecia8.zadanie3.Buyer.Company;
import zajecia8.zadanie3.Buyer.Individual;
import zajecia8.zadanie3.Payment.Payment;

public class Test {
    public static void main(String[] args) {

        Individual individual1 = new Individual("Jan", "Kowalski");
        Product product1 = new Product("Picasso", 6780000.00);
        individual1.makePremium();
        Payment payment1 = Shop.sellProduct(product1, individual1);
        System.out.println(payment1);

        System.out.println("--------------------");

        Company company = new Company("Company Sp. z o.o", "123-456-789");
        company.makePremium();
        Payment payment2 = Shop.sellProduct(product1, company);
        System.out.println(payment2);

        System.out.println("--------------------");

        Company company2 = new Company("Company Sp. z o.o", "123-456-789");
        Payment payment3 = Shop.sellProduct(product1, company2);
        System.out.println(payment3);
    }
}
