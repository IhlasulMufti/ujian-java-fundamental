package com.juaracoding.muftiujian1jf.ujian1;

public class Soal5 {
    public static void main(String[] args) {
        int[] moviePrices = {50000, 60000, 70000, 80000, 90000};

        displayPrices(moviePrices); // Menampilkan harga-harga tiket
    }

    static void displayPrices (int[] prices){
        int totalPrice = 0;

        // Menampilkan harga tiket film
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Harga tiket film "+(i+1)+": "+prices[i]);
            totalPrice += prices[i]; // Menjumlahkan total harga tiket
        }

        // Menampilkan total harga tiket
        System.out.println("Total harga tiket: "+totalPrice);
    }
}
