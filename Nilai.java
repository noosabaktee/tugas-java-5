/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Nilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan npm: ");
        String npm = input.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nilai kehadiran: ");
        double nilai_kehadiran = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double nilai_tugas = input.nextDouble();
        System.out.print("Masukkan nilai uts: ");
        double nilai_uts = input.nextDouble();
        System.out.print("Masukkan nilai uas: ");
        double nilai_uas = input.nextDouble();
        
        char grade;
        double rata_rata;
        String keterangan;
        rata_rata = (0.1 * nilai_kehadiran) + (0.2 * nilai_tugas) +(0.3 * nilai_uts) + (0.4 * nilai_uas);
        if(rata_rata >= 76){
            grade = 'A';
            keterangan = "ISTIMEWA";
        }else if(rata_rata >= 66){
            grade = 'B';
            keterangan = "BAIK";
        }else if(rata_rata >= 56){
            grade = 'C';
            keterangan = "CUKUP";
        }else if(rata_rata >= 46){
            grade = 'D';
            keterangan = "KURANG";
        }else{
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println();
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nilai rata-rata : " + rata_rata);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);
    }
}
