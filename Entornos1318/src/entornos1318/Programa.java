/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos1318;

import java.util.Scanner;

/**
 *
 * @author patsus
 */
public class Programa {
    public static void main(String[] args) {
        System.out.println("VAMOS A JUGAR");
        Scanner scan = new Scanner(System.in);
        boolean jugar = true;
        while (jugar){
            int adivinar = 1 + (int) (10.0 * Math.random());
            System.out.print("Dime un numero del 1 al 10: ");
            int num = scan.nextInt();
            if(num==adivinar){
                System.out.println("¡Acertaste! :D");
            }
            else if(num!=adivinar && num!=0){
                System.out.println("¡No! Era el "+adivinar);
            }
            if(num<=0){
                System.out.println("Adios...");
            }
            
        }
    }
    
}
