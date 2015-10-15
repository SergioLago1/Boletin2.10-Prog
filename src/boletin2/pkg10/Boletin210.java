/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg10;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dinero, billete100, billete20, billete5, moneda1;
        
        Scanner obx = new Scanner(System.in);
        System.out.print("introducir diñeiro: ");
        dinero = obx.nextInt();
         
        billete100 = dinero/100;
        dinero= dinero-billete100*100;
        
        billete20 = dinero/20;
        dinero= dinero-billete20*20;
        
        billete5 = dinero/5;
        dinero= dinero-billete5*5;
        
        moneda1 = dinero/1;
        
        dinero= dinero-(moneda1*1);
        
        
        
        System.out.println("billetes de 100 =" +billete100);
        System.out.println("billetes de 20 =" +billete20);
        System.out.println("billetes de 5 =" +billete5);
        System.out.println("moedas de 1 =" + moneda1);
    }
    
}
