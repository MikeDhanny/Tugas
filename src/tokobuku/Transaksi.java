/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobuku;

import java.util.Scanner;

/**
 *
 * @author Mikedhanny
 */

class Transaksi extends Pembeli{
    private static int jml;
    
    public Transaksi(int idBarang, String namaBarang, int harga, String merk, int idPembeli, String namaPembeli, 
            String alamat, String notelp, int jml) {
        super(idBarang, namaBarang, harga, merk, idPembeli, namaPembeli, alamat, notelp);
        this.jml = jml;
    }
    
    public void tampilkan(){
             Scanner masukan = new Scanner(System.in); 
        super.tampilkan();
        System.out.println("Jumlah Barang: ");
        jml = masukan.nextInt();
    }
    
    public static void main(String[] args) {
         Transaksi tr = new Transaksi(0 ,"",0,"",0,"","","",0);
        tr.tampilkan();
          System.out.println("Total harga  : " + (harga * jml));
        
    }
    
}
