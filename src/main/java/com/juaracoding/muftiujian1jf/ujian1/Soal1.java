package com.juaracoding.muftiujian1jf.ujian1;

public class Soal1 {
    public static void main(String[] args) {
        // Test 1
        movieTicketInfo("Avengers: Endgame", 50000, (byte) 3);

        // Test 2
        movieTicketInfo("Agak Laen", 70000, (byte) 5);
    }

    // Method menampilkan informasi tiket film
    static void movieTicketInfo(String name, int price, byte qty){
        System.out.println("Nama Film\t: "+name);
        System.out.println("Harga Tiket\t: "+price);
        System.out.println("Jumlah Tiket: "+qty);
    }
}
