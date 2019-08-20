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
public class KonverensiSuhu {
    
    public static void main(String[] args) {
        
        //Deklarasi
        double farenheit;
         int celcius;
         
        //Membuat Scanner Baru
         Scanner baca = new Scanner(System.in);
         
        //Input
         System.out.println("==Program hitung perubahan suhu Celcius ke Farenheit==");
         System.out.print("Celcius: ");
         celcius = baca.nextInt();
         
        //Proses
         farenheit = Double.valueOf((9/5 * celcius) + 32);
         
        //Output
         System.out.println("Farenheit = " + farenheit );
         
         
              
    }
    
}
