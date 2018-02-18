package com.example.afifabdurrahim.modul2_afif_1202154147;

/**
 * Created by Afif Abdurrahim on 18/02/2018.
 */

public class PilihMenu {
    int foto;
    String nama;
    int harga;
    String komposisi;

    public PilihMenu(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi() {
        return komposisi;
    }
}

