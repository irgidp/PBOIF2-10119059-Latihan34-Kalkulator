/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan kalkulator
 */
package pboif2.pkg10119059.latihan34.kalkulator;
/**
 * @author Corazon
 */

import java.util.Scanner;

public class PBOIF210119059Latihan34Kalkulator {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Kalkulator cal = new Kalkulator();
    
        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        
        System.out.print("Masukkan Angka ke-1 : ");
        cal.value1 = input.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        cal.value2 = input.nextDouble();
    
        System.out.println("-----------------------------------------");
        System.out.println("Hasil Pertambahan : " +cal.tambahBilangan());
        System.out.println("Hasil Pengurangan : " +cal.kurangBilangan());
        System.out.println("Hasil Perkalian : " +cal.kaliBilangan());
        System.out.println("Hasil Pembagian : " +cal.bagiBilangan());
        System.out.println("Hasil Sisa : " +cal.sisaBilangan());
    }
    
}
