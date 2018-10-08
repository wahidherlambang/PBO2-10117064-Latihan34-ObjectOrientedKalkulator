/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan34.objectorientedkalkulator;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * menggunakan kalkulator bilangan.
 */
public class Kalkulator {
    public double tambahBilangan(double value1, double value2) {
        double hasil = value1 + value2;
        return hasil;
    }
    public double kurangBilangan(double value1, double value2) {
        double hasil = value1 - value2;
        return hasil;
    }
    public double kaliBilangan(double value1, double value2) {
        double hasil = value1 * value2;
        return hasil;
    }
    public double bagiBilangan(double value1, double value2) {
        double hasil = value1 / value2;
        
        return hasil;
    }
    public double sisaBilangan(double value1, double value2) {
        double hasil = value1 % value2;
        
        return hasil;
    }
}