package id.technicaltestoop;

public class Mahasiswa extends Universitas{
    int id;
    int nim;
    String nama;
    String alamat;
    int nomorTelepon;

    public Mahasiswa(){}

    public Mahasiswa(int nim, String nama, String alamat, int nomorTelepon) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(int nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
}
