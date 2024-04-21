/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */
public class Main {
    
    public static void main(String[] args) {
        // balok 1
        Balok Balok1 = new Balok(1, 1, 1);
        System.out.println("Balok dengan panjang : " + Balok1.panjang + ", lebar : " + Balok1.lebar + " dan tinggi : "
                + Balok1.tinggi + ". Luasnya : " + Balok1.getLuas() + ", sedangkan kelilingnya : "
                + Balok1.getKeliling() + " dan volumenya : " + Balok1.getVolume() + "\n");
        
        
        // balok 2
        Balok Balok2 = new Balok(30, 40, 50);
        System.out.println("Balok dengan panjang : " + Balok2.panjang + ", lebar : " + Balok2.lebar + " dan tinggi : "
                + Balok2.tinggi + ". Luasnya : " + Balok2.getLuas() + ", sedangkan kelilingnya : "
                + Balok2.getKeliling() + " dan volumenya : " + Balok2.getVolume() + "\n");
        
        // balok 3
        Balok Balok3 = new Balok(25, 35, 45);
        System.out.println("Balok dengan panjang : " + Balok3.panjang + ", lebar : " + Balok3.lebar + " dan tinggi : "
                + Balok3.tinggi + ". Luasnya : " + Balok3.getLuas() + ", sedangkan kelilingnya : "
                + Balok3.getKeliling() + " dan volumenya : " + Balok3.getVolume() + "\n");
        
        
    }
    
}
