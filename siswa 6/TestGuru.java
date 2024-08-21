//Drive class
import java.util.Scanner;

public class TestGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama :");
        String Nama = in.nextLine();
        System.out.println("Alamat :");
        String Alamat = in.nextLine();
        System.out.println("Mapel :");
        String Mapel = in.nextLine();
        System.out.println("ID :");
        int id = in.nextInt();
        //membuat obyek
        Guru munif = new Guru();
        Guru firdaus = new Guru();
        Guru bagus = new Guru();
        Guru aulia = new Guru();
        Guru tulus = new Guru();

        Guru aby = new Guru(16, "Aby",
         "Malang", "MTK" );
        munif.id = 11;
        munif.Nama = "Munif";
        munif.Alamat = "Malang";
        munif.Mapel = "PAI";

        firdaus.id = 06;
        firdaus.Nama = "Firdaus";
        firdaus.Alamat = "Malang";
        firdaus.Mapel = "RPL";
        
        bagus.id = 04;
        bagus.Nama = "Bagus";
        bagus.Alamat = "Surabaya";
        bagus.Mapel = "Informatika";

        aulia.id = 12; 
        aulia.Nama = "Aulia";
        aulia.Alamat = "Malang";
        aulia.Mapel = "Tahfidz";

        tulus.id = 05; 
        tulus.Nama = "Tulus";
        tulus.Alamat = "Jakarta";
        tulus.Mapel = "IPAS";

        System.out.println("Ini Data Pak Munif");
        System.out.println(munif.id);
        System.out.println(munif.Nama);
        System.out.println(munif.Alamat);
        System.out.println(munif.Mapel);

        System.out.println("Ini Data Pak Firdaus");
        System.out.println(firdaus.id);
        System.out.println(firdaus.Nama);
        System.out.println(firdaus.Alamat);
        System.out.println(firdaus.Mapel);

        System.out.println("Ini Data Pak Bagus");
        System.out.println(bagus.id);
        System.out.println(bagus.Nama);
        System.out.println(bagus.Alamat);
        System.out.println(bagus.Mapel);

        System.out.println("Ini Data Bu Aulia");
        System.out.println(aulia.id);
        System.out.println(aulia.Nama);
        System.out.println(aulia.Alamat);
        System.out.println(aulia.Mapel);

        System.out.println("Ini Data Pak Tulus");
        System.out.println(tulus.id);
        System.out.println(tulus.Nama);
        System.out.println(tulus.Alamat);
        System.out.println(tulus.Mapel);

        aby.print();
    }
}
