/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author LENOVO LOQ
 */
public class AnakAyam {
    // Method untuk mencetak lagu "Anak Ayam Turun N"
    public void laguAnakAyam(int n) {
        while (n > 0) {
            System.out.println("Anak ayam turun " + n);
            n--;
            if (n > 0) {
                System.out.println("Mati satu tinggal " + n);
            } else {
                System.out.println("Mati satu tinggal induknya.");
            }
        }
    }  
}
