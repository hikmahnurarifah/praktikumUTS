/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

import java.util.Scanner;

/**
 *
 * @author Hikmah
 */
public class PatternD {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah perulangan: ");
        int a = input.nextInt();

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a-i; j++)
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        
    }
    
}
