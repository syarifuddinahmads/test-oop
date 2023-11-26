package id.technicaltestoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Mahasiswa mahasiswa;
    private Universitas universitas;
    private List<Mahasiswa> mahasiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mahasiswaList = new ArrayList<>();
        universitas = new Universitas(334455,"ITS","Surabaya Timur",12345678);

        // Tambah Mahasiswa
        tambahMahasiswa(new Mahasiswa(12345,"Doni","Surabaya",123456789),universitas);
        tambahMahasiswa(new Mahasiswa(12334,"Dio","Surabaya",123456789),universitas);
        tambahMahasiswa(new Mahasiswa(12356,"Dewi","Surabaya",123456789),universitas);
        tambahMahasiswa(new Mahasiswa(12377,"Riski","Surabaya",123456789),universitas);
        tambahMahasiswa(new Mahasiswa(12355,"Dodit","Surabaya",123456789),universitas);


        // Show List Mahasiswa
        for (int i = 0; i < mahasiswaList.size(); i++) {
            Mahasiswa mhs = mahasiswaList.get(i);
            Log.d("Mahasiswa","NIM : "+mhs.getNim()+" | Nama : "+mhs.getNama()+" | Alamat : "+mhs.getAlamat()+" | Universitas : "+mhs.getNamaUniversitas());
        }

    }

    private void tambahMahasiswa(Mahasiswa mahasiswa,Universitas universitas){
        mahasiswa.setId(mahasiswaList.size()+1);
        mahasiswa.setNim(mahasiswa.getNim());
        mahasiswa.setNama(mahasiswa.getNama());
        mahasiswa.setAlamat(mahasiswa.getAlamat());
        mahasiswa.setNomorTelepon(mahasiswa.getNomorTelepon());
        // add university
        mahasiswa.setKodeUniversitas(universitas.getKodeUniversitas());
        mahasiswa.setNamaUniversitas(universitas.getNamaUniversitas());
        mahasiswa.setAlamatUniversitas(universitas.getAlamatUniversitas());
        mahasiswa.setNomorTeleponUniversitas(universitas.getNomorTeleponUniversitas());
        mahasiswaList.add(mahasiswa);
    }

    /*
    *
    * # Jawaban  OOP
        1. OOP adalah sebuah metode pengembangan aplikasi yang dirancang dengan
        menggunakan blueprint (object) yang di buat dalam bentuk kecil-kecil dan bersifat
        specific dimana tujuannya supaya mempermudah developer dalam pengembangan.

        Mengapa konsep oop penting, oop penting karena dengan menggunakan konsep oop
        Pengembangan aplikasi akan sangat bisa dilakukan secara terstruktur dan lebih baik,
        Selain itu dengan menggunakan oop kita dapat menerapkan parallel development, reusable,
        coding jauh lebih mudah dan readable


        2.  Konsep Dalam OOP
        encapsulation, pengikatan data tau metode yang berbeda satu sama lain yang disatukan atau dikapsulkan menjadi satu unit data. Lebih jelasnya ialah masing”
        object atau class di satukan dalam satu wadah (class) dimana object/class tersebut tetap berdiri sendiri dan tidak terpengaruh oleh class yang lain.

        inheritance,  atau turunan adalah sebuah class yang memiliki fungsi dengen class induk atau mempunyai kemiripan fungsi dengan class induk


        polymorphism. Bisa diartikan sebagai blueprint (interface) yang mana memiliki banyak bentik, dimana satu (interface) dapat digunakan dibanyak entity yang berbeda.
    *
    * */
}