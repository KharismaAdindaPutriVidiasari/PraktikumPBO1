/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pbo1;

/**
 *
 * @author asus
 */
public class PraktikumPBO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi -> proses membuat obyek*/
        KebutuhanKeramik k1 = new KebutuhanKeramik();
        k1.luas = 1000000;
        k1.p = 30;
        k1.l = 30;
        k1.isibox = 10;
        k1.harga = 54000;
        k1.hitungJumlahKeramik();
        k1.hitungBox();
        k1.hitungBiaya();
      
        KebutuhanKeramik k2 = new KebutuhanKeramik();
        k2.luas = 1000000;
        k2.p = 40;
        k2.l = 40;
        k2.isibox = 5;
        k2.harga = 65000;
        k2.hitungJumlahKeramik();
        k2.hitungBox();
        k2.hitungBiaya();
        
        KebutuhanKeramik k3 = new KebutuhanKeramik();
        k3.luas = 1000000;
        k3.p = 30;
        k3.l = 40;
        k3.isibox = 8;
        k3.harga = 60000;
        k3.hitungJumlahKeramik();
        k3.hitungBox();
        k3.hitungBiaya();
    }
}
        