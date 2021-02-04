/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        //Judul Program
         System.out.println("=================================================================");
         System.out.println("                  PROGRAM SPESIFIKASI KENDARAAN                  ");
         System.out.println("=================================================================");
         System.out.println(" ");
         
        //Object
        Kendaraan panggil = new Kendaraan();
        
        //Menjalankan Method
        panggil.isi();
        panggil.tampil();
        
        System.out.println("-----------------------------------------------------------------");
    }
    
}
