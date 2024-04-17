package amalikpd2033_k311mkpd014;
import java.util.Scanner;

public class AmaliKPD2033_K311MKPD014 {
    public static void main(String[] args) {
    
        String nama;
        int hari_kerja;
        double gaji = 160;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Pekerja : ");
        nama = input.nextLine();
        
        System.out.println("Masukkan bilangan hari bekerja : ");
        hari_kerja = input.nextInt();
        
        do {  
            if (hari_kerja > 31) {
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari.");
                System.out.print("Masukkan SEMULA bilangan hari bekerja : ");
                hari_kerja = input.nextInt();
            }
        } while (hari_kerja > 31);
            
        gaji = hari_kerja * gaji;
           
        System.out.println("Rumusan gaji bulanan bagi : " + nama);
        System.out.println("Jumlah hari bekerja :  " + hari_kerja);
        System.out.println("GAJI SEBULAN ADALAH " + gaji);
    }   
}
