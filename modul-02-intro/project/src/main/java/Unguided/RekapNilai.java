/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author LENOVO
 */
public class RekapNilai {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */




    public static void main(String[] args) {

        final double KKM = 75.0;

        String[] nama = {
            "Nanda",
            "Nando",
            "Nandi"
        };

        double[][] nilai = {
            {80, 85},
            {70, 75},
            {60, 65}
        };

        System.out.println("=== SISTEM REKAP NILAI MAHASISWA ===");

        for (int i = 0; i < nama.length; i++) {

            double rataRata = (nilai[i][0] + nilai[i][1]) / 2;

            String status;

            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            System.out.println("Nama       : " + nama[i]);
            System.out.println("Modul 1    : " + nilai[i][0]);
            System.out.println("Modul 2    : " + nilai[i][1]);
            System.out.println("Rata-rata  : " + rataRata);
            System.out.println("Status     : " + status);
            System.out.println("-----------------------------");
        }
    }
}



