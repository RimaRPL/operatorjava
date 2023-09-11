import java.util.Scanner;

public class NilaiKKM {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Masukkan Nama: ");
       String nama = input.nextLine();
       System.out.println("Masukkan Nilai: ");
       int nilai = input.nextInt();

       if(nilai >= 96 && nilai <= 100){
        System.out.println("A");
        System.out.println("Sangat Baik");
       }else if(nilai >= 91 && nilai <= 95 ){
        System.out.println("A-");
        System.out.println("Sangat Baik");
       }else if(nilai >= 86 && nilai <= 90 ){
        System.out.println("B+");
        System.out.println("Baik");
       }else if(nilai >= 81 && nilai <= 85 ){
        System.out.println("B");
        System.out.println("Baik");
       }else if(nilai >= 75 && nilai <=80 ){
        System.out.println("B-");
        System.out.println("Baik");
       }else if(nilai >= 70 && nilai <= 74 ){
        System.out.println("C+");
        System.out.println("Cukup");
       }else if(nilai >= 65 && nilai <= 69 ){
        System.out.println("C");
        System.out.println("Cukup");
       }else if(nilai >= 60 && nilai <= 64 ){
        System.out.println("C-");
        System.out.println("Cukup");
       }else if(nilai >= 55 && nilai <= 59 ){
        System.out.println("D+");
        System.out.println("Kurang");
       }else if(nilai >= 0 && nilai <= 54 ){
        System.out.println("D");
        System.out.println("Kurang");
       }
    }
}
