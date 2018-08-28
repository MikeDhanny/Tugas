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
public class Barang {
    private String namakasir;
    private int tgltransaksi;
    private int idBarang;
    private String namaBarang;
    public static int harga;
    private String merk;
    
public Barang(int idBarang, String namaBarang,int harga,String merk){
    
    this.idBarang = idBarang;
    this.namaBarang = namaBarang;
    this.harga = harga;
    this.merk = merk;
    
}


public void tampilkan(){
     Scanner masukan = new Scanner(System.in);
    System.out.println("Nama Kasir  = ");
    namakasir = masukan.next();
    System.out.println("Tgl = ");
     tgltransaksi = masukan.nextInt();
    System.out.println(" ");
    System.out.println("<+=============================+>");
    System.out.println("ID Barang    : ");
       idBarang = masukan.nextInt();
    System.out.println("Nama Barang  : ");
    namaBarang = masukan.next();
    System.out.println("Harga        : ");
    harga = masukan.nextInt();
    System.out.println("Merk         : ");
    merk = masukan.next();
}

}






