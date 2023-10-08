package ProduktifRPL;

import java.util.Scanner;

public class TugasProduktif {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int harga,jumlah,total=0;
        String barang ;
        char yt;

        do{
        System.out.println("1.Sabun Cuci 15000\n 2.Minyak Goreng 40000\n 3.Telur 25000\n 4.Beras 13500\n 5.Gula 12500");
        System.out.println("Masukkan pilihan barang ");
        barang = input.nextLine();
        switch(barang){
            case "1":
             harga = 15000;
             total = total + harga;
             break;
            case "2":
             harga = 40000;
             total = total + harga;
             break;
            case "3":
             harga = 25000;
             total = total + harga;
             break;
            case "4":
             harga = 13500;
             total = total + harga;
             break;
            case "5":
             harga = 12500;
             total = total + harga;
             break;
            default:
            System.out.println("Pilihan tidak valid");
            continue;
        }
        System.out.println("Mau lanjut : (Ya/Tidak) ");
        yt = input.next().charAt(0);

         if (yt == 'y'){
         } else if (yt == 't'){
            break;
         }else{
            System.out.println("SYSTEM ERROR ");
            return;
         }
        }while(true);

        System.out.println("Harga Total : "+total);

        
        

        

    }
}
