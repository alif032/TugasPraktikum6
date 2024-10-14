/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author LENOVO LOQ
 */
public class CekBilanganPrima {
    // Method untuk mengecek apakah bilangan prima atau bukan
    public boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method untuk mencetak bilangan prima dan bukan prima dari 0-20
    public void printPrimeNumbers() {
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima.");
            } else {
                System.out.println(i + " adalah bukan bilangan prima.");
            }
        }
    }  
}
