/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operatorAritmatika;

/**
 *
 * @author VICTUS
 */
public class programindeks {
    public static void main(String[] args) {
        String namasiswa = "rima";
        double beratBadan = 39.3;
        double tinggiBadan = 1.50;
        
        double bmi =
                (beratBadan/(tinggiBadan*tinggiBadan));
        
        System.out.println("Nama Siswa :"+namasiswa);
        System.out.println("Berat Badan :"+beratBadan);
        System.out.println("Tinggi Badan :"+tinggiBadan);
        System.out.println("Nilai Indeks :"+bmi);
    }
}
