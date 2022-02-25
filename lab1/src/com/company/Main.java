package com.company;

import java.util.Scanner;

public class Main {

    public static int fact(int n) {
        int f = 1;
        while (n > 0) {
            f *= n;
            n--;
        }
        return f;
    }

    public static int suma(int n) {
        int s = 0;

        for (int i = 0; i <= n; i++)
            if (i % 3 == 0 || i % 5 == 0) s += i;
        return s;
    }


    public static void main(String[] args) {
//  1.	Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la tastatura.
        Scanner scanner = new Scanner(System.in);
//      int n = scanner.nextInt();
//        for (int i = 0; i <= n; i++)
//            System.out.println(i);

//  2.	Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare.
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        if (a > b) System.out.println(a);
//        else System.out.println(b);
//  3.	Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.
//        int n = scanner.nextInt();
//        int answer = fact(n);
//        System.out.println(answer);

//  4.	Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).
//        int n = scanner.nextInt();
//        int s = suma(n);
//        System.out.println(s);


//  5.	Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de paritate
//  (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).
//        int n = scanner.nextInt();
//        int[] x = new int[50];
//        int[] y = new int[50];
//        int cntX = 0;
//        int cntY = 0;
//
//        for (int i = 0; i < n; i++) {
//            int nr = scanner.nextInt();
//            if (nr % 2 == 0) x[cntX++] = nr;
//            else y[cntY++] = nr;
//        }

//   6.	Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura,
//   citirea notelor se opreste si programul afiseaza media acestora.
//        int n = scanner.nextInt();
//        int suma = 0;
//        int[] v = new int[50];
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            int nota = scanner.nextInt();
//            if (nota != -1) {
//                suma += nota;
//                v[cnt++] = nota;
//            } else {
//                System.out.println(Double.valueOf(suma)/cnt);
//                break;
//            }
//        }

    }
}