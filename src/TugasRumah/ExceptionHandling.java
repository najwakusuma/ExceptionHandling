/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasRumah;

/**
 *
 * @author user
 */
public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int result = 18/0;
            System.out.println("Result of division :" + result);
            
            String str = null;
            System.out.println("Length of the String :" + str.length());
            
            String s1 = "abc";
            int convertedInt = Integer.parseInt(s1);
            System.out.println("Converted Integer :" + convertedInt);
            
            char[] ch = new char[4];
            ch[7] = 'B';
        }
        catch(ArithmeticException aex){
            aex.printStackTrace();
        }
        catch(NullPointerException npex){
            System.out.println(npex.toString());
        }
        catch(NumberFormatException nfex){
            System.out.println(nfex.toString());
        }
        catch(ArrayIndexOutOfBoundsException aioobex){
            System.out.println(aioobex.toString());
        }
    }
}
