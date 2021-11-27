package com.company;

public class Driver extends Member {
    protected String noPlat;
    protected String jenis;

    public Driver(String nik, String nama, String noHp, double saldo, String noPlat, String jenis){
        super(nik, nama, noHp, saldo);
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("-----Member-----");
        System.out.println("---Data Driver---");
        System.out.println("Nik: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHp);
        System.out.println("Saldo: " + saldo);
        System.out.println("No Plat: " + noPlat);
        System.out.println("Jenis: " + jenis);
    }

}
