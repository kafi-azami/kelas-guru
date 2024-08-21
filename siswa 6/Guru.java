//Object Class
public class Guru {
    int id;
    String Nama, Alamat, Mapel = "";

    //Constructor Name same as Class Name 
    public Guru() {
        id = 0;
        Nama = "";
        Alamat = "";
        Mapel = "";
    }

    //Constructor Parameter
    public Guru(int id, String Nama, String Alamat, String Mapel) {
        this.id = id;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Mapel = Mapel;
    }

    //Method
    public void print() {
        System.out.println("ID :"+ id);
        System.out.println("Nama :"+ Nama);
        System.out.println("Alamat :"+ Alamat);
        System.out.println("Mapel :"+ Mapel);
    }
}