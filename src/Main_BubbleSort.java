import Sorts.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class Main_BubbleSort {
    public static void main(String[] args) throws Exception {
        BubbleSort bubbleSort = new BubbleSort();
        int[] num = new int[100000];

        //Cenario 1 - A lista de números deve estar aleatoriamente ordenada.

        /*System.out.println("Cenario 1");
        for (int j = 0; j < num.length; j++) {
            Random rand = new Random();
            num[j] = rand.nextInt(100000);
        }
        System.out.println(Arrays.toString(num));

        try (TimeCode t = new TimeCode()) {
            bubbleSort.bubbleSort(num);
        }*/

        //Cenario 2 - A lista de números deve estar ordenada de maneira decrescente.

        /*System.out.println("Cenario 2");

        for (int j = 99999; j > 0; j--) {
            num[j] = j;
        }

        try (TimeCode t = new TimeCode()) {
            bubbleSort.bubbleSort(num);
        }*/

        //Cenario 3 - A lista de números deve estar ordenada de maneira crescente.

        System.out.println("Cenario 3");

        for (int j = 0; j < 100000; j++) {
            num[j] = j;
        }

        try (TimeCode t = new TimeCode()) {
            bubbleSort.bubbleSort(num);
        }
    }
}
