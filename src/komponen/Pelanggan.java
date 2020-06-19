/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponen;

/**
 *

 */
public class Pelanggan {
 /**
 * Pelanggan
 */
    Konsumen konsumen;
    int nrp;
    Paket paket;
    public Pelanggan(Konsumen konsumen, int nrp, Paket paket) {
        this.konsumen = konsumen;
        this.nrp = nrp;
        this.paket = paket;
    }


    public int calc() {
        int hrg;

        int tgl = konsumen.tgl;
        int bulan = konsumen.bulan;

        if (paket.nama == "reguler") {
            System.out.println(nrp/100);
            hrg = paket.harga - (paket.harga * nrp / 100) ; 
        } else if (paket.nama == "gold"){
            hrg = paket.harga - (paket.harga * tgl/100);
        }else{
            hrg = paket.harga - (paket.harga * bulan/100);
        }
        return hrg;

    }
    
}


