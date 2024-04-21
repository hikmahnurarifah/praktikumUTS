/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */
public class Balok {
    
    int panjang;
    int lebar;
    int tinggi;
    
    Balok()
    {
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }
    
    Balok(int panjangBaru, int lebarBaru, int tinggiBaru)
    {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }
    
    int getLuas()
    {
        return 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }
    
    int getKeliling()
    {
        return 4 * (panjang+lebar+tinggi);
    }
    
    int getVolume()
    {
        return panjang*lebar*tinggi;
    }
    
    void setPanjang(int panjangBaru)
    {
        panjang = panjangBaru;
    }
    
    void setLebar(int lebarBaru)
    {
        lebar = lebarBaru;
    }
    
    void setTinggi(int tinggiBaru)
    {
        tinggi = tinggiBaru;
    }
}
