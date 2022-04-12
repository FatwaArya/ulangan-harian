package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//Mana Yang Lebih Besar?
        UlanganHarian ulanganHarian = new UlanganHarian();

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nomer soal: ");
        int soal = input.nextInt();
        switch (soal) {
            case 1:
                System.out.println("Mana Yang Lebih Besar?");
                        System.out.print("Masukkan nilai 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int nilai2 = input.nextInt();

        //call method
        ulanganHarian.lebihBesar(nilai1, nilai2);
                        break;
            case 2:
                        //Ganjil Atau Genap?
        System.out.println("Ganjil Genap");

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        ulanganHarian.ganjilGenap(angka);
                            break;
            case 3:
        //Berapakah jumlahnya?
        System.out.println("Jumlah:");
        int jumlah = input.nextInt();
        ulanganHarian.sumNumber(jumlah);
        break;
            case 4:
                        //Ganjil Genap II
        System.out.println("Ganjil Genap II");
        System.out.println("Masukkan angka : ");
        int hasil = input.nextInt();
        ulanganHarian.ganjilGenapII(hasil);
        break;
            case 5:
                        //Nilai maksimum
        System.out.println("Nilai Maksimum");
        System.out.println("Masukkan angka : ");
        int angka1 = input.nextInt();
        ulanganHarian.maxNumberInArray(angka1);
        break;
            case 6:
                        //Mungkinkah?
        System.out.println("Mungkinkah?");
        System.out.println("Masukkan jumlah : ");
        int jumlah1 = input.nextInt();
        System.out.println("Masukkan angka : ");
        int angka2 = input.nextInt();

        ulanganHarian.sumNumberInArray(jumlah1, angka2);
        break;
            case 7:

        //apakah semua berbeda?
        System.out.println("Apakah semua berbeda?");
        System.out.println("Masukkan jumlah : ");
        int jumlah2 = input.nextInt();
        ulanganHarian.numberExistInArray(jumlah2);
        break;
            case 8:
                int i, index,  jum[], max;
                String fruit[], fruitMax = null;

                Scanner scan = new Scanner(System.in);

                System.out.println("========== Menentukan Buah Terbanyak ==========\n");

                System.out.print("Inputkan jumlah buah : " );
                index = scan.nextInt();
                fruit = new String[index];
                jum = new int[index];

                System.out.println("\nMasukkan " + index + " buah");
                for (i = 0; i < index; i++) {
                    System.out.print("Buah[" + (i) + "]             : ");
                    fruit[i] = scan.next();

                    System.out.print("Jumlah              : ");
                    jum[i] = scan.nextInt();

                    System.out.println("");
                }

                System.out.println("Data Buah");

                max = jum[0];
                fruitMax = fruit[0];
                for(i = 0; i < index; i++){
                    System.out.print(fruit[i] +  " = " + jum[i] + "\n");
                    if(jum[i] > max){
                        fruitMax = fruit[i];
                    }
                }

                System.out.println("\nBuah terbanyak = " +  fruitMax);
                break;

        }










    }
}
