package com.company;

public abstract class Member {
    protected final String nik, nama, noHp;
    protected double saldo;

    public Member(String nik, String nama, String noHp, double saldo) {
        this.nik = nik;
        this.nama = nama;
        this.noHp = noHp;
        this.saldo = saldo;
    }

    public String getNik(){
        return nik;
    }

    public void transaksi (Member other, double nominal){
        this.saldo = this.saldo + nominal;
        other.saldo = other.saldo - nominal;
    }

    public abstract void display();
}