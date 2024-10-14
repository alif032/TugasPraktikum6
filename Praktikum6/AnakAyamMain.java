/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author LENOVO LOQ
 */
public class AnakAyamMain {
       public static void main(String[] args) {
        // Membuat objek dari class AnakAyam
        AnakAyam anakAyam = new AnakAyam();

        // Memanggil method untuk mencetak lagu Anak Ayam Turun N
        int jumlahAnakAyam = 10; // Ganti nilai ini sesuai jumlah yang diinginkan
        System.out.println("Lagu Anak Ayam Turun " + jumlahAnakAyam + ":");
        anakAyam.laguAnakAyam(jumlahAnakAyam);
    } 
}
