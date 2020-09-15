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
public class KebutuhanKeramik {
    /* membuat atribut*/
    int luas;
    int p;
    int l;
    int isibox;
    int harga;
    
    /*membuat methods*/
    void hitungJumlahKeramik (){
        int keramik;
        keramik=this.luas / (this.p * this.l);
        System.out.println("JumlahKeramik: " + keramik + "keramik");
    }
    void hitungBox(){
        int box;
        box = (this.luas / (this.p * this.l)) / this.isibox;
        System.out.println("Total box: " + box + "Box");
    }
    void hitungBiaya(){
        int biaya;
        biaya = ((this.luas / (this.p * this.l))) / this.isibox * this.harga;
        System.out.println("Total Biaya: " + biaya + "rupiah");
    }
}
