/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponen;

import java.util.Scanner;

/**
 *

 */
public class NewClass {
    

public static void main(String[] args) throws Exception {

        Paket reguler = new Paket(1, "reguler","Kelas Biasa + Modul + Journal", 4800000);
        Paket gold = new Paket(1, "gold","Kelas Full AC + Modul + Journal + Snack", 9600000);
        Paket premium = new Paket(1, "premium","Kelas Full AC + Modul Exclusive + Journal + Snack +1 buah T-Shirt", 16000000);
        Paket pilihan;

        Scanner scan = new Scanner(System.in);

        System.out.println("nama: ");
        String nama = scan.next();
        System.out.println("nrp: ");
        int nrp = scan.nextInt();
        System.out.println("tgl: ");
        int tgl = scan.nextInt();
        System.out.println("bulan: ");
        int bulan = scan.nextInt();
        System.out.println("alamat: ");
        String alamat = scan.next();
        System.out.println("pilih paket: ");
        int p = scan.nextInt();
        scan.close();
        if (p == 1) {
            pilihan = reguler;
        }else if(p == 2){
            pilihan = gold;
        }else{
            pilihan = premium;
        }


        Konsumen gua = new Konsumen(0, nama, tgl, bulan, alamat);

        Pelanggan a = new Pelanggan(gua,nrp,pilihan);


        System.out.println(a.calc());
    }
}

    

