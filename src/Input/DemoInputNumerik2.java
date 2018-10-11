/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

import java.io.*;

/**
 *
 * @author user
 */
public class DemoInputNumerik2 {
    public static void main(String[] args) throws IOException{
        System.out.println("Masukkan sebuah bilangan real: ");
        String temp;
        double bilangan = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        temp = br.readLine();
        try{
            bilangan = Double.parseDouble(temp);
        }catch(NumberFormatException nfe){
            System.out.println("Data yang dimasukkan bukan bilangan");
            System.exit(1);
        }
        System.out.println("Bilangan yang dimasukkan " + " adalah " + bilangan);
    }
}
