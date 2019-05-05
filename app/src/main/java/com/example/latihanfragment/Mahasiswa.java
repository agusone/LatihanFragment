package com.example.latihanfragment;

public class Mahasiswa {
    private int id;

    private String nim,nama,prodi;

    public Mahasiswa(int id, String nim, String nama, String prodi) {
        this.id = id;
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public int getId() {
        return id;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
