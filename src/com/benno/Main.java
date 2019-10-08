package com.benno;
import java.text.DecimalFormat;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menghitung Saldo Tabungan
     */

public class Main {

    public static void main(String[] args) {
        DecimalFormat satuan = new DecimalFormat();

        int Saldo = 2500000;
        double bunga = 0.15;
        int i = 1;

        while (i < 7) {
            Saldo += (Saldo * 0.15);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(Saldo));
            i++;
        }
    }
}
