package com.company;
import java.util.Scanner;
public class UlanganHarian {


    public void lebihBesar(int nilai1, int nilai2) {
        if (nilai1 > nilai2) {
            System.out.println(nilai1);
        } else {
            System.out.println(nilai2);
        }
    }

    public void ganjilGenap(int nilai) {
        if (nilai % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }

    public void sumNumber(int nilai1) {
        int sum = 0;
        for (int i = 1; i <= nilai1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void ganjilGenapII(int nilai) {
        int a[] = new int[nilai];

        System.out.println("Enter values");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even");

            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i] + " is odd");

            }

        }
    }

    public void maxNumberInArray(int nilai) {
        int a[] = new int[nilai];

        System.out.println("Enter values");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Scanner(System.in).nextInt();
        }

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("biggest number is " + max);
    }

    public void sumNumberInArray(int n, int k) {

        int a[] = new int[n];

        System.out.println("Enter values");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Scanner(System.in).nextInt();

        }
        int sum = 0;
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    sum = a[i] + a[j];
                    if (sum == k) {
                        result++;
                    }
                }

            }
        }
        if (result > 0) {
            System.out.println("YES");

        } else {
            System.out.println("NO");

        }
    }

    public void numberExistInArray(int n) {
        int a[] = new int[n];

        System.out.println("Enter values");
        for (int i = 0; i < a.length; i++) {
            a[i] = new Scanner(System.in).nextInt();

        }
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    result++;
                }
            }
        }
        if (result > 0) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }

    public void highestSellingFruits() {

    }

    }




