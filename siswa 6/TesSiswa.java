import java.util.Scanner;

//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ID : "); 
        int id = in.nextInt();
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();
        //membuat obyek
        Siswa azami = new Siswa();
        Siswa kafi = new Siswa();
        
        Siswa juren = new Siswa(10, 
        "juren", 100);
        Siswa jono = new Siswa(id,nama,ipk); 
        azami.id = 16;
        azami.nama = "Azami";
        azami.ipk = 4;
        System.out.println("Ini Data Azami");
        System.out.println("ID   :"+ azami.id);
        System.out.println("Nama :"+ azami.nama);
        System.out.println("IPK  :"+ azami.ipk);
        System.out.println("Ini Data Kafi");
        System.out.println("ID   :"+ kafi.id);
        System.out.println("Nama :"+ kafi.nama);
        System.out.println("IPK  :"+ kafi.ipk);

        juren.print();
        jono.print();
    }   
}
