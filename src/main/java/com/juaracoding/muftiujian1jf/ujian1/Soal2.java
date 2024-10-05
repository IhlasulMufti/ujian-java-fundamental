package com.juaracoding.muftiujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input user
        System.out.print("Masukkan nama film: ");
        String movieName = scanner.nextLine();

        // Menampilkan nama film dalam uppercase
        upperCaseDisplay(movieName);
    }

    // Method menampilkan nama film dalam uppercase
    static void upperCaseDisplay(String name){
        System.out.println("Nama film dalam huruf besar: "+name.toUpperCase());
    }
}
