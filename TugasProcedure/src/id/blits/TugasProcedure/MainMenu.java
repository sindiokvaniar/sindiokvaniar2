/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.blits.TugasProcedure;

/**
 *
 * @author KP
 */
public class MainMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang hitung = new PersegiPanjang();
        hitung.panjang = 7;
        hitung.lebar = 9 ;
        hitung.HitungPersegiPanjang();
        
        Persegi hit = new Persegi();
        hit.sisi = 8 ;
        hit.HitungPersegi();
        
        SegiTiga tiga = new SegiTiga();
        tiga.alas = 4;
        tiga.tinggi = 7;
        tiga.HitungSegiTiga();
        
        Trapesium tra = new Trapesium();
        tra.a = 9 ;
        tra.b = 7 ;
        tra.t = 11 ;
        tra.HitungTrapesium();
        
        Lingkaran bulat = new Lingkaran();
        bulat.r = 7 ;
        bulat.HitungLingkaran();
        
        
    }
    
}
