/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author LENOVO LOQ
 */
import java.util.Scanner;

public class MatrikBeraksi {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Matrik matrik = new Matrik();

        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        matrik.printTable(n);

        // Menutup scanner
        scanner.close();
    } 
}
