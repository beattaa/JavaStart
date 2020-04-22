package zajecia6;

public class Przekatne {
    public static void main(String[] args) {
        int[][] tab = new int[11][11];
        for (int i = 0; i < 11; i++) {
            int k = i;
            for (int j = 0; j < 11; j++) {
                tab[i][j] = k * k;
                k++;
                System.out.print(tab[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
