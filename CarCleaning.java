package carCleaning;
import java.util.Scanner;

public class CarCleaning {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        String alamat;
        String telepon;
        String Email;
        String PilihJasa;
        String PilihTeam;
        String PilihJasa2;
        String PilihTeam2;
        String Keterangan;
        String total;
        
        System.out.println("===Car Cleaning.. Anda Pesan Kami Datang===");
        System.out.println("===========================================");
        
        System.out.println("===========================================");
        System.out.println("Masukkan Data: ");
        System.out.print("MAsukkan nama: ");
        nama=input.next();
        System.out.print("Masukkan alamat: ");
        alamat=input.next();
        System.out.print("Masukkan NO TLP: ");
        telepon=input.next();
        System.out.print("Mssukkan Email: ");
        Email=input.next();
        
        System.out.println("*Jenis jasa*");
        System.out.println("1.Cuci Mobil");
        System.out.println("2.Salon Mobil Interior");
        System.out.println("3.Salon Mobil Ekterior");
        
        System.out.print("Pilih Jasa :");
        PilihJasa=input.next();
        
        System.out.println("1.Team Sea (2 Orang) ");
        System.out.println("2.Team Mountain (4 Orang) ");
        System.out.println("4.Team Forest (5 Orang) ");
        
        System.out.println("Pilih Team :");
        PilihTeam2=input.next();
        System.out.println("Masukkan Biaya penyediab Jasa       Rp. 200000");
        System.out.println("Masukkan Biaya Jasa Alat            Rp. 150000");
        System.out.println("Masukkan Biaya Bahan Jasa           Rp. 40000");
        System.out.println("Masukkan Biaya Transfortasi         Rp. 50000");
        
        System.out.println("===========================================");
        System.out.println("===========================================");
        
        System.out.print("Jenis yang Di Pesan       ");
        PilihJasa2=input.next();
        System.out.print("Nama Penyedia Jasa        ");
        PilihTeam2=input.next();
        System.out.print("Keterangan                ");
        Keterangan=input.next();
        
        System.out.print("Total Biaya Yang harus Dibayar");
        total=input.next();
        
        System.out.println("Salam Bersih Andre Terima Kasih");
        
    }
    
}