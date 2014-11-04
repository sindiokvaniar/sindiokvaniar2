/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.blits.TugasProcedure;

/**
 *
 * @author user
 */
public class Lingkaran {
    double luas,r;
    final double phi=3.14;
    
    void HitungLingkaran(){
        luas=phi*r*r;
        System.out.println("Luas Lingkaran = "+luas);
    }
    
}
