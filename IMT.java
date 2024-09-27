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
public class IMT {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg) : ");
        double bb = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m) : ");
        double tb = input.nextDouble();
        
        double imt = bb/(tb*tb);
        String kriteria;
        if(imt >= 40){
            kriteria = "Sangat Gemuk";
        }else if(imt >= 30){
            kriteria = "Gemuk";
        }else if(imt >= 25){
            kriteria = "Berat Badan Lebih";
        }else if(imt >= 18.5){
            kriteria = "Berat Badan Ideal";
        }else{
            kriteria = "Berat Badan Kurang";
        }
        
        System.out.println("Nilai IMT : " + imt);
        System.out.println("Kriteria : " + kriteria);
    }
}
