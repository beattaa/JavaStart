package zajecia6;

import java.util.Random;

public class MyTab {
    public static void main(String[] args) {
        int[][] tab = new int[4][];
        tab[0] = new int[3];
        tab[1] = new int[2];
        tab[2] = new int[4];
        tab[3] = new int[1];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(10);
                System.out.println(tab[i][j]);
            }
        }
    }
}
