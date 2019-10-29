package com.example.kuis;

import android.graphics.drawable.Drawable;

public class Keluarga {
    private String nama,anggota;
    public Drawable gambar;

    public Keluarga(Drawable gambar, String nama, String anggota){
        this.gambar = gambar;
        this.nama = nama;
        this.anggota = anggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAnggota() {
        return anggota;
    }

    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }
}
