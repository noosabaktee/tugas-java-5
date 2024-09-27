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
public class Potongan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pembelian : ");
        double pembelian = input.nextDouble();
        double discount;
        if(pembelian < 50000){
            discount = 0.05;
        }else{
            discount = 0.2;
        }
        System.out.println("Total pembelian : " + pembelian);
        System.out.println("Besarnya potongan : " + (pembelian * discount));
        System.out.println("Jumlah yang harus dibayar : " + (pembelian - (pembelian * discount)));
    }
}
