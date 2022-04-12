package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//Mana Yang Lebih Besar?
        UlanganHarian ulanganHarian = new UlanganHarian();

        Scanner input = new Scanner(System.in);

        //input data
//        System.out.print("Masukkan nilai 1 : ");
//        int nilai1 = input.nextInt();
//        System.out.print("Masukkan nilai 2 : ");
//        int nilai2 = input.nextInt();
//
//        //call method
//        ulanganHarian.lebihBesar(nilai1, nilai2);

//        //Ganjil Atau Genap?
//        System.out.println("Ganjil Genap");
//
//        System.out.print("Masukkan angka : ");
//        int angka = input.nextInt();
//        ulanganHarian.ganjilGenap(angka);
//
//        //Berapakah jumlahnya?
//        System.out.println("Jumlah:");
//        int jumlah = input.nextInt();
//        ulanganHarian.sumNumber(jumlah);


//        //Ganjil Genap II
//        System.out.println("Ganjil Genap II");
//        System.out.println("Masukkan angka : ");
//        int hasil = input.nextInt();
//        ulanganHarian.ganjilGenapII(hasil);


//        //Nilai maksimum
//        System.out.println("Nilai Maksimum");
//        System.out.println("Masukkan angka : ");
//        int angka = input.nextInt();
//        ulanganHarian.maxNumberInArray(angka);

//        //Mungkinkah?
//        System.out.println("Mungkinkah?");
//        System.out.println("Masukkan jumlah : ");
//        int jumlah = input.nextInt();
//        System.out.println("Masukkan angka : ");
//        int angka = input.nextInt();
//
//        ulanganHarian.sumNumberInArray(jumlah, angka);

//        //apakah semua berbeda?
//        System.out.println("Apakah semua berbeda?");
//        System.out.println("Masukkan jumlah : ");
//        int jumlah = input.nextInt();
//        ulanganHarian.numberExistInArray(jumlah);

        //penjualan Buah
        System.out.println("Penjualan Buah");
        System.out.println("Masukkan panjang array : ");
        int values = input.nextInt();
        System.out.println("Masukkan nama buah : ");
        String namaBuah = input.next();
        System.out.println("Masukkan jumlah : ");
        int jumlah = input.nextInt();
        ulanganHarian.highestSellingFruits(values,namaBuah, jumlah);
    }
}
