import java.util.Scanner;

import static java.lang.String.*;

public class Base3 {
    public static void main(String[] args) {
        Scanner inputAr = new Scanner(System.in);
        int ar[];
        ar = new int[20];
        System.out.println("Insert array elements:");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = inputAr.nextInt();
        }
        System.out.println();

        int elmin = Integer.MIN_VALUE;
        int elmax = Integer.MAX_VALUE;
        for (int arEl : ar) {
            if (arEl < 0 && arEl > elmin)
                elmin = arEl;
        }
        System.out.println("Максимальный отрицательный элемент: " + valueOf(elmin));

        for (int arEl : ar) {
            if (arEl > 0 && arEl < elmax)
                elmax = arEl;
        }
        System.out.println("Минимальный положительный элемент: " + valueOf(elmax));

        int nMax = 0;
        int nMin = 0;
        for (int i = 0; i < ar.length; i++) {

            if (ar[i] == elmax) {
                nMax = i;
            }
            if (ar[i] == elmin) {
                nMin = i;
            }
        }
        System.out.println("Индекс минимального положительного элемента: " + valueOf(nMax));
        System.out.println("Индекс максимального отрицательного элемента: " + valueOf(nMin));
        int tmp = ar[nMax];
        ar[nMax] = ar[nMin];
        ar[nMin] = tmp;

        for (int item : ar) {
            System.out.println(item + ",");
        }
    }
}