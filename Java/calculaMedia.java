/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAYCON
 */
public class calculaMedia {
    
 //método recursivo
 public static int multiReq(int a, int b) {
  if (b == 1)
   return a;
  return a + multiReq(a, b - 1);
 }
 public static void main(String[] args) {
  //chamada ao método
  System.out.println(multiReq(3, 4));
 }
}

