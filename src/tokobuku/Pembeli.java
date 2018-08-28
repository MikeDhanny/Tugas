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
 
  class Pembeli extends Barang{
    private int idPembeli;
    private String namaPembeli;
    private String alamat;
    private String notelp;
    
    
    public Pembeli(int idBarang, String namaBarang, int harga, String merk, int idPembeli, 
            String namaPembeli, String alamat, String notelp) {
        super(idBarang, namaBarang, harga, merk);
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.notelp = notelp;
    }
    
    public void tampilkan(){
        Scanner masukan = new Scanner(System.in);
        super.tampilkan();
        System.out.println("ID pembeli   : ");
        idPembeli = masukan.nextInt();
        System.out.println("Nama Pembeli : ");
         namaPembeli = masukan.next();
        System.out.println("Alamat       : ");
         alamat = masukan.next();
        System.out.println("No Telepon   : ");
          notelp = masukan.next();
    }
    
}


