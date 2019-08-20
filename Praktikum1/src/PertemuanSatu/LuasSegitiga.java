/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanSatu;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LuasSegitiga {
    
    public static void main (String[] args) {
            
            //Deklarasi
            Double luas;
            int alas, tinggi;
            
            //Membuat scanner baru
            Scanner baca = new Scanner (System.in);
            
            //Input
            System.out.println("==Program hitung luas segitiga");
            System.out.print("Input alas: ");
            alas = baca.nextInt();
            System.out.print("Input tinggi: ");
            tinggi = baca.nextInt();
            
            //Proses
            luas = Double.valueOf((alas * tinggi) / 2);
            
            //Output
            System.out.println("Luas = " + luas );

    }
}
