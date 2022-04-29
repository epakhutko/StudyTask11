package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(in).useLocale(Locale.ENGLISH);
        System.out.println("Input number of lines");
        int n = inp.nextInt();
        if (n<1) {
            System.out.println("Incorrect input");
            return;
        }

        System.out.println("Input number of columns");
        int m = inp.nextInt();
        if (m<1) {
            System.out.println("Incorrect input");
            return;
        }
        double[][] Arr;
        Arr = new double[n][m];
        double r;
        System.out.println("Input array contents");
        for (int i=0; i<n; i++) {
            for (int w=0; w<m; w++){
                r = inp.nextDouble();
                Arr[i][w]=r;
                //System.out.printf("%f\n", Arr[i][w]);
            }
        }

        System.out.println("Array multiplied by 3: ");

        for (int j=0; j<m; j++) {
            r=Arr[0][j] * 3;
            System.out.printf("%f\n", r);
        }


    }
}