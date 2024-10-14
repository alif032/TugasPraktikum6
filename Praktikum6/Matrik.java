/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author LENOVO LOQ
 */
public class Matrik {
    // Method untuk mencetak tabel perkalian
    public void printTable(int n) {
        if (n > 10) {
            System.out.println("Nilai n harus kurang dari atau sama dengan 10.");
            return;
        }

    // Mencetak tabel perkalian
        System.out.println("Tabel perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); 
        }
    }
}
