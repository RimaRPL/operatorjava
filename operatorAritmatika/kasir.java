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
public class kasir {
    public static void main(String[] args) {
        System.out.println("Menu Makanan:");
        System.out.println("1. Soto Ayam (15000)");
        System.out.println("2. Rawon Daging (17000)");
        System.out.println("3. Mie Goreng (5000)");
        System.out.println("4. Tahu Telor (8000)");
        System.out.println("5. Sate Kambing (20000)");
        
        int soto,rawon,mie,tahu,sate;
        soto=15000;
        rawon=17000;
        mie=5000;
        tahu=8000;
        sate=20000;
        
        int jumlahBeli,totalSoto,totalRawon,totalMie,totalTahu,totalSate,totalSemua,bayar,kembali;
        Scanner input= new Scanner (System.in);
        System.out.println("Beli Soto Berapa? :");
        jumlahBeli=input.nextInt();
        totalSoto=jumlahBeli*soto;
        System.out.println("Beli Rawon Berapa?:");
        jumlahBeli=input.nextInt();
        totalRawon=jumlahBeli*rawon;
        System.out.println("Beli Mie Berapa?:");
        jumlahBeli=input.nextInt();
        totalMie=jumlahBeli*mie;
        System.out.println("Beli Tahu Berapa?:");
        jumlahBeli=input.nextInt();
        totalTahu=jumlahBeli*tahu;
        System.out.println("Beli Sate Berapa?:");
        jumlahBeli=input.nextInt();
        totalSate=jumlahBeli*sate;
        totalSemua=totalSoto+totalRawon+totalMie+totalTahu+totalSate;
        System.out.println("Total Pembelian:"+totalSemua);
        System.out.println("Masukkan Pembayaran :");
        bayar=input.nextInt();
        kembali=bayar-totalSemua;
        System.out.println("Jumlah Kembalian :"+kembali);
    }
    
}
