package zajecia18.zadanie1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(8, n -> n + 1)
                .filter(n -> n > 100)
                .filter(n -> n % 5 == 0)
                .limit(10)
                .map(n -> n * 3)
                .forEach(System.out::println);
    }
}
