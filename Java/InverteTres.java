
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAYCON
 */
public class InverteTres {
     public static void main(String[] args) {
       int resto= 0;
       Scanner numero = new Scanner(System.in);

       System.out.println("Digite um número com três algarismos por favor: ");

       int valor = numero.nextInt();
             
       resto=valor%10; 

       valor=valor/10;

       System.out.print(resto); 

       resto=valor%10; 
       valor=valor/10;

       System.out.print(resto);     

       System.out.print(valor); 
   

}
}

