package com.juaracoding.muftiujian1jf.ujian1;

public class Soal3 {
    public static void main(String[] args) {
        int ticketQty = 6;
        boolean isWeekday = true;

        // Test 1 (Weekday)
        System.out.println("Jumlah tiket: "+ticketQty);
        ticketPrice(ticketQty, isWeekday);

        // Test 2 (Weekend)
        System.out.println("Jumlah tiket: "+ticketQty);
        ticketPrice(ticketQty, !isWeekday);
    }

    static void ticketPrice(int qty, boolean isWeekday){
        int totalPrice;
        boolean isDiscount = false;
        double discount = 0.0;

        // Mengecek dan menyimpan diskon
        if(qty > 5) {
            isDiscount = true;
            discount = 0.1; // Diskon 10%
        }

        // Menghitung total harga tiket
        if(isWeekday){
            totalPrice = (int) (qty * (35000*(1-discount))); // Diskon 10% = Bayar hanya 90%
        }else{
            totalPrice = (int) (qty * (45000*(1-discount)));
        }

        // Menampilkan harga total tiket
        if(isDiscount){
            System.out.println("Total harga (dengan diskon): "+totalPrice);
        }else{
            System.out.println("Total harga (tanpa diskon): "+totalPrice);
        }
    }
}
