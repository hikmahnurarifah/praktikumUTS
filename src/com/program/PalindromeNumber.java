/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

/**
 *
 * @author Hikmah
 */
import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga digit integer: ");
        int bilangan = input.nextInt();

        if (isPalindrome(bilangan)) {
            System.out.println(bilangan + " adalah palindrom");
        } else {
            System.out.println(bilangan + " bukan palindrom");
        }
        
    }
    
    public static boolean isPalindrome(int bilangan) {
        int bilanganAwal = bilangan;
        int reversedNumber = 0;

        while (bilangan != 0) {
            int digit = bilangan % 10;
            reversedNumber = reversedNumber * 10 + digit;
            bilangan /= 10;
        }

        return bilanganAwal == reversedNumber;
    }
    
}
