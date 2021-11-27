package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Member> members = new ArrayList<>();

    public void main (){
        int menu;
        do{
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Input Driver");
            System.out.println("2. Input Costumer");
            System.out.println("3. Data Member");
            System.out.println("4. Top Up saldo ");
            System.out.println("5. Bayar driver");
            System.out.println("6. Keluar");
            System.out.println("Input pilihan");
            menu = scanner.nextInt();
            switch (menu){
                case 1: inputDriver();
                    break;
                case 2 : inputCostumer();
                    break;
                case 3 : dataMember();
                    break;
                case 4 : transaksi(0);
                    break;
                case 5 : transaksi(1);
                    break;
                case 6 :
                    System.out.println("Terima Kasih telah berlangganan");
                    break;
            }
        } while (menu != 6);

    }

    private void inputDriver(){
        System.out.println("Nik: " );
        String nik = scanner.next();
        System.out.println("Nama: " );
        String nama = scanner.next();
        System.out.println("No HP: " );
        String noHp = scanner.next();
        System.out.println("Saldo: " );
        double saldo = scanner.nextDouble();
        System.out.println("No Plat: " );
        String noPlat = scanner.next();
        System.out.println("Jenis Kendaraan: " );
        String jenis = scanner.next();

        Driver driver = new Driver(nik, nama,  noHp, saldo, noPlat, jenis);
        members.add(driver);
    }

    private void inputCostumer(){
        System.out.println("Nik: " );
        String nik = scanner.next();
        System.out.println("Nama: " );
        String nama = scanner.next();
        System.out.println("No HP: " );
        String noHp = scanner.next();
        System.out.println("Saldo: " );
        double saldo = scanner.nextDouble();

        Costumer costumer= new Costumer(nik, nama, noHp, saldo);
        members.add(costumer);
    }

    private void dataMember(){
        for(Member m: members){
            m.display();
        }

    }

    private Member cariNik(String nikMember){
        Member m = null;
        for(Member i: members){
            if(i.getNik().equals(nikMember)){
                m = i;
                break;
            }
        }
        return m;
    }

    private void transaksi(int tipe){
        System.out.println("NIK Driver: ");
        String nikDriver = scanner.next();
        System.out.println("NIK Costumer: ");
        String nikCostumer = scanner.next();
        System.out.println("Biaya: ");
        double biaya = scanner.nextDouble();

        Member costumer = cariNik(nikCostumer);
        Member driver = cariNik(nikDriver);

        if(costumer != null && driver !=null &&(costumer instanceof Costumer) && (driver instanceof Driver)){
            if(tipe == 0) {
                costumer.transaksi(driver, biaya);
            }else{
                driver.transaksi(costumer, biaya);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.main();
    }
}