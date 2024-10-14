/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author LENOVO LOQ
 */
public class AlphabetPrint {
    // Method untuk mencetak huruf dari Z hingga A
    public void printReverseAlphabet() {
        // Menggunakan loop for untuk mencetak huruf dari Z sampai A
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
