import java.util.Scanner;
public class Zookeeper {
    Scanner in = new Scanner();
    public String nama, alamat;
    public int no_hp;
    private java.lang.Object System;

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

    public int getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(int no_hp) {
        this.no_hp = no_hp;
    }

    public void dataZookeeper(){
        System.out.println("Nama       : Alshad");
        System.out.println("Alamat     : Bandung");
        System.out.println("No Hp      : 083823268296");
        System.out.println("\n");
    }
}
}
