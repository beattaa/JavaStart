package zajecia14.zadanie1;

public class Test {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 2, 1};
        System.out.println(Check.isPalindrome(tab1));
        int[] tab2 = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(Check.isPalindrome(tab2));
        int[] tab3 = {1, 2, 3, 4, 1};
        System.out.println(Check.isPalindrome(tab3));
    }
}
