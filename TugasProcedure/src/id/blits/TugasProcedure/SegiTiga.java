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
public class SegiTiga {
    float luas,alas,tinggi;
    
    void HitungSegiTiga(){
        luas=(alas*tinggi)/2;
        System.out.println("Luas Segi Tiga = "+luas);
    }
}
