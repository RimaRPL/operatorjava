/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operatorAritmatika;

import java.util.Scanner;

/**
 *
 * @author VICTUS
 */
public class InputMakanan {
    public static void main(String[] args) {
        System.out.println("Menu Makanan:");
        System.out.println("1. Soto Ayam (15000)");
        System.out.println("2. Rawon Daging (17000)");
        
        int soto,rawon,mie,tahu,sate;
        soto=15000;
        rawon=17000;
        
        
        int jumlahBeli,totalSoto,totalRawon,totalSemua,bayar,kembali;
        Scanner input = new Scanner (System.in);
        System.out.println("beli soto berapa ?: ");
        jumlahBeli= input.nextInt ();
        totalSoto=jumlahBeli*soto;
        System.out.println("beli rawon berapa? :");
        jumlahBeli= input.nextInt();
        totalRawon=jumlahBeli*rawon;
        totalSemua=totalSoto+totalRawon;
        System.out.println("Total Pembelian:"+totalSemua);
        System.out.println("Masukkan Pembayaran:");
        bayar=input.nextInt();
        kembali=bayar-totalSemua;
        System.out.println("Jumlah Kembalian:"+kembali);
        
    }
    
}
