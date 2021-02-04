/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Kendaraan {
    
    //Mengidentifikasi Atribut
    String jenis, warna, brand;
    int cc, tahunKeluaran;
    
    //Method isi
    public void isi (){
    //Inisialisasi Object Input dari Class Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan Jenis Mobil : ");
    jenis = input.nextLine();
    
    System.out.print("Masukkan Warna Mobil : ");
    warna = input.nextLine();
    
    System.out.print("Masukkan Brand Mobil : ");
    brand = input.nextLine();
    
    System.out.print("Masukkan CC Mobil : ");
    cc = input.nextInt();
    
    System.out.print("Masukkan Tahun Keluaran Mobil : ");
    tahunKeluaran = input.nextInt();
    }
    
    //Method Menampilkan
    public void tampil (){
        System.out.println(" ");
        System.out.println("Jenis Mobil             : "+jenis);
        System.out.println("Warna Mobil             : "+warna);
        System.out.println("Brand Mobil             : "+brand);
        System.out.println("CC Mobil                : "+cc);
        System.out.println("Tahun Keluaran Mobil    : "+tahunKeluaran);
    }
}
