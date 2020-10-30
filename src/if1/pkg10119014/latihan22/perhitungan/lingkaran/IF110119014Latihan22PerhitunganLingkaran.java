/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan22.perhitungan.lingkaran;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IF110119014Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double diameter,jarijari,luas,keliling;
    final double PHI = 3.14;
    Scanner scanner = new Scanner(System.in);
    System.out.println("=====Perhitungan Lingkaran====");
    System.out.print("Masukan nilai diameter lingkaran :");
    while(true){
        try{
            diameter = Double.parseDouble(scanner.next());
            break;
        }
        catch (NumberFormatException e){
            System.out.println("Nilai Diameter Tidak Sesuai\n");
            System.out.print("Masukan nilai diameter lingkaran : ");        }
    }
    jarijari = diameter /2;
    luas = PHI * jarijari * jarijari;
    keliling = PHI * diameter;
    System.out.println();
    System.out.println("=====Hasil Perhitungan Lingkaran====");
    System.out.printf("Jari-jari Lingkaran\t\t= %.2f%n", jarijari);
    System.out.printf("Luas Lingkaran\t\t\t= %.2f%n", luas);
    System.out.printf("Keliling lingkaran\t\t= %.2f%n",keliling);
        }
    }

    

