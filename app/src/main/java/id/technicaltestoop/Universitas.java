package id.technicaltestoop;

public class Universitas {
    private int kodeUniversitas;
    private String namaUniversitas;
    private String alamatUniversitas;
    private int nomorTeleponUniversitas;

    public Universitas(){}

    public Universitas(int kodeUniversitas, String namaUniversitas, String alamatUniversitas, int nomorTeleponUniversitas) {
        this.kodeUniversitas = kodeUniversitas;
        this.namaUniversitas = namaUniversitas;
        this.alamatUniversitas = alamatUniversitas;
        this.nomorTeleponUniversitas = nomorTeleponUniversitas;
    }


    public int getKodeUniversitas() {
        return kodeUniversitas;
    }

    public void setKodeUniversitas(int kodeUniversitas) {
        this.kodeUniversitas = kodeUniversitas;
    }

    public String getNamaUniversitas() {
        return namaUniversitas;
    }

    public void setNamaUniversitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
    }

    public String getAlamatUniversitas() {
        return alamatUniversitas;
    }

    public void setAlamatUniversitas(String alamatUniversitas) {
        this.alamatUniversitas = alamatUniversitas;
    }

    public int getNomorTeleponUniversitas() {
        return nomorTeleponUniversitas;
    }

    public void setNomorTeleponUniversitas(int nomorTeleponUniversitas) {
        this.nomorTeleponUniversitas = nomorTeleponUniversitas;
    }
}
