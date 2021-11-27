package com.company;

public class Costumer extends Member {
    protected Costumer(String nik, String nama, String noHp, double saldo){
        super(nik, nama, noHp, saldo);
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println("---Data Costumer---");
        System.out.println("Nik: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHp);
        System.out.println("Saldo: " + saldo);
    }
}
