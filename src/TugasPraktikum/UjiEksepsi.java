/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UjiEksepsi extends Exception{
    private int bilangan;
    UjiEksepsi(){
    }
    UjiEksepsi(String pesan){
        super(pesan);
    }
    UjiEksepsi(String pesan , int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}

class ExceptionHandling{
    public static double Akar(double a, double b, double c) throws UjiEksepsi{
        double d = 0;
        if(d<0){
            throw new UjiEksepsi("d < 0, akar - akarnya Bil.Imajiner, diubah ke Bil.Komplek\n");
        }
        double x1 = (-b+Math.sqrt(d))/2*a;
        double x2 = (-b+Math.sqrt(d))/2*a;
        System.out.printf("\tPersamaan Kuadrat : %.0fX + (&.0f)X2 + (%.1f)", a,b,c,d);
        System.out.printf("\n\tAkar - akar persamaannya : \n\tx1= %.1f V X2 = %.1f", a, x1, x2);
        return 0;
    }
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        double a,b,c;
        System.out.printf("\tInput Nilai a = ");
        a = baca.nextDouble();
        System.out.printf("\tInput Nilai b = ");
        b = baca.nextDouble();
        System.out.printf("\tInput Nilai c = ");
        c = baca.nextDouble();
        double d = 0;
        d = b*b-4*a*c;
        try{
            System.out.printf("\t" +Akar(a,b,c));
        }catch(UjiEksepsi ine){
            double e;
            e = Math.abs(d);
            System.out.printf("\tPersamaan Kuadrat : %.0fX + (%.0f)X2 + (%.1f)\n", a, b, c);
            System.out.printf("\n\tAkar - akar persamaannya(bil.komplek) : \n\n\t\tx1= " + (-b) + " + " + (Math.sqrt(e)/2) * a 
                    + "j V X2 = " + (-b) + " - " + (Math.sqrt(e)/2) * a + "j");
            System.out.println("\n\t-----------------------------------------------------\n");
            ine.printStackTrace();
        }
    }
}
