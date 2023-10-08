/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAYCON
 */
public class Inicio {
  
public static void qNegSPos(double vet[]) {
  int qNeg = 0;
  double menorNeg=0;
  double sPos = 0;
  for (int i = 0; i < vet.length; i++) {
 if (vet[i] < 0) {
  qNeg++;
  if (menorNeg>vet[i]) { 
   
    menorNeg= vet[i];
  }
        
 } else {
  sPos += vet[i];
 }
  }
  System.out.println("quantidade negativos = " + qNeg);
  System.out.println("soma positivos = " + sPos);
  System.out.println("soma positivos = " + menorNeg);
 }

  public static void main(String[] args) {
        
     double [] vet = {1,4,-12,7, -5, -2, 10, 13};
    qNegSPos(vet);
}
}