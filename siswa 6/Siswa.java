//Object Class
public class Siswa {
    int id;
    String nama;
    double ipk;

    /*Constructor nama sama dgn nama Class
    */
    public Siswa() {
        id = 0;
        nama = "";
        ipk = 0;
    }

    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        this.id = id;
        this.nama = nama;
        this.ipk = ipk; 
    }

    //method
    public void print() {
        System.out.println("Data dari siswa ");
        System.out.println("ID : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("IPK : " + ipk);
    }
}
