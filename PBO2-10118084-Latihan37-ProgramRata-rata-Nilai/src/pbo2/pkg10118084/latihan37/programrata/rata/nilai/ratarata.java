/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan37.programrata.rata.nilai;

import java.util.Scanner;

/**
 *
 *Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menghitung rata rata nilai
 */
public class ratarata {
   public int banyakmahasiswa;
    int ratarata=0;
    int totalnilai=0;
    Scanner Scanner = new Scanner (System.in);
    public void hitungratarata(){
    
       System.out.print("Masukkan Banyaknya Mahasiswa :");  
        banyakmahasiswa=Scanner.nextInt();
        int nilai[] = new int[banyakmahasiswa];
       
        for (int i = 1; i <= banyakmahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-"+ i +" :");
            nilai[i-1] = Scanner.nextInt();
            totalnilai=totalnilai+nilai[i-1];
        }
        
        ratarata=totalnilai/banyakmahasiswa;
        System.out.print(" Maka Rata-rata Nilainya adalah" + ratarata);
    }
      
        
}
