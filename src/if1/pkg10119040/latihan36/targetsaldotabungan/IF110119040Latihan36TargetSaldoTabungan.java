/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan36.targetsaldotabungan;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * Program ini membuat sebuah target sebuah tabungan
 */
public class IF110119040Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        
        tabungan.setSaldo(3500000);
        tabungan.setTarget(6000000);
        tabungan.setBunga(0.08);
        
        tabungan.hitungTarget();
    }
    
}
